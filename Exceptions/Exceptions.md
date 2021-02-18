###Exceptions

- IndexOutOfBoundException
- ParseException
- ArrayStoreException
- NullPointerException
- ClassCastException
- NumberFormatException


### StackTrace
Trace to the place where the exception was thrown

#Throw keyword
Throw keyword can be used to create a custom error. The throw statements is used together with an exception type.
Exception types:
ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundException, SecurityException, etc...

#Finally keyword
The finally block follows a try block, or a catch block. 
A finally block of code always executes, irrespective of occurrence of an Exception. Using a finally block allows you to run any cleanup-type statements that you want to execute, no matter what happens in the protected code.


##Unchecked exceptions VS Checked exceptions
checked exceptions are checked at runtime of the program, while Unchecked exceptions are checked at the compile time of the program.
Checked and Unchecked, both can be created manually and both can be handled using try, catch and finally.

###Trow vs Trows
Throw keyword is used inside a function. It is used when it required to throw an exception logically.

Throws keyword is in the function signature. It is used when the function has some statements that can lead to some exceptions.



