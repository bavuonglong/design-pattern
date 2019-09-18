# Decorator pattern

### What is Decorator pattern

* When we want to enhance behaviour of our existing object dynamically as and when required then we can use decorator design pattern

* Decorator wraps an object within itself and provides same interface as the wrapped object. So the client or original object doesn't need to change.

* A decorator provides alternative to subclassing for extending functionality of existing classes.


### Implement Decorator Pattern

*  We starts with our component
    + Component defines interface needed or already used by client.
    + Concrete component implements the component.
    + We define our decorator. Decorator implements components and also needs reference to concrete component.
    + In decorator methods we provide additional behaviour on top that provided by concrete component.

* Decorator can be abstract as well & depend on subclasses to provided functionality.


### Implementation Considerations

* Since we have decorators and concrete classes extending from common component, avoid large state in this base class as decorators may not need all that state.

* Pay attention to equals and hashCode methods of decorator. When using decorators, you have to decide if decorated object is equal to same instance without decorator.

* Decorators support recursive composition, and so this pattern lends itself to creation of lots of small objects that add "just a little bit" functionality. Code using these objects becomes difficult to debug.

### Design Considerations

* Decorators are more flexible & powerful than inheritance. Inheritance is static by definition but decorators allow you to dynamically compose behaviour using objects at runtime.

* Decorators should act like additional skin over your object. They should add helpful small behaviours to object's original behaviour. Do not change meaning of operations.

### Examples

* Classes in Java's I/O package are great examples of decorator pattern.

* For example the java.io.BufferedOutputStream class decorates any java.io.OutputStream object and adds buffering to file writing operation. This improves the disk i/o performance by reducing number of writes.

### Compare & Contrast with Composite

* Decorator:
  + Intent is to "add to" existing behaviour of existing object.
  + Decorator can be thought as degenerate composite with only one component.

* Composite:
  + Composites are meant for object aggregation only.
  + Composites support any number of components in aggregation.


### Pitfalls

* Often results in large number of classes being added to system, where each class adds a small amount of functionality. You often end up with lots of objects, one nested inside another and so on.

* Sometimes new comers will start using it as a replacement fo inheritance in every scenario. Think of decorators as a thin skin over existing object.