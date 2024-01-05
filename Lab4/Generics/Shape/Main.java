import java.util.ArrayList;

public class Main {
    /* 
     * Create a base class named Shape that contains one abstract method draw().
     * Create two concrete classes (Rectangle and Circle) that extend Shape.
     * Create a test class that defines a method that accepts a list that contains only child classes of shape.
     * Test your method by creating two ArrayList of Rectangle and shapes and pass them to the generic method.
     */
    public static void main(String[] args) {
        ArrayList<Rectangle> rl = new ArrayList<>();
        Rectangle r = new Rectangle();
        rl.add(r);
        
        ArrayList<Circle> cl = new ArrayList<>();
        Circle c   = new Circle();
        cl.add(c);

        TestClass.accepts_1(rl);  // Rectangle List
        TestClass.accepts_1(cl);  // Circle List

        TestClass.accepts_2(rl);  // Rectangle List
        TestClass.accepts_2(cl);  // Circle List

    }

    
}