# Java Cheat Sheet

Here's a sample of the entry class for a Java program, which serves as the starting point when you run the application. 
This example also demonstrates how to output messages to the terminal. The class itself is enclosed in one set of curly braces, while the 'main' method within the class is encapsulated in another set.
```Java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
```

To create a variable, you must specify both its data type and name. Each statement should conclude with a semicolon; failing to do so will result in an error. 

While you can declare a variable without initializing it, 
you must initialize it before using it to avoid errors. You're also free to reassign the variable later in your code. However, declaring another variable with the same name will generate an error. 

If you want a variable to be accessible across multiple methods within a class, you can declare it at the class level. To make that variable compatible with static methods, simply add the 'static' keyword.
static variables
```Java
class Main {
  static int nums = 10;
  public static void main(String[] args) {
    int num;
    num = 0;
    num = 1;
    int num;
  }
}
```

When you declare a variable in the class level. The compiler assigns them default values. For numbers it's 0. If you reassign the variable inside a method it changes the value without errors.

```Java
class Main {
  static int num; // default is 0
  public static void main(String[] args) {
    num = 10;
    System.out.println(num)
  }
}
```

Ex output:
```
10
```

Variable names can be named anything as long as they don't start with a number or have spaces. When you have multiple words in a name always follow camelCasing. 

```Java
class Main {
  public static void main(String[] args) {
    int 0num; // wrong
    int my age; // wrong
  
    int $age; // This is ok
    int _age; // This is ok
  
    int myAge; // Recommended. camel casing is used here
  
    int a; // This is ok
  }
}
```

You can concatonate strings with variables using the `+` symbole

```Java
class Main {
  public static void main(String[] args) {
    int num = 10;
    System.out.println("my age is " + num)
  }
}
```

Here are the data types in Java. There are primitive and non-primitave types. 

Notes:
- when a number has no decimal. The compiler treats is as an integer
- By default any number with a decimal point is treated as a double by the compiler

```Java
class Main {
  public static void main(String[] args) {
    // Primitive Types
    // integer types
    byte singleByte = 100; // -128 to 127
    short smallNumber = 20000; // -32,768 to 32,767
    int integer = 2147483647; // -2147483648 to 2147483647
    long largNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807
    // you can also use a small L instead of capitol

    // decimal types
    double double = 1.79769313; // 4.9E-324 to 1.7976931348623157E308
    float float = 3.4028F; // 1.4E-45 to 3.4028235E28
    // you can also use a small F instead of capitol

    // booleans
    boolean isWeekend = false;
    boolean isWeekday = true;

    // Non-primitive Types
    // characters
    char copyWriteSymbol = '\u00A9'
  }
}
```

Type conversion can be implicit or explicit. 

```Java
class Main {
  public static void main(String[] args) {
    int number1 = 5;
    double number2 = number1;

    System.out.println(number2)
  }
}
```

Ex output:
```
5.0
```

If you try to do the reverse like in the example below you get an error. instead you should convert using a casting operator. changing a decimal to a int rounds the number down to a whole number

```Java
class Main {
  public static void main(String[] args) {
    double number1 = 5;
    int number2 = number1; // This will cause the error
    int number2 = (int)number1; // This won't cause an error
    // casting is the (int) before the variable name. 

    System.out.println(number2)
  }
}
```

Ex output:
```
5
```

Here are examples of operators in Java.
Notes:
- if you divide a double with an int or the opposite you get back a double decimal number

```Java
class Main {
  public static void main(String[] args) {
    int number1 = 12;
    int number2 = 6;

    // addition
    System.out.println(number1 + number2); // 18

    // subtraction
    System.out.println(number1 - number2); // 6
    System.out.println(numbe2 - number1); // -6

    //multiplication
    System.out.println(number1 * number2); // 72

    // division
    System.out.println(number1 / number2); // 2

    // remainder (modulo/modulus)
    System.out.println(number1 % number2); // 0
  }

  public static void operatorsContinued(String[] args) {
    // other ways to add
    int number = 12;
    number = number + 5;
    //or
    number +=5
    // you can use the shorthand way with other operators too
    
  }
}
```

Here are examples of relational operators

```Java
class Main {
  public static void main(String[] args) {
    int number1 = 12;
    int number2 = 15;

    // is equal to
    System.out.println(number1 == number2)

    // is not equal to
    System.out.println(number1 != number2)

    // is greater than
    System.out.println(number1 > number2)

    // is less than
    System.out.println(number1 < number2)

    //is greater than or equal to
    System.out.println(number1 >= number2)

    // is less than or equal to
    System.out.println(number1 <= number2)
  }
}
```
Some examples of combining operators and different operators
```Java
class Main {
  public static void main(String[] args) {
    int age = 25;
    // the double && lets you combine multiple operators in a line
    int oper = age >= 18 && age <= 40;
    // if both operators result to true then true is returned
    // if one is false then false is returned
  
    boolean isStudent = false;
    boolean isLibraryMember = true;
    // if one operation is true and the other is false you will get back true
    System.out.println(isStudent || isLibrearyMember);
    // both have to be false for this operation to return false
  
    // the not operator will return the opposite of what would be returned
    // in this case we would have returned false, but instead we get true
    System.out.println(!isStudent);
  
    int score = 0;
    int turns = 10;
    // the increment and decrement operators can increase or decrease by one
    score++; // increment
    turns--; // decrement
    System.out.println(score); // 1
    System.out.println(turns); // 9
  
    int number = 50;
    System.out.println(number++);
    // the result you get from this is 55
    System.out.println(number); // calling the variable again will give you 56
    // this is because we are incrementing after we call the value
    // the same thing happens with the decrement operator
    System.out.println(++number);
    // this is how you would increment before calling the number
    // works the same with decrement
  }
}
```
examples of strings
```Java
class Main {
  public static void main(String[] args) {
    char percentSign = '%'; // stores one character
    String name = "something interesting"; // stores a string
    // if we have two strings that are made this way and are compared we get true
    // because these two values will have the same location in memory
  
    String name = new String("value here"); // another way to create a string
    // comparing two string objects will give you false
    // The values would have different memory locations
  }
}
```
examples of string methods
```Java
class Main {
  public static void main(String[] args) {
    
  }
}
```
