## Strategy Design Pattern
The strategy design pattern is discussed in the _Head First Design Patterns_
book in the context of a Duck Simulator application. The problem that
the hypothetical programmer is facing is the following: They are trying
to achieve code re-usability via inheritance from an _Abstract Base Class_ (ABC).
There are some problems with using inheritance to share behaviour:
- The behaviour, if implemented, is common to all subclasses of the ABC, potentially
leading to undesired side effects, like flying rubber ducks.
- On the other hand, if the behaviour is left abstract, then it's necessary
to implement it in the subclasses, completely defeating the point of code reuse.
- Another issue with sharing behaviour via subclassing is that it's a static
mechanism, determined at compile time. Therefore, it can't be dynamically adjusted.
- Adding some new behaviour to the ABC will affect all subclasses.

The above problems tell us that in this case there is a better way of
achieving code reuse. That way is composition. The strategy design
pattern is essentially a pattern that realizes the following design principles:
- Prefer composition to inheritance, due to the aforementioned reasons
- Identify and encapsulate the parts that vary
- Program to an interface rather than an implementation

That is what's realized in the Duck Simulation design.

In our case, the parts that vary among ducks are the flying behaviour
and the quacking behaviour. We thus hide the different implementations
of each behaviour behind interfaces `FlyBehaviour` and `QuackBehaviour`,
therefore abiding by the principle of encapsulating the part that varies.

Then we write different implementations of these abstract behaviours,
and use composition to give each actual duck its flying and quacking
behaviours, as appropriate. We also add getters and setters,
so we can dynamically adjust these behaviours, at runtime.

## FINALLY
We give the formal definition of the Strategy design pattern:
The strategy patterns encapsulates a family of implementations,
in our case different flying implementations, hides them behind an interface,
making them interchangeable, and allows this interchangeability through
composition.

No more flying rubber ducks! 🚀🦆