# Java-Practising

A repo for tackling problems by trying various techniques, and different ways of thinking on how to solve problems using Java programming language.

## How to run java using cmd

before java -version 11   
	1.  javac fileName.java	(compile first)   
	2.  java arg_1 fileName.java OR java arg_1 fileName	(run means(interpret byte code))   

after java -version 11  
	java fileName.java	(this will compile and run (build and run))

 to package 2 classes files in the same directory
 	javac -d . Main.java Person.java


> NOTE: cls to clear screen

## Java Notes

Java is a strongly typed language
<hr />

Assignment 2 options

1. explicit int x = 4;    
2. implicit passing arguments to method when calling

<hr />

primitive data type store only 1 single value not complex objects although, Java is a pure OOP language based except part of primitive data type.

> main method is static as we don't have to instantiate an object to run/access it

Java Compiler (javac) won't let anyone exceed range limit of any data type, but c/c++ allow for changes according to execution environment.

short t => t is an identifier (variable
)

<hr />


Variable is the basic unit of storage.
name = identifier, data type and optional initialization
> type identifier [  = value ] [ , identifier [ = value ] ...];

<hr />

Automatic (implicit) Conversion (casting) done if
1. types are compatible i.e.(byte & int are integral data types)
2. destination type > source type i.e. (convert from byte to int)
called as **Widening conversion**

**Narrowing conversion** that needs explicit casting two types are 
compatible but source is bigger than destination
Example:
```
int a;
byte b;
b = (byte)a;			// Assigning bigger type into smaller one can cause data loss
``` 

> Rule lowest data type to perform arthimatic operation is int 
> so a widening conversion here will take place (implicitly)
> byte a = 100;
> byte b = 600;
> int result = (a*b)/2;

<hr />

2 types
primitive data (means int, char, long, double, ... built-in language)types
reference data types (means refer to another one => array of another type int arr[]
or user-defined class (data type) which contains/consists of primitive data types internally)

<hr />

int month_days[]; 	=>  until now nothing is allocated or so.
to link array with actual physical array you must allocate using **new** keyword
```
int years[];
years = new int[50];

first [] is empty but, second [] contains size
int month_days[] = new int[12]; 			// 	12 consecutive/contiguous location

int twoD [] [] = new int[4][5];
``` 
int is 4 bytes
further all elements are initialized according to corresponding data type
int => 0 (default by compiler)	| 		Boolean = false (default by compiler)
char => 0 (default by compiler)	| floating = 0.0 (default by compiler)

> Important NOTE: every variable in java has .length  variable feature to know its length
> Important NOTE: every variable in java has .length() feature to know its length


> **Any class in java is an instanceof Object** (class Object)


> Run Time Exceptions halt the execution of the Java program so, you shouldn't handle them with try{ }catch{ } block


<hr />

In Java, classes can be in the default package if no package is specified at the beginning of the source file. When classes are in the same directory and no package is declared, they are in the default package, and they can interact with each other directly without the need for import statements or explicit package references.

<> angle brackets  
T stands for type   
< T > Type Parameters


Generics don't work with primitive types like (int) but works with wrapper classes like(Integer)
< T > should be directly after the class name.

Simple Generics class that takes something in constructor and prints it

```
public class Printer<T>{

T someThing;

public Printer(T someThing){
	this.someThing = someThing;
}

public void print(){
	System.out.println(someThing);
	System.out.println(this.someThing);	 // we can do this too
}

}

in Main.java class file

Printer<Integer> p = new Printer<Integer>(23); // in older versions of java.
Printer<Integer> p = new Printer<>(23);
p.print();	// 23

```


we can specify bound for our generic class like this in type parameters
< T extends Animal >			// Animal is a class.
if a class and an interface then the class must come first or an error will occur.
< T extends Animal & Serializable >		// Serializable is an interface and takes **extends** yes.

### Lambda Expressions

any lambda expression maps to an implementation of a function interface.

<hr />

```
public interface Function_Interface{
	//
}

public class Main{
	public static void main(String args[]){
		// This is a reference to an interface.
		Function_Interface MyInter;						
	}
}
```
 
An example of single lambda expression
```
interface Greeting{
	public void greet();
}

public class Main{
	public static void main(String args[]){
		
		// Single line we don't have to type access specifier, name, type or return statement.		
		Greeting greeting = () -> System.out.print(65);	// Until now nothing is printed.

		// we have to call greet() first.
		greeting.greet();

	}
}
```

An example of inner class implementation
```
interface Greeting{
	public void greet();
}

public class Main{
	public static void main(String args[]){

			Greeting innerClassObj = new Greeting(){
				public void greet(){
				 System.out.print(65);
			}
		};		// Don't forget this semi-colon
	
		// we have to call greet() first.
		innerClassObj.greet();

	}
}
```


















