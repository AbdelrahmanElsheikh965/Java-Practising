# Java Streams


Streams means process data/or/some operations to be performed on a portion of data
 
Collection means a store/represent data in a group of objects i.e.(set, list or HashMap) as a single entity.


> import java.io.Stream;		// work with files   
> import java.util.Stream;	// work with Streams

### Filter VS Map

filter should happen based on a certain condition

1. Filter(condition) : from a collection of data filter the data based on a certain condition and store the data in another  collection and maybe this collection/data used for another purpose.

Example : get only odd/even numbers from a collection and store them in another collection.

2. Mapping/Map: we will get each and every element or an object from a collection of data and apply a certain operation and store the result in another collection and store the data for other purposes.

Example : add 5 to every element in the collection and store the result in another collection may be used for other purposes.


> in Map -> same number of elements/data is the same as it's only modified
> in Filter -> number of elements/data is changed/reduced 

by using these 2 mechanisms streams will process the data from the collection.

<hr />

when using streams:  we don't directly process the data from/in the collection but, we first put it in the streams and then do processing on it and suppose streams are like pipelines and whatever operations performed do not affect source data[collection]


Misc Methods to process the data from the **Stream** itself.

#### Sorted()
we can sort the data after filter()ing or map()ing.
#### Count()
we can count how many values we got after filter()ing or map()ing. 
#### Collect()
we can collect the data and store it in another collection after filter()ing or map()ing.
#### Distinct()
we can get the unique data in the new collection after filter()ing or map()ing.
#### ForEach()
we can read every value from the stream/collection.
#### min()
we can get the minimum value out of a collection
#### max()
we can get the maximum value out of a collection








