public class Main{
    
    /*
     * Create a generic class that could be used to represent complex numbers.
     * Create some generic methods that represent basic arithmetic operation on complex(addition, subtraction).   
     */
    public static void main(String[] args) {
        Complex <Integer> c1 = new Complex<>(4, 5);
        System.out.println(c1.add(99, 1));

        Complex <Integer> c2 = new Complex<>(4, 5);
        System.out.println(c2.subtract(99, 1));
    }
}