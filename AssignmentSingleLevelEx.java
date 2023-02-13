package Inheritance;

class object1 {

    // calculateArea is member of object1 class
    public int calculateArea(int length,int breadth) {
            return length * breadth;
    }
}

// Inheriting Object1 member using extends keyword
public class AssignmentSingleLevelEx extends object1 {

    public static void main(String[] args) {
    	AssignmentSingleLevelEx rectangle = new AssignmentSingleLevelEx();  // creating object of child class
        System.out.println("Area of rectangle :: "+ rectangle.calculateArea(10,5)); // calcualateArea method accessible to rectangle class
    }

}