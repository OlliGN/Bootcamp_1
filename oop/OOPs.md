###Java
Java is an object-oriented programming language.
Everything in Java is associated with classes and objects, along with its attributes and methods.

### OOP
OOP ---> Object-Oriented Programming. OOP primary usage is to create custom(own) data types. Classes and objects are two
main aspects of object-oriented programming. OOP is faster and easier to execute.

in ex:
class: Fruit objects: Apple, Banana, Mango So, a class is a template for objects, and an object is an instance of a
class. When the individual objects are created, they inherit all the variables and methods from the class.

There are 4 major principles that make a language Object-Oriented:
1.Abstraction 2.Polymorphism 3.Inheritance 4.Encapsulation

# Abstraction
The main purpose of abstraction is hiding the unnecessary details from the users. Abstraction is selecting data from a
larger pool to show only relevant details of the object to the user. 
Abstraction can be achieved with either abstract classes or interfaces.

# Polymorphism
Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a
parent class reference is used to refer to a child class object.

# Inheritance
Inheritance is a mechanism in which one class acquires the property of another class. Use keyword extends
#extends Keyword
extends - is the keyword used to inherit the properties of a class.

When creating a new class in Java, you can define the class to inherit from an existing class.
Inheritance is the process by which the new child subclass automatically includes any public or protected primitives, 
objects or methods defined in the parent class. 
Inheritance is a process of avoiding code repetition, which is a very bad practice in programming.

# Encapsulation
Encapsulation in Java is a process of wrapping the data (variables) and code together into a single unit. For example, a
capsule which is mixed of several medicines. Now we can use setter and getter methods to set and get the data in it.

### Classes

A Class is like an object constructor, or a "blueprint" for creating objects. By designing classes we are dictating,
choosing what kind of info needs to be provided and stores about an entity. Class should always start with an uppercase
first letter, and that the name of the java file should match the class name. Class attributes are variables within a
class. (Another term for class attributes is fields). You can access attributes by creating an object of the class, and
by using the dot syntax (.).
class attributes(fields) are variables within a class.

#### Variable

Variable is a placeholder in memory to store values. Static Variables - Declare with static word outside of method.
Local Variables - Declare inside of methods, blocks or contractors. Instance Variables - Declare at class level but
outside of method.

### Static variable

Static variable in Java is variable which belongs to the class and initialized only once at the start of the execution

### Instance Variables

Instance variables are declared in the class, but outside a method, constructor or any block. Instance variables are
created when an object is created with the use of the keyword "new" and destroyed when the object is destroyed.

### Instance VS Local

Instance variables are the characteristics of an Object. Instance variable are declared on a class level, and they can
have access modifier Also, instance variables have default values when an object of a class is created - instance
variables get initialized with default values But usually Constructors are used to reinitialize the instance variables
with meaning starting values(info about a particular object)

## Local variables

Local variables are declared on a method or block level. They are only accessible inside this block Local variables can
not have access modifier, and don't have default values, so you have to make sure that local variable is initialized by
you (explicitly)

# final (modifier)

The final(modifier) ---> keyword is useful when you want a variable to always store the same value. We are able to
inherit final methods, but Final method can not be overridden.

### Final Instance Variables

Final Instance Variables must be assigned a value exactly once. At once the value is assigned - it can not be changed.

# final classes
We can not inherit from a final class, final class is immutable.

### Constructors

Constructor is a special method that is used to initialize objects. 
Constructor name must match the class name, and it
cannot have a return type (like void). 
Constructor is called when the object is created. 
All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. 
However, then you are not able to set initial values for object attributes. 
Constructors can also take parameters (as many as you want).

### Constructor Chaining
Constructor chaining is a process of calling the constructor from another constructor with respect to current object.
#this()
this() ---> is used to access one constructor from another where both constructors belong to the same class

# super()
super() ---> is used to call a constructor from a parent class.

# this.
keyword is used to refer a current object (same class)

# super.
refers to the parent class

### Constructor overloading
Constructor overloading allows a class to have more than one constructor that have the same name as that of the class
but differ only in terms of number or type of parameters. 
The compiler differentiates these constructors by taking into account the number of parameters in the list and their type.

Constructor overloading ---> is a method (process) of keeping the same method name with different parameters. 
So access modifiers, return type can be different parameters. 
So access modifiers, return type can be different but name must be the same, and parameters must be different. 
So advantage is to avoid coming up with many names for similar functions.

### @Overriding a Method
---> is a process used in inheritance. 
When a subclass inherits methods from Super class and Subclass needs to have custom specific implementation of the methods 
- inherited method needs to be overridden.
  Method name and signature must be the same Only inherited methods can be overridden 
  Final and Static methods can not be overridden Use the super keyword to invoke the overriding method from the subclass.


### Object

Object is a bundle of data and its behaviour (often known as method). Objects have two characteristics : states and
behaviours.

#### Behaviour of Object(Instance Method)

Methods(functions) that use the information from the state of an object and performs so logic. Or methods that takes any
external info and use it to change the state of an object.

Instance Methods are the Object methods that exclusively belong to a particular object. So u can use that only after
creating an object and from reference to that object.

# setter

setter ---> is a method that updates the value of a variable.

# getter

getter ---> is a method that reads the value of a variable. Getter and setter are also known as accessor and mutator in
Java.

# POJO and BEANs

POJO (Plain Old Java Object) and BEANs are classes that have instance variables and getters and setters only

### Static Members

Static members ---> ara variables and methods that do not belong to an object. Static variables are considered to be
global variables, which means static variables are global to all object that have been or will be created from a class.
There is only one value of a static variable for all objects created from the class.

#### Static Methods
Static methods can be accessed without creating an object of the class, unlike public, which can only be accessed by
objects. 
Helper methods(Utility methods) are usually static methods. Wrapper classes have many utilities methods:
Collection class. Math.

Utility methods are the functions which do not require object state info to be executed.

#### Static VS Instance

Static is the same for all objects, instance is unique for aech object. Static is a global variable that doesn't belong
to a specific object, rather it belongs to a class, it is an info that can be shared by all objects from the class.

### Abstract class
Abstract class ---> is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract classes can not be final and privat, because they are meant to be inherited.
An abstract class can have both abstract and regular methods
# Abstract method 
Abstract method can only be used in an abstract class, and it does not have a body. 
The body is provided by the subclass (inherited from).



# Inheriting on Abstract method VS non-abstract method
Abstract methods are meant  to be overridden. They must be overridden!
Non-abstract methods - are not required to be overridden, which meant the sub-class is ok with the implementation of a
method that coming from the sub-class. If the sub class is not ok with the implementation - it has an option to override
it.

####Interface
An interface is a completely "abstract class" that is used to group related methods with empty bodies.
To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements' keyword (instead of extends).
Like abstract classes, interfaces cannot be used to create objects.
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)

Why do we use interface?
To achieve security - hide certain details and only show the important details of an object (interface).
Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
However, it can be achieved with interfaces, because the class can implement multiple interfaces.



UI - Front-end
API - Back-end

