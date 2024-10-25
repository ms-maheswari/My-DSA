## Method
- A method is a block of code that ***performs a specific task*** and can be invoked or called when needed.
- Methods help you organize code into reusable and manageable pieces.
- They are defined within a class and can manipulate the data (fields) of the class.
  
### Syntax
```bash
returnType methodName(parameters) {
    // Method body
    // Code to exeacute when the method is called
}
```
- **returnType:** The data type of the value the method returns. If the method does not return any value, we can use void.
- **methodName:** The name of the method.
- **parameters:** A list of input values (arguments) that the method accepts (optional).
- **Method body:** The code that will be executed when the method is called.
  
### Types of Methods
1. **BuildIn Method** 
2. **User Defined Methods**

## BuildIn Method
Methods provided by Java libraries (Eg.Math, String, and Arrays)

### Example
```bash
public class BuiltInMethodExample {
    public static void main(String[] args) {
        int maxNumber = Math.max(10, 20);  // Built-in method from Math class
        System.out.println("Max Number: " + maxNumber);
    }
}
```
Output:
```bash
Max Number: 20
```

## User Defined Method
Methods created by the user.

### Types of User Defined Methods
1. **Static Methods:** Belong to the ***class*** and are called using the ***class name***. 
2. **Non-Static Methods:** Belong to ***objects*** and are called using the ***object reference***. 

## Static Method
- Belongs to a class, not to objects of the class.
- Can be called directly using the class name, without needing to create an object.
- Can access only static fields and static methods directly.
- It ***use static*** keyword.

### Example
```bash
class Calculation {
    // Static method
    public static int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = Calculation.add(3, 4);  // Calling static method using class name
        System.out.println("Addition is: " + result);
    }
}
```
Output
```bash
Addition is: 7
```
## Non-Static Method
- Belongs to an instance (object) of the class.
- Can access both static and non-static fields and methods.
- Requires creating an object of the class to be invoked.
- It does ***not use*** static keyword

### Example
```bash
class Calculation {
    // Non-static method
    public int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
       // Creating an object of the Calculation class
        Calculation cal = new Calculation();
        int result = cal.add(3, 4);  // Calling the non-static method using the object
        System.out.println("Addition Result: " + result);
    }
}
```
Output
```bash
Addition is: 7
```

