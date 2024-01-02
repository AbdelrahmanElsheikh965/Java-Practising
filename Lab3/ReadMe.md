# Packaging and Function Interfaces

This part for solving the following 2 questions in java.

• Develop an application to convert temperature from Centigrade to Fahrenheit using Function<T,R>
> Solved in degree package

> Function<T,R> means “Represents a function that accepts one argument and produces a result.”

function interface Contains method apply that takes a T argument and returns a value of type R.
Calls a method on the T argument and returns that method’s result.

• Use the interfaces in java.util.function to build an application that defines the roots of the quadratic equation and the roots could be computed by the following 


Formula :

![Alt text](image.png)


> Solved in equation package

To package using cmd run :

```
javac -d . file_1.java file_2.java
```