## Factory Design Patterns
This document covers the related factory design patterns: _Simple factory_,
_factory method_ and abstract factory_.

Let's start with the simple factory design pattern. The context in which
this arises in the book is the following: You have a concrete `PizzaStore`
class with a method `orderPizza` that creates a pizza, prepares it,
bakes it ... _etc_ so that it's ready for the customer. Now, the problem
with the `orderPizza` method is that it depends on all the concrete
pizza types, such as: `CheesePizza`, `PepperoniPizza`, `PineapplePizza`,
and so on. Therefore, if we want to offer new pizzas, or remove existing
pizza offerings, we'll have to _open up_ this `orderPizza` function and
update the pizza creation logic there. Similarly, there may be other
places where pizza creation is handled and needs to be updated, such as
a `PizzaShopMenu` class. Thus, we have two problems:
- Our `orderPizza` logic is not closed for modification, violating
the Open-Closed principle, which states that classes should be open 
  for extension and closed for modification. 
- We have code duplication of the non-trivial pizza creation logic.

The above two issues can be solved by the introduction of a `SimplePizzaFactory`.
This is a single-responsibility class that handles all the details of pizza
creation. If new pizzas are added or removed, they're modified in a single place,
the `SimplePizzaFactory`.

**A simple factory handles the creation of a family of concrete products
sharing a single abstraction**. In the above case, it handles the creation
of `CheesePizza`, `VeggiePizza` ... _etc_, all of which share the `Pizza`
abstraction. This make the `PizzaStore` simply a client of
of the `SimplePizzaFactory`, in that it calls its `createPizza` method.