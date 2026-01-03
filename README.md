OOP(Object-Oriented Programming) Concepts are as follows:

class - A Template for everything that we would like to do with our program.

Contains variables, constructors, Methods & blocks.

Without a class, we cannot write a Java Program.

Object - Also called as instance of the Class. A way to access the contents of a Class. They are stored in the heap memory by the reference variables.

Polymorphism - Best example would be method overloading which would require methods to have same names but different parameters.

Inheritance - Acquiring the methods, variables, constructors of a Parent Class by the Child Class is Inheritance.

Abstraction- It is hiding essential details. It can be achieved by abstract classes & interfaces.

Encapsulation - It means the 4 Access modifiers in Java namely public, private, default & protected.

Data Type : A Data type is used for classification of variables based on the value & the various operations (mathematical, logical or relational) that can be performed on it.

Java is a Strongly Typed Language . It means that we need to provide a data type for every variable we declare in a class.

There are 2 kinds of Data Types: Primitive and Non-Primitive

Non-Primitive : class, interface, array, String

Primitive : Integers, Decimals, Characters & Boolean.

Integers : byte, short, int, long

byte : Size of byte is 2 power 8. There will be 256 values. Range is -128 to -1 & 0 to 127.

short : Size of short is 2 power 16. There will be 65536 values. Range is -32768 to -1 & 1 to 32767.

int : Size of int is 2 power 32.

long : Size of long is 2 power 64.

Decimals : float & double.

float : Size of float is 2 power 32.

double : Size of double is 2 power 64.

char : Size of char is 2 power 16.

Refer to the following link for the various characters defined in Java:

https://www.ssec.wisc.edu/~tomw/java/unicode.html

boolean : It accepts only true or false.

dataType identifier = value;

Identifier is the name of the variable.

int x = 100;

This is called Declaration of int variable x & initialising with value 100.

Type Casting: We can always assign int to long automatically but not the other way.

Below represents the type casting in Java:

                   Narrowing Type Casting---------------->
------------>----------->------------->------------->-------------->------------>

double ---> float ---> long ---> int ---> short ---> byte

<-----------<-----------<-------------<-------------<--------------<------------<---

                    <--------------Widening Type Casting
To execute a program on command line, type javac <fileName>.java. This generates a .class file which has the bytecode which is platform independant.

Executing the .class file using java <fileName> command would give us the output. The .class file is executed by the JVM (Java Virtual Machine).

Java Keywords:

keywords

Arrays: Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

We can access elements in an Array using Index of the Array.

Array Indexes start rom Zero (0) and the highest index is always Array Size minus 1.

To execute a program on command line, type javac <fileName>.java. This generates a .class file which has the bytecode which is platform independant.

Executing the .class file using java <fileName> command would give us the output. The .class file is executed by the JVM (Java Virtual Machine).

Arrays: Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

We can access elements in an Array using Index of the Array.

Array Indexes start rom Zero (0) and the highest index is always Array Size minus 1.

To execute a program on command line, type javac <fileName>.java. This generates a .class file which has the bytecode which is platform independant.

Executing the .class file using java <fileName> command would give us the output. The .class file is executed by the JVM (Java Virtual Machine).

Object - Also called as instance of the Class. A way to access the contents of a Class. They are stored in the heap memory by the reference variables.

Example: A TV Remote. 1 remote for all the functions/features of a TV. A Class can have multiple objects also.

Use a ' . ' operator to access the variables and methods inside a class.

Constructors: Code which executes just before the creation of an Object.

Constructors have the same name of that of the class.

Construcotrs do not have return types but can have one of the 4 access modifiers.

Constructors should be called inside the method (during object creation).

finalize(): A method that is used to perform cleanup activity before destroying any object. It is called by Garbage collector before destroying the object from memory.

Wrapper Classes: Mechanism to convert Primitive Datatype to Object and Object to Primitive Datatype.

Polymorphism - Best example would be method overloading which would require methods to have same names but different parameters.

Method Overloading: Two or more methods having same method name but different parameters. Method Overloading is not dependant upon the return types.

Also, called as Compile Time Polymorphism.

We can overload constructors also.

Also, requires understanding of methods, return types & constructors.

static Keyword: static keyword is mainly used for memory management.

We can have static variables, methods, blocks and classes.

If a variable/method is declared as static, we do not need an object to access them inside the main method.

We cannot create a static variable inside main method or any other method.

We can overload static methods as well.

static blocks are defined outside the main method and also not inside any method.

We cannot define a class as static just like that. Only nested classes can be static. However, we cannot write static methods inside a nested Class as of Java 8. We can write static methods inside a nested Static Class.

Inheritance- Acquiring the methods, variables, constructors of a Parent Class by the Child Class is Inheritance.

We can inherit everything from a Parent/Super class except for those declared as private using the extends keyword.

We can update the contents of an extended method in the sub-class/child class by overriding the parent class methods.

We cannot override static methods.

Overriding is Run Time Polymorphism.

Types of inheritance:

Single Level Inheritance:

A -> B

The above means that class B extends A.

Multi Level Inheritance:

A -> B -> C

The above means that we have 3 classes as follows: class A, class B extends A, class C extends B.

Hierarchical Inheritance:

We have 4 classes as follows: class A, class B extends A, class C extends A, class D extends A.

Java does not support Multiple Inheritance. Meaning that a class cannot extend more than one class. Inheriting multiple classes would give rise to Deadly Diamond of Death.

this Keyword: Used to refer to the current class variables, methods & constructors.

super Keyword: Used to refer to the Parent class variables, methods & constructors.

final Keyword: There are certain implementations for this.

If a class is declared final, it cannot be extended/inherited.

If a variable is declared final, it's value cannot be changed again. static final is used to declare constants.

If a method is declared final, it cannot be overridden.

Abstraction- It is hiding essential details. It can be achieved by abstract classes & interfaces.

Requires understanding of abstract classes, interfaces, inheritance & types of inheritances,multiple inheritance & implements keyword.

abstract class: We can declare an abstract class using the abstract keyword.

abstract can have concrete as well asabstract methods.

We cannot instantiate/create an object for an abstract class. They need to be inherited.

abstract methods: Methods declared using the abstract keyword. They do not have any method body/implementation.

Syntax: public abstract void a();

concrete methods: Methods which have method body.

abstract classes need to be inherited and the first class which inherits the abstract class will have to override the abstract method and write a method body for it.

Concrete Classes can have only concrete methods.

Syntax: public abstract class <className>.

We cannot achieve 100% abstraction using an abstract class.

To achieve 100% abstraction, we need to use interface.

Syntax for interfaces in Java:

interface <interfaceName>
{
void a();
}
We cannot write method body/implementation in an interface.

However, we can have static methods with body/implementation.

We cannot instantiate objects for an interface.

We can inherit an interface using implements keyword.

We can inherit multiple interfaces at once. Interfaces are used to implement Multiple Inheritance in Java.

All the variables declared in an interface are public static final by default.

Interfaces can also extend other interfaces.

All methods declared inside an interface are public abstract by default.

Encapsulation - It means the 4 Access modifiers in Java namely public, private, default & protected.

image

Exception Handling in Java:

We use try/catch block to handle exceptions in Java.

try
{
//code which might cause an exception
}catch(Exception e)
{
System.out.println(e);
}
Checked Exceptions: Handled during compile time and it gives the compilation error if it is not caught and handled during compile time.

Ex: IOException, FileNotFoundException.

Unchecked Exceptions: Compiler does not mandate to handle. The compiler ignores during compile time.

Ex: ArithmeticException, ArrayIndexOutOfBoundsException.

We can have multiple catch blocks for a single try block.

Care should be taken that the catch block with generic exception (Exception e) should be placed as the last catch block in case all the above catch blocks fail.

Using the catch block with generic (Exception e) as the first block right after the try block will make the other catch blocks unreachable.

Each try block should contain at least 1 catch block or finally block.

finally:

Any code included inside the finally block will be executed irrespective of the error at the try block.

throw: Used to throw an exception explicitly in the code, inside the function or the block of code. It is used in a method.

throws: Used in the method signature(beside method name) to declare an exception which might be thrown by the function while the execution of the code.

Other Important Java Concepts:

Operators

if, else if, else & switch conditions

arrays (Single and Multi Dimensional)

break

continue

for, for-each(enhanced for loop), while, do while loops

local, instance & static variables. Scope of variables.

nested Classes & nested Interfaces

Scanner class

Singleton Class - A class with which we can create only 1 object.

Packages

Strings, String Builder & String Buffer

Exception Handling - try, catch & finally. throw & throws keywords. Checked & Un-checked exceptions.

Collections - ArrayList, HashMap, HashSet & TreeSet.

image

We use Wrapper Classes in place of Primitive Data Types when using Collections.

Wrapper Classes provide a way to convert Primitive data type to Object & Object to a Primitive Data type.

ArrayList:

   * Maintains insertion order.
   
   * Can contain duplicates.
   
   * It is basically a dynamic array.
HashSet:

   * Stores elements by a process called `hashing`.
   
   * Stores only unique elements.
   
   * Does not follow insertion order.
   
   * Allows `null` value.
TreeSet:

   * Stores only unique elements.
   
   * Does not allow `null` values.
   
   * Inserts elements in Ascending Order.
HashMap:

   * Contains key value pairs.
   
   * Allows only unique keys.
   
   * Allows 1 `null` key & multiple `null` values.
   
   * Does not follow insertion order.
Iterator:Iterator is an interface that is used in order to iterate over a collection of Java object components entirety one by one.
