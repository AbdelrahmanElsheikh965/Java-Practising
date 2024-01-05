import exec.*;

/*
    * Create your own exception class and write down 2 other classes, 
    * The 1st will contain 3 methods throwing your newly created exception class. 
    * The 2nd class will be calling the methods that throws exception using the try-catch-finally block.
 */
public class Main{
    public static void main(String args[])
    {
        TestClass testObj = new TestClass();
        Consumer cons = new Consumer();

        // Bad Inputs
        System.out.println("Bad Inputs-----------------------------------------");
        cons.divideTest(testObj, 4, 0); // Divide by zero 
        cons.connectToDBTest(testObj, "abc");   // letters < 10
        cons.checkFileTest(testObj, 'e');   // not allowed character

        // Happy scenario
        System.out.println("-----------------------------------------Happy scenario"); 
        cons.divideTest(testObj, 4, 1); 
        cons.connectToDBTest(testObj, "aklklklkkllkls");
        cons.checkFileTest(testObj, 'k');

    }
}