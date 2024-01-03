import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)

// Specifying target types this annotation can be set for.
@Target( { ElementType.TYPE,  ElementType.METHOD,  ElementType.CONSTRUCTOR,  ElementType.FIELD } )

// Definition of the annotation 'Author'
@interface Author{
   int id();
   
   // optional age
   int age() default 18;

    // optional array of string nickNames
   String [] nickNames() default {"one", "two"};
}

@Author(id = 4)      // Class = TYPE
class Writer{

   int salary;

   @Author(id = 4)   // Member Level = FIELD
   String name;

   @Author(id = 4)   // Constructor = CONSTRUCTOR
   Writer(){
     //
   }

   @Author(id = 4)
   public static void testMethod() {   // Method = METHOD
      //
    } 

}


class AnnotationExample{

   public static void main(String args[]){
    
    Writer w = new Writer();
    
    try{
        
        // Object of reflection API so we can access annotation details/data.
        Class<?> c = w.getClass();
        
        // Get method which has an annotation.
        Method method = c.getMethod("testMethod");
        
        System.out.println("Method Found");
        
        // Get the annotation itself.
        Author A = method.getAnnotation(Author.class);
        
        // Printing data annotation saved previously.
        System.out.println("Author id : " + A.id());
        System.out.println("Author name : " + A.age());
        System.out.println("Author 1 arr : " + A.nickNames()[0]);

    }catch(NoSuchMethodException exception){
        System.out.print("Method not found!");
    }    
    
    // Looping over all fields in the class to which the object 'w' belong => Writer.
    for(Field field : w.getClass().getDeclaredFields()){
       System.out.println(field);
    }

    }
}


