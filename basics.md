# Java Cheat Sheet

Here's a sample of the entry class for a Java program, which serves as the starting point when you run the application. 
This example also demonstrates how to output messages to the terminal. The class itself is enclosed in one set of curly braces, while the 'main' method within the class is encapsulated in another set.
```Java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.print();
    // just using print disregards a new line at the end
    // so everything will be in one line
    // adding a \n in the string will cause the cursor to go to a new line
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
    // you can also use a small F instead of capital

    // booleans
    boolean isWeekend = false;
    boolean isWeekday = true;

    // Non-primitive Types
    // characters
    char copyWriteSymbol = '\u00A9';

    //String
    String name = "your name";
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

    String name = "carlos";
    String music = "synthwave";
    System.out.println("hello my name is " + name + ". I listen to " + music); // plus signs are one way to concatinate a string or strings
    String formatedString = String.format("hello my name is %s. I listen to %m.", name, music);
    // this is another way to concatinate strings where u specify a %s. %d for integer, %f for double, %c for character, and %b for boolean
    // then put in order what value you want in that place in order at the end that is seperated with a comma
    System.out.printf("hello %s", name);
    // this is a shorthand way to do string format
  }
}
```
examples of string methods
```Java
class Main {
  public static void main(String[] args) {
    String name = "carlos";
    System.out.println(name.length());
    // this method will return how many characters there are in a string including spaces

    String name = "carlos";
    System.out.println(name.isEmpty());
    // this method checks if the string is empty or not and returns a boolean

    String name = "carlos";
    System.out.println(name.toUpperCase());
    // this method changes all letters to upper case in a string

    String name = "carlos";
    System.out.println(name.toLowerCase());
    // this method changes all letters to lower case
    // this does not affect the original string. it remains the same

    String name = new String("carlos");
    String name2 = new String("carlos");
    System.out.println(name == name2);
    // this returns false because they are not the same objects

    String name = new String("carlos");
    String name2 = new String("carlos");
    System.out.println(name.equals(name2));
    // this returns true because we are comparing values only

    String string = "the sky is blue";
    System.out.println(string.replace("blue", "red"));
    // this method replaces the word blue with red
    // this does not replace the original string. it remains the same

    String string = "the sky is blue";
    System.out.println(string.contains("sky"));
    // this methods checks if a certain set of characters are in a string
  }
}
```
How to take input from a user examples

```Java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // this requires an import
    Scanner scanner = new Scanner(System.in);

    System.out.println("what is your name?");
    String name = scanner.nextLine();
    int age = scanner.nextInt();
    System.out.println(name, age);
    // before you can continue taking inputs you have to clear the buffer
    // using scanner.nextLine(); otherwise the next input might be skipped
    // this is caused by using an Int or Float. to avoid this use String and if needed
    // convert to int or use the parseInt method like
    // int age = Integer.parseInt(scanner.nextLine());
    // int age = Double.parseDouble(scanner.nextLine());
    scanner.nextLine();

    String name2 = scanner.nextLine();
    System.out.printf("hello %s", name2);
    scanner.close();

    // scanner methods
    scanner.nextLine();
    scanner.nextInt();
    scanner.nextDouble();
  }
}
```

examples of conditionals
```Java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.printf("enter first nubmer: ");
    int number1 = scanner.nextDouble();
    System.out.printf("enter second nubmer: ");
    int number2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.printf("What operation do you want to perform");
    String oper = scanner.nextLine();

    if (oper.equals("sum")) {
      System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
    } else if (oper.equals("sub")) {
      System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
    } else {
      System.out.printf("%s is not a supported operation", oper);
    }
  
    scanner.close();
  }
}
```

examples of switch

```Java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter a random number between 1 and 3");
    int oper = Integer.parseInt(scanner.nextLine());

    switch (oper) {
      case "1":
        System.out.println("you chose 1");
        break;
      case "2":
        System.out.println("you chose 2");
        break;
      case "3":
        System.out.println("you chose 3");
        break;
      default:
        System.out.println("default");
    }
  }
}
```

Array examples
```Java
import java.utils.Arrays;

class Main {
  public static void main(String[] args) {
    char vowels[] = new char[5];
    // array of single character strings
    // the 5 specifies the amount of maximum strings in the array

    vowels[0] = 'a';
    vowels[1] = 'e';
    vowels[2] = 'i';
    vowels[3] = 'o';
    vowels[4] = 'u';
    // to insert into the array you specify the name of the array and index of the value

    System.out.println(vowels[2]);
    // you can print out a specific index by specifying the name of the array and index

    System.out.println(Arrays.toString(vowels));
    // in order to print out the whole array you have to import java.utils.Arrays
    // then use the code above to print

    char vowels[] = {'a', 'e', 'i', 'o', 'u'}
    // this is the short hand way of declaring an array

    vowels[2] = 'x';
    // in order to replace a value just specify array name and index with the value

    System.out.println(vowels.length);
    // print out the length of the array

    Arrays.sort(vowels);
    // you can use the sort method from Arrays to sort the array

    Arrays.sort(vowels, startingIndex, endingIndex);
    // you can specify which set of values you want to sort within an array

    Arrays.binarySearch(vowels, key);
    // only works on sorted arrays. This method can search for the key in an array

    int foundItem = Arrays.binarySearch(vowels, key);
    // the binary search in this example returns the index of the key
    // or
    int startingIndex = 1;
    int endingIndex = 4;
    int foundItem = Arrays.binarySearch(vowels, startingIndex, EndingIndex, key);

    Arrays.fill(vowels, 'x');
    // fills an array with x's
    // or
    Arrays.fill(vowels, startingIndex, endingIndex, 'x');
    // this fills a certain range with x's

    int numbers[] = {1,2,3};

    int copyOfNumbers[] = numbers;
    // makes a copy of numbers that is a reference to the first array
    // if the numbers array is edited then the copy is also edited

    System.out.println(copyOfNumbers == numbers);
    // this would return true since it's comparing values
    // however if using the copyOf method the values would have different memory locations
    // so it would return false in that case
      
    int copyOfNumbers[] = Array.copyOf(numbers, number.length);
    // makes a copy of numbers but in a different memory location
    // if the original is edited this will not be edited

    int copyOfNumbers[] = Array.copyOf(numbers, 2);
    // specifiying a different lenght can limit what gets copied
    // adding more than the length of the array will add zeros at the end
    // the default value of an integer is 0

    int copyOfNumbers[] = Array.copyOfRange(numbers, startingIndex, endingIndex);
    // the starting and ending index can be specified if there's a specific set of values you want to copy

    System.out.println(Arrays.equals(copyOfNumbers == numbers));
    // this would return true as it's only comparing values using the
    // Array.equals() method
    
  }
}
```

examples of for loops

```Java
class Main {
  public static void main(String[] args) {
    for(int number = 1; number <= 10; number++) {
      System.out.println(number);
    }
    // standard format for a for loop

    int numbers[] = {1,2,3,4,5};

    for(int index = 1; index < numbers.length; index++) {
      System.out.println(numbers[index]);
    }
    // this prints out all the values in numbers starting from 2 since index starts at 1

    int numbers[] = {1,2,3,4,5};

    int sum = 0

    for(int index = 1; index < numbers.length; index++) {
      sum += numbers[index]
      System.out.println(numbers[index]);
    }
    System.out.println(sum);
    // adds all the numbers together and prints the result

    int number = 5

    for(int multi = 1; multi < 10; multi++) {
      System.out.printf("%d X %d = %d", number, multi, number * multi);
    }
    // this will print out the number times multi in 9 lines since it stops before 10

    for(int number = 1; number <= 10; number++) {
      for(int multi = 1; multi <= 10; multi++) {
        System.out.printf("%d X %d = %d", number, multi, number * multi);
      }
    }
    // you'll want to avoid nesting loops, but this will print out numbers 1-10 multiplied by the multi number

    for(int number = 1; number <= 50; number++) {
      if(number % 2== 1) {
        System.out.println(number);
      }
    }
    // prints out all odd numbers from 1 to 50

    int numbers[] = {1,2,3};

    for(int numbers : number) {
      System.out.println(number);
    }
    // shorthand for loop through an array

  }
}
```

examples of while loops

```Java
class Main {
  public static void main(String[] args) {
    
  }
}
```

```Java
class Main {
  public static void main(String[] args) {
    
  }
}
```
