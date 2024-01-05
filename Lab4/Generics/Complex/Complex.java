import java.lang.Number;

public class Complex <T extends Number>{
    private T realPart;
    private T imaginaryPart;

    public Complex(T real, T imaginary){
        this.realPart       = real;
        this.imaginaryPart  = imaginary;
    }   

    /* Setter & Getter for real */
    public void setReal(T rVal)
    {
        this.realPart = rVal;
    }
    public T getReal()
    {
        return this.realPart;
    }

    /*  Setter & Getter for imaginary */
    public void setImaginary(T iVal){
        this.imaginaryPart = iVal;
    }
    public T getImaginary(){
        return this.imaginaryPart;
    }

    /*  basic arithmetic operations on complex Numbers */
    public <T extends Number> Integer add(T n1, T n2){
        return n1.intValue() +  n2.intValue();     // for example int
    }

    public <T extends Number> Double subtract(T n1, T n2){
        return n1.doubleValue() -  n2.doubleValue();     // for example double
    }

}
