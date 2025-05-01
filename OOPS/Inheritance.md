## Inheritance

- Inheritance in Java is a fundamental object-oriented concept that ***allows one class to acquire the properties and behaviors (methods and fields) of another class***.
- It enables code reusability and establishes a ***hierarchical relationship between classes***.
- In Java, inheritance is achieved using the ***extends*** keyword.

### Types of Inheritance
There are generally four main types of inheritance in Java:
1. **Single Inheritance**
2. **Multilevel Inheritance**
3. **Hierarchical Inheritance**
4. **Hybrid Inheritance** 

### 1. Single Inheritance
- In single inheritance, a class inherits from only one superclass
- Simplest form of inheritance

### Example
```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal class
        dog.bark(); // Defined in Dog class
    }
}
```
### Output
```java
This animal eats food
The dog barks
```
### 2. Multilevel Inheritance
- In multilevel inheritance, a class is derived from a class that is also derived from another class, forming a chain
### Example
```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void breathe() {
        System.out.println("This mammal breathes air.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();     // Inherited from Animal
        dog.breathe(); // Inherited from Mammal
        dog.bark();    // Defined in Dog
    }
}
```
### Output
```bash
This animal eats food
This mammal breathes air
The dog barks
```
### 3. Hierarchical Inheritance
- In hierarchical inheritance, multiple classes inherit from a single superclass
- Each subclass inherits from the same superclass
### Example
```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
```
### Output
```java
This animal eats food
The dog barks
This animal eats food
The cat meows
```
### 4. Hybrid Inheritance
- It is a combination of two or more types of inheritance
- Java does not support hybrid inheritance directly due to lack of multiple inheritance for classes, but achieved by ***interface***
### Example
```java
interface Animal {
    void eat();
}

class Mammal {
    void breathe() {
        System.out.println("This mammal breathes air.");
    }
}

interface Pet {
    void play();
}

class Dog extends Mammal implements Animal, Pet {  // Hybrid inheritance
    public void eat() {
        System.out.println("The dog eats food.");
    }

    public void play() {
        System.out.println("The dog loves to play.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breathe(); // Inherited from Mammal class
        dog.eat();     // Inherited from Animal interface
        dog.play();    // Inherited from Pet interface
    }
}

```
### Output
```java
The dog eats
The dog plays
```
***Java does not support multiple inheritance*** (where a class inherits from more than one superclass) to avoid ambiguity and complexity.

### Multiple Inheritance
- In Java, multiple inheritance can be ***achieved using interfaces***, where a ***single class can implement multiple interfaces to inherit their behaviors***. - - This allows the class to gain functionality from multiple sources.

- This allows the class to gain functionality from multiple sources.

### Example
```java
interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {  // Multiple inheritance using interfaces
    public void eat() {
        System.out.println("The dog eats food.");
    }

    public void play() {
        System.out.println("The dog loves to play.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal interface
        dog.play(); // Inherited from Pet interface
    }
}
```
### Output
```java
The dog eats food
The dog loves to play
```