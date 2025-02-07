## Access Modifiers in Java
Access modifiers determine the visibility of classes, methods, and variables in Java. There are four main access modifiers:

- public
- private
- protected
- default (no modifier)

## 1. Public 
The public modifier allows classes, methods, and variables to be accessed from any other class or package.

### Example:
```bash
public class Car {
    public String brand;  // Public field

    public void display() {  // Public method
        System.out.println("Car brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // Create an instance of Car
        myCar.brand = "Toyota"; // Access public field
        myCar.display();        // Call public method
    }
}
```

## 2. Private
- The private modifier restricts access to the class, method, or variable it is applied to. 
- It can only be accessed within the class itself.
### Example
```bash
public class Car {
    private String brand;  // Private field

    // Public method to set the private field
    public void setBrand(String carBrand) {
        this.brand = carBrand;  // Accessing private field within the same class
    }

    public void display() {
        System.out.println("Car brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Toyota"); // Set the brand using public method
        myCar.display();          // Call public method to display the brand
        // System.out.println(myCar.brand); // Error: 'brand' is private
    }
}
```

## 3. Protected
The protected modifier allows access to the class, method, or variable it is applied to from the same package and subclasses, even if the subclass is in a different package.
```bash
class Vehicle {
    protected String brand;  // Protected field

    protected void displayBrand() {  // Protected method
        System.out.println("Brand: " + brand);
    }
}

public class Car extends Vehicle {
    public void setBrand(String carBrand) {
        this.brand = carBrand;  // Accessing protected field from parent class
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Toyota"); // Set brand using method
        myCar.displayBrand();     // Call protected method to display brand
    }
}
```
## 4. Default (No Modifier)
The default access modifier (also known as package-private) means that the class, method, or variable is accessible only within the same package.
```bash
class Car {
    String brand;  // Default access modifier

    void display() {  // Default access modifier
        System.out.println("Car brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota"; // Accessing default field within the same package
        myCar.display();        // Calling default method within the same package
    }
}
