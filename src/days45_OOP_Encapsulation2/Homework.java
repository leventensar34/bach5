package days45_OOP_Encapsulation2;

public class Homework {

    /*

    Declare instance variables length and breadth in the class.
    Declare a constructor with parameters
    Create a getter and setter methods
    Create Test class with an object
    Call getter method to read value
    Calculate area of the rectangle inside a predefined method and print it on the
console.
    Update the new value of variable using setter method.
    Call getter method to read the updated value.
    And calculate area again
     */

    private int lenght;
    private int breadth;

    public Homework(int lenght, int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
