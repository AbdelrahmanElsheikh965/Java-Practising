# Simple exception handling example in java

## Checked Vs Unchecked Exceptions

### Checked Exceptions
Java verifies checked exceptions at compile time either they are caught by try
The checked exceptions are those exceptions, as the name suggests, which a method must handle in its body or throw to the caller method so the caller method can handle it.

Checked exceptions are checked by the Java compiler, so they are called compile-time exceptions.

Java compiler forces us to handle these exceptions in some manner in the application code. We must handle these exceptions at a suitable level inside the application to inform the user about the failure and ask him to retry or come later.

Generally, checked exceptions denote error scenarios outside the program’s immediate control. These usually occur when the program interacts with other systems/network resources e.g. database errors, network connection errors, missing files, etc.

### Unchecked Exceptions

Unchecked exceptions are not checked by the compiler. These are called runtime exceptions. Unchecked exceptions will come into life and occur in the program, once any buggy code is executed.

In Java, the compiler does not force a member method to declare the unchecked exceptions into the method declaration. Generally, such methods almost always do not declare them.

Unchecked Exceptions are subclasses of RuntimeException class.

ArithmeticException
ArrayStoreException
ClassCastException
The strange thing is that RuntimeException is itself subclass of Exception i.e. all unchecked exception classes should have been checked exceptions implicitly, BUT they are not.”

For Compile, Package and Run
> javac -d . TestClass.java Consumer.java CustomException.java && java Main.java 
