# Decorator Design Pattern
This pattern is discussed in the book in the following context: You have a cafe
that offers beverages like latte, decaf, espresso, and other non-caffeinated
beverages like green tea. The cafe wants to robustly offer its clients the option
of condiments, like mocha, soy, whip and so on. So how can the cafe offer beverages
with condiment options in a robust, scalable way? Let's try to come up with a maintainable
design.

One possibility is to have an abstract base `Beverage` class, and concrete
subclass for _each_ beverage _and_ for _each_ choice of condiments, but that
clearly leads to a combinatorial explosion in the number of classes.

Another possibility is for the abstract beverage class to hold boolean instance
variables that indicate the condiment choices:
```java
public abstract class Beverage {
    public boolean hasSoy();
    public boolean hasMocha();
    public boolean hasWhip();
    
    // ...
    
    // setters

    // calculate beverage cost plus condiments
    // _e.g. 1.99 + priceSoy * hasSoy + priceMocha * hasMocha ...
    public abstract double getCost();

    // depends on condiments
    // e.g. returns espresso double mocha
    // disclaimer: I don't know anything about coffee 
    public abstract String getDescription();
}
```
This immediately violates the Open-Closed principle: Classes should be open
for extension, but closed for modification. Every time the shop offers a new
condiment, we'll have to _open up_ our Beverage class, and add some boolean flags,
and modify the `getCost` and `getDescription` functions, with a potential of
introducing bugs.

Another problem is what about beverages that don't admit whip or other condiments?
Like green tea, for example. That's a problem we've already encountered with using
inheritance to share behaviour: you get potentially undesirable side effects for
some subclasses.

Additionally, if the prices of the condiments also change, we'll have to open
up our beverage class again, to change the prices.

One edge case the above design doesn't address is: what if a customer wants double
mocha? That can't be accommodated by a single `hasMocha` flag.

Clearly, the above design can't meet the needs of a growing shop dynamically
changing and updating its offerings! We'll need to come up with a better design
that supports change.

We will use composition and delegation‡. Again, we are favoring composition over
inheritance because it allows us to add new functionality to existing designs,
like the `Beverage` class, by extending it, rather than directly modifying it.
It allows us to add functionality that the author of the base class didn't even
think of, and allows us to change behaviour dynamically, at runtime, whereas
inheritance is a static, compile-time mechanism.
  
What does our proposed solution, the Decorator design pattern, look like?

- `Beverage` is an abstract base class, with concrete subclasses like espresso.
- `CondimentDecarotor` is an abstract class that _extends_ beverage, with concrete 
  subclasses like `Mocha` and `Whip`
- `CondimentDecorator` is also composed with and holds a reference to an underlying
`Beverage`
- `Mocha` and `Whip`, the concrete decorator subclasses, ALSO implement the abstract
`Beverage` interface. We are thus using inheritance. However, we are not using
  inheritance to add new functionality. We are simply using inheritance to achieve
  type matching. This means that any code that uses the existing `Beverage` abstraction,
  can have the condiment decorators as drop-in replacements!
- A call to `getCost` on the condiment decorator delegates to `getCost` on the
  `Beverage` the decorator is composed with, and then adds the cost of the condiment
- A call to `getDescription` on the condiment decorator delegates to `getDescription`
  on the `Beverage` the decorator is composed with, and adds the description of the condiment
- Many decorators can be nested, like onion layers, since each decorator itself 
  satisfies the `Beverage` interface! So the `Beverage` instance held by each decorator
  can itself just be a decorator, since decorators satisfy the interface they are decorating!
  
The above design gives us the robustness we've been looking for!

- Adding a condiment is as simple as implementing a new concrete subclass
of `CondimentDecorator`.
- To change the properties of an existing condiment, like its price, we simply
change it in the single condiment concrete class, like Mocha.
- Green tea no longer has anything to do with Mocha, since we're using composition,
not inheritance, so we don't have side effects for all beverages
- We can easily have double mocha latte, just decorate a latte with a Mocha
twice, and through delegation and composition, the right price will be calculated.
- We no longer have to open up the beverage class, as it doesn't know anything
whatsoever about condiments. It's closed for modification!
  
The decorator pattern does have some negatives, like having to create more
intermediate objects when decorating, but that can be handled with factories.
  
This could've been definitely better and more succintly explained with a class
diagram, but for that just read the book. I'm honestly just writing this for my
own benefit, as writing stuff out helps me get it better. 😎


‡ We've already seen delegation in the context of Duck Simulator fly behaviour:
The duck delegated its flying to the `flyBehaviour` interface it was composed with,
similarly for the quacking behaviour.

