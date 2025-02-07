## Polymorphism
- Polymorphism is the ability of an object to take on many forms.
- It allows methods to perform differently based on the object calling them.
  
### Types of polymorphism
1. **Compile-Time Polymorphism (Static Polymorphism)** – Also called method overloading.
2. **Run-Time Polymorphism (Dynamic Polymorphism)** – Also called method overriding.

### 1. Method overloading(Compile-Time Polymorphism)
- Method overloading occurs when a ***single class contains multiple methods with the same name but different parameter lists***. 
- This allows methods to perform similar functions with different types or numbers of arguments.
- The compiler determines which method to call based on the method signature (name + parameter list).

### Example
```bash
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (overloading the add method)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values (overloading with different parameter types)
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.add(10, 20));  // Calls first add method
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));  // Calls second add method
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5));  // Calls third add method
    }
}
```
Output
```bash
Sum of two integers: 30
Sum of three integers: 60
Sum of two doubles: 31.0
```
### 2. Method overriding(Run-Time Polymorphism)
- Method Overriding occurs when a subclass provides a specific implementation of a method that is already defined in its parent class.
- In this case, the method call is determined at runtime based on the object's actual type.

### Example
```bash
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape myShape;         // Declare a Shape reference

        myShape = new Circle();  // Shape reference to Circle object
        myShape.draw();          // Outputs "Drawing a circle"

        myShape = new Rectangle(); // Shape reference to Rectangle object
        myShape.draw();           // Outputs "Drawing a rectangle"
    }
}
```
Output
```bash
Drawing a circle
Drawing a rectangle
```