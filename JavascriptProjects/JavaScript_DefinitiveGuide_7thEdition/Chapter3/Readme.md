Javscript types are of two types : primitive , and object

* Primitive types include numbers, strings, booleans. 
Special JS valeus null and undefined are primitive values but not of the type numbers , strings and booleans 

* ES6 has a new special-purpose type known as Symbol.

* Any JS value that is not a number, string, boolean, symbol, null or undefined is an object.

An object is a collection of properties where each property has a name and a value ( primitive or object ). Global object ??

Types of object values : arrays, Global objects, Set , Map , typed arrays, RegExp , Date, Error 

* JS Functions & Classes are themselves values and can be manipulated by JS programs. They are specialized objects. 

* JS interpreter performs automatic garbage collection for memory management.
When a program no longer has any way to refer to a value , interpreter reclaims the memory it was occupying. 

* JS supports object-oriented programming style . Object types themselves define methods for working with values. 

* Technically JS objects only have methods. But numbers , strings , boolean and symbol values behave as if they have methods. 

Only null and undefined values don't have methods to invoke.

* JS objects are mutable , but primitive types are immutable. 

* JS liberally converts values from one type to another. If a program expects a string e.g. and you give it a number , it will automatically convert the number to string.