## Class

- A class is a blueprint from which objects are created.
- It can contain fields (attributes) and methods (functions) to define the behavior and state of objects
- A class is the fundamental building block of object-oriented programming in Java, and it allows you to group related data and functionality together.

#### Basic Structure of a Class
A class typically contains:

- **Fields** - Variables that hold data
- **Methods** - Functions that operate on the data
- **Constructors** - Special methods to initialize objects.
  
### Syntax:
  ```bash
  class ClassName {
    // Fields (attributes)
    dataType fieldName;

    // Constructor
    public ClassName() {
        // Constructor body
    }

    // Methods (behaviors)
    returnType methodName(parameters) {
        // Method body
    }
}

 ```
## Method
- A method is a block of code that performs a specific task and can be invoked or called when needed.
- Methods help you organize code into reusable and manageable pieces.
- They are defined within a class and can manipulate the data (fields) of the class.
```bash
returnType methodName(parameters) {
    // Method body
    // Code to execute when the method is called
}
```
## Object

- An object in Java is an instance of a class.
- Objects represent real-world entities, and they hold both data (attributes) and behaviors (methods).
- In Java, objects are used to interact with and manipulate data in a structured way.

To create an object, you need to use the new keyword along with the class constructor.
```bash
ClassName objectName = new ClassName();
```
## Constructors
- A constructor is a special method used to initialize objects. 
- It has the same name as the class and does not return a value.
```bash
public ClassName() {
   // Constructor body
}
```
## this
- The **this** keyword in Java is a reference variable that refers to the current object.
- It can be used for invoking constructors, returning the current object, and passing the current object as an argument to a method.

### Example
```bash
// Defining a class named 'Car'
class Car {
    // Fields (attributes)
    String brand;
    int year;

    // Constructor to initialize the fields
    public Car(String carBrand, int carYear) {
        this.brand = carBrand;
        this.year = carYear;
    }

    // Method to display the cars details
    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
    }
}

// Main class to test the 'Car' class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", 2022);

        // Calling the method to display the cars details
        myCar.displayDetails();
    }
}
 ```

#### Output
```bash
Car Brand: Toyota
Manufacturing Year: 2022
```
