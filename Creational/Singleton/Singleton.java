package Creational.Singleton;

public class Singleton {
    private static Singleton instance;
    private static Object mutex = new Object();
 
    private Singleton(){}
 
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (mutex) {
                if (instance == null) 
                    instance = new Singleton();
            }
        }
        return instance;
    }
}


// In this example, the Singleton class has a private constructor, which ensures that no other class can instantiate it. 
// The getInstance method is a static method that returns the single instance of the class. If an instance does not exist, 
// it creates a new instance, and in the next call, it returns the previously created instance.

// Both the singleton1 and singleton2 refer to the same object and it will return true.

// Please note that, in real-world scenarios, it is often a good idea to make the Singleton class's fields and methods final 
// as it ensures that the class cannot be extended and that its methods cannot be overridden in a subclass