# Facade pattern

### What is Facade pattern

* Client has to interact with a large number of interfaces and classes in a subsystem to get result. So client gets tightly coupled with those interfaces and classes. Facade solves this problem.

* Facade provides a simple and unified interface to a subsystem. Client interacts with just facade now to get same result.

* Facade is NOT just a one to one method forwarding to other classes.


### Implement Facade Pattern

*  We start by creating a class that will serve as a facade
    + We determine the overall "user cases"/tasks that the subsystem is used for.
    + We write a method that exposes each "ues case" or task.
    + This method takes care of working with different classes of subsystem.


### Implementation Considerations

* A facade should minimize the complexity of subsystem and provide usable interface.

* You can have an interface or abstract class for facade and client use different subclasses to talk to different subsystem implementations.

* A facade is not replacement for regular usage of classes in subsystem. Those can be still used outside of facade. Your system class implementations should not make assumptions of usage of facade by client code.

### Design Considerations

* Facade is a great solution to simplify dependencies. It allows you to have a weak coupling between subsystems.

* If your only concern is coupling of client code to subsystem specific classes and not worried about simplification provided by a facade, then you can use abstract factory pattern in place of facade.

### Examples

* The java.net.URL class is a great example of facade. This class provides a simple method called as openStream() and we get an input stream to the resource pointed at by the the URL object.

* This class takes care of dealing with multiple classes from the java.net package as well as some internal sun packages.

### Compare & Contrast with Adapter

* Facade:
  + Intent to simplify the usage of subsystem for client code.
  + Facade is not restricted by any existing interface. It often defines simple methods which handle complex interactions behind the scenes.

* Adapter:
  + Adapter is meant to simply adapt an object to different interface.
  + Adapter is always written to confirm to a particular interface expected by client code. It has to implement all the methods from interface and adapt them using existing object.


### Pitfalls

* Not a pitfall of the pattern itself but needing a facade in a new design should warrant another look at API design.

* It is often overused or misused pattern & can hide improperly designed API. A common misuse is to use them as "containers of related methods". So be on the lookout for such cases during code reviews.