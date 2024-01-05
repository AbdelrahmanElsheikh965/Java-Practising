import java.util.List;

public class TestClass {
    
    /* Solution 1 */
    public static <T extends Shape> void accepts_1(List <T> myList){
        for(T listElement : myList)
            System.out.println(listElement.draw());
    }

   /* Solution 2 using WildCards */ 
    public static void accepts_2(List <? extends Shape> myList){
        for(Object listElement : myList)
            if (listElement instanceof Rectangle || listElement instanceof Circle) {
                System.out.println(((Shape) listElement).draw());
            }
    }

}
