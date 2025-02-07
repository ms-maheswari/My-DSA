## Encapsulation

- Encapsulation is the mechanism of ***bundling the data (variables) and the methods (functions)*** that operate on the data into a ***single unit***, typically a class.
- It restricts direct access to some of the object's components, protecting the internal state of the object.
- It is achieved by making the class fields (variables) private and providing public getter and setter methods to access and modify the data

### Syntax 
```bash
class ClassName {
    // Private fields (variables)
    private DataType variableName;

    // Public getter method to access the private variable
    public DataType getVariableName() {
        return variableName;
    }

    // Public setter method to modify the private variable
    public void setVariableName(DataType variableName) {
        this.variableName = variableName;
    }
}
```
### Example
```bash
class Car {
    // Private fields
    private String model;
    private int year;

    // Getter method for 'model'
    public String getModel() {
        return model;
    }

    // Setter method for 'model'
    public void setModel(String model) {
        this.model = model;
    }

    // Getter method for 'year'
    public int getYear() {
        return year;
    }

    // Setter method for 'year'
    public void setYear(int year) {
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();

        // Using setter methods to set values
        myCar.setModel("Honda");
        myCar.setYear(2021);

        // Using getter methods to access the values
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Manufacturing Year: " + myCar.getYear());
    }
}
```
Output:
```bash
Car Model: Honda
Manufacturing Year: 2021
```
