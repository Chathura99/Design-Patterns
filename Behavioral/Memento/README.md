The Memento design pattern is a behavioral pattern that provides 
the ability to restore an object to its previous state (undo via rollback). 
It provides an undo mechanism for objects without violating encapsulation.

In this example, the Originator class creates and maintains a state, and the CareTaker class stores the previous states using the Memento class. The Originator can save its current state to a Memento object, and restore to a previous state by getting the state from a Memento object. The CareTaker is responsible for keeping track of all Memento objects and providing access to them as needed.