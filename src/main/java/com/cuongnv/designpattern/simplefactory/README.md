# Simple Factory

### Prerequisites


### Implementation Considerations

* Simple factory can be just a method in existing class. Adding a separate class however allows other parts of your code to use simple factory more easily.

* Simple factory itself doesn't need any state tracking so it's best to keep this as a static method.

### Design Considerations

* Simple factory will in turn may use other design pattern like builder to construct objects.

* In case you want ot specialize your simple factory in sub classes, you need factory method design pattern instead.

### Examples

* The java.text.NumberFormat class has getInstance method, which is an example of simple factory


### Compare & Contrast with Factory Method Pattern

Simple Factory:

* We simply move our instantiation logic away from client code. Typically in a static method.

* Simple factory knows about all classes whose objects it can create.

Factory Method:

* is more useful when you want to delegate object creation to subclasses.

* we don't now in advance about all product subclasses.

### Pitfalls

The criteria used by simple factory to decide which object ot instantiate can get more convoluted/complex over time. If you find yourself in such situation
the use factory method design pattern.

