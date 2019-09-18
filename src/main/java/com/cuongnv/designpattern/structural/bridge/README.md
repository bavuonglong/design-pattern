# Bridge pattern

### What is Bridge pattern

* Our implementation & abstraction are generally coupled to each other in normal inheritance.

* Using bridge pattern we can decouple them so they can both change without affecting each other.

* We achieve this feat by creating two separate inheritance hierarchies; one for implementation and another for abstraction.

* We use composition to bridge these two hierarchies.


### Implement Bridge pattern

*  We starts by defining our abstraction as needed by client
    + We determine common base operations and define them in abstraction.
    + We can optionally also define a refined abstraction & provide more specialized operations.
    + Then we define our implementation next. Implementor methods do NOT have to match with abstractor. However abstraction can carry out its work by using implementor methods.
    + Then we write one or more concrete implementor providing implementation.

* Abstractions are created by composing them with an instance of concrete implementor which is used by methods in abstraction.


### Implementation Considerations

* In case we are ever going to have a single implementation then we can skip creating abstract implementor.

* Abstraction can decide on its own which concrete implementor to use in its constructor or we can delegate that decision to a third class. In last approach abstraction remains unaware of concrete implementors & provides greater de-coupling.

### Design Considerations

* Bridge provides great extensibility by allowing us to change abstraction and implementor independently.

* By using abstract factory pattern to create abstraction objects with correct implementation you can de-couple concrete implementors from abstraction.

### Examples

* An example of bridge pattern often given is the JDBC API. More specifically the java.sql.DriverManager class with the java.sql.Driver interface form a bridge pattern.

* The collections.newSetFromMap() method. This method returns a Set which is backed by given map object.

### Compare & Contrast with Adapter

* Bridge:
  + Intent is to allow abstraction and implementation to vary independently.
  + Bridge has to be designed up front then only we can have varying abstractions & implementations.

* Adapter:
  + Adapter is meant to make unrelated classes work together
  + Adapter finds its usage typically where a legacy system is to be integrated with new code.


### Pitfalls

* It is fairly complex to understand & implement bridge design pattern.

* You need to have a well thought out & fairly comprehensive design in front of you before you can decide on bridge pattern.

* Needs to be designed up front. Adding bridge to legacy code is difficult. Even for ongoing project adding bridge at later time in development may require fair amount of rework.