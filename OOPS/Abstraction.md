## Abstraction
- It ***hides implementation details and provides only the necessary functionality***. 
- It's all about simplifying complexity and focusing on what the object does.
- Abstraction in Java can be achieved using ***abstract classes or interfaces***.
  
### Abstract Class:

- An abstract class in Java is a class that is declared with the ***abstract keyword***.
- It can have abstract methods (methods without implementation) as well as concrete methods (methods with implementation).
- Abstract classes are designed to be inherited by other classes that provide implementations for the abstract methods.

### Syntax
```bash
abstract class ClassName {
    // Abstract method (without implementation)
    abstract returnType methodName(parameters);

    // Concrete method (with implementation)*
    returnType methodName(parameters) {
        // Method body
    }
}
```
### Example 1: Using Abstract Class
```bash

// Abstract class
abstract class Vehicle {
    // Abstract method (no implementation)
    public abstract void start();

    // Concrete method
    public void stop() {
        System.out.println("The vehicle stops.");
    }
}

// Subclass providing implementation of abstract method
class Car extends Vehicle {
    public void start() {
        System.out.println("The car starts.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle();  // Compilation error: cannot instantiate abstract class

        Car car = new Car();  // Create an instance of Car (which inherits from Vehicle)
        car.stop();           // Output: The vehicle stops.
        car.start();          // Output: The car starts.
    }
}

```
Output
```bash
The vehicle stops.
The car starts.
```

### Interface:

- An interface is a completely ***abstract class*** that contains only ***abstract methods*** (no implementation).
- It can only contain method declarations (from Java 8 onwards, it can have default methods and static methods).
- Interfaces use the ***interface*** keyword.
- Interfaces support ***multiple inheritance***, allowing a class to implement more than one interface.

### Example 2: Using Interface
```bash
// Interface
interface Vehicle {
    // Abstract method
    void start();

    // Default method (Java 8+)
    default void stop() {
        System.out.println("The vehicle stops.");
    }
}

// Class implementing the interface
class Car implements Vehicle {
    public void start() {
        System.out.println("The car starts.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();  // Create an instance of Car (which implements Vehicle)
        car.start();          // Output: The vehicle starts.
        car.stop();           // Output: The car stops.
    }
}

```
Output
```bash
The vehicle starts.
The car stops.
<<<<<<< HEAD
```
=======
```
>>>>>>> 1a8e806bf434ffa7f19e0596ad77b261852c819d
