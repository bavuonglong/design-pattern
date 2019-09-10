# Object Pool

### What is Object Pool

* In our system if cost of creating an instance of a class is high and we need a large number of objects of this class for short duration, then we can use object pool.

* Here we either pre-create objects of the class or collect unused instances in a memory cache. When code need an object of this class we provide it from this cache.

* One of the most complicated patterns to implement efficiently ( without defects)


### Implement object pool

* We start by creating class of object pool
    + A thread-safe caching of objects should be done in pool.
    + Methods to acquire and release objects should be provided & pool should reset cached objects before giving them out.

* The reusable object must provide methods to reset its state upon "release" by code.

* We have to decide whether to create new pooled objects when pool is empty or to wait until an object becomes available. Choice is influenced by whether the object is tied to a fixed number of external resources.


### Implementation Considerations

* Resetting object state should NOT be costly operation otherwise you may end up losing your performance saving.

* Pre-caching objects; meaning creating object in advance can be helpful as it won't slow down the code using this objects. However it may add-up start up time and memory consumption.

* Object pool's synchronization should consider the reset time needed and avoid resetting in synchronized context if possible.

### Design Considerations

* Object pool can be parameterized to cache and return multiple objects and the acquire method can provide selection criteria.

* Pooling objects is only beneficial if they involve costly initialization because of initialization of external resource like a connection or a thread. Don't pool objects JUST to save memory, unless you are running into out of memory errors.

* Do not pool long lived objects or only to save frequent call to new. Pooling may actually negatively impact performance in such cases.

### Examples

*  Using object pool for saving memory allocation and GC cost is almost deprecated now. JVMs and hardware are more efficient and have access to more memory now.

*  However it is still a very common pattern when we are interacting with external resources like threads, connections.

*  java.util.concurrent.ThreadPoolExecutor is an example of object pool pattern with pools threads. Even though we can directly use this class, you'll often use it via ExecutorService interface using this method like Executors like newCachedThreadPool()


### Pitfalls

* Successful implementation depends on correct use by the client code. Releasing objects back to pool can be vital for correct working.

* The reusable object needs to take care of resetting its state in efficient way. Some objects may not be suitable for pooling due to this requirement.

* Difficult to use in refactoring legacy code as the client code and reusable object both need to be aware3 of object pool.

* You have to decide what happens when pool is empty and there is a demand for an object. You can either wait for an object to become free or create a new object. Both options have issues. Waiting ca have severe negative impact on performance.

* If you create new objects when code asks for an object and non are available then you have to do additional work to maintain or trim the pool size or else you'll end up with very large pool.