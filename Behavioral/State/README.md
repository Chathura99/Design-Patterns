The State pattern is a behavioral design pattern that allows an object to change its behavior based on its internal state. It's used to encapsulate the behavior of an object and separate it from the object's state. This makes it easier to add new states and behaviors to an object without having to make changes to the object's existing code.


In this example, the StartState and StopState classes are concrete implementations of the State interface. The StartState class defines a behavior that prints "Player is in start state" and the StopState class defines a behavior that prints "Player is in stop state".

The Context class holds a reference to the current State object and delegates all behavior to that State object. The setState method is used to change the current state of the Context object, and the getState method is used to retrieve the current state of the Context object.

The StatePatternDemo class creates a new Context object, creates two State objects (StartState and StopState), and sets the current state of the Context object to each of these State objects. When the doAction method is called on the current State object, the corresponding behavior is executed.