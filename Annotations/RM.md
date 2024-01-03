# Annotations in Java

Java supports a feature called annotations which is used for presenting some data/details on different spots in your code.

These annotations have two types :
1. Predefined in java.
2. User-defined annotations
just like functions
9 general purpose.

Four are imported from java.lang.annotation: 
@Retention, @Documented, @Target, and @Inherited. 

Other five are
@Override, @Deprecated, @FunctionalInterface, @SafeVarargs, and @SuppressWarnings are included in java.lang.

Annotations can be declared just interfaces

```
@interface AnnotationName{
    
    // Mandatory data to be passed when calling the annotation
    int id;
    String name;

    // Optional data
    int salary default 999999;
    String [] phones default { "68485431" , "31687956" }
}
```

