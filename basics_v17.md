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
    // adding a \n in the string will add a new line
  }
}
```
## Variables

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

If you would like a variable value to be constant you can use the final modifier
```Java
class Main {
  public static void main(String[] args) {
    final someVariable = 10;
    // cannot be changed once set 
  }
}
```

multiple variables can be initialized at one using a comma

```Java
class Main {
  public static void main(String[] args) {
    int a = 4, b = 5, c = 6;
  }
}
```

Using the var keyword means you don't have to specify a data type

```Java
class Main {
  public static void main(String[] args) {
    var num = 10;
    // the compiler will infer the type for you based on the value
  }
}
```

## Data types

Here are the data types in Java. There are primitive and non-primitave types. 

Notes:
- when a number has no decimal. The compiler treats is as an integer
- By default any number with a decimal point is treated as a double by the compiler

```Java
class Main {
  public static void main(String[] args) {
    // Primitive Types
    // integer, floating point, character, boolean
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

    // characters
    char copyWriteSymbol = '\u00A9';

    // Non-primitive Types

    //String
    String name = "your name";
  }
}
```

Type conversion can be implicit or explicit. 

```Java
class Main {
  public static void main(String[] args) {
    // explicit
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

## Type Casting

If you try to do the reverse like in the example below you get an error. instead you should convert using a casting operator. changing a decimal to a int rounds the number down to a whole number

```Java
class Main {
  public static void main(String[] args) {
    double number1 = 5;
    int number2 = number1; // This will cause the error
    // implicit
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

## Operators

Here are examples of operators in Java.
Notes:
- if you divide a double with an int or the opposite you get back a double decimal number

```Java
class Main {
  public static void main(String[] args) {
    // Precedence in priority order
    // post fix x++ x--
    // pre fix ++x --x
    // multiplicative * / %
    // add/subtract + -
    // if precedence is equal then the equation solves left to right
    // you can override precedence using parenthesis ()
    // parenthesis can be nested

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

    // a widing conversion is a conversion of a smaller number to a larger and the compiler can handle that
    // the compiler cannot handle narrowing conversions unless you use explicit casting
    // 16 bit numbers will change to 32 bit in an implicit conversion

    short byteval = (short) (byteval - longval) // here we convert a long to short
    // we enclose the two values in parenthesis to convert the result at the end to short

    // implicit
    // numbers convert to largest decimal type. can't do the other way around
    // when reassigning you can only cast decimal to int
    // if mixing floating point the compiler prioritizes double
    // if mixing float and integer then the compiler prioritizes the largest floating point
    
    // explicit
    // if converting long to short. bits are dicarded from the value
    // if converting float to int then the decimals get discarded
    // if converting int to float u lose precision

  }

  public void operatorsContinued(String[] args) {
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

## Strings

examples of strings
```Java
class Main {
  public static void main(String[] args) {
    char percentSign = '%'; // stores one character
    String name = "something interesting"; // holds a reference to instance of string
    // immutable. never directly changed when altered. original value stays the same
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

    // when comparing Strings with the == double equals. It does not check the value, but the reference of the String
    // for example if you made two strings that contained the same phrase. it checks the location they are held.
    // two strings having the same value does not mean they are the same String
    // the .equals() method is the function you need to compare the values only

    
  }
}
```

 You can concatonate strings with variables using the `+` and the `+=` symbols

```Java
class Main {
  public static void main(String[] args) {
    String greeting = "hello, "
    int name = "carlos;
    System.out.println("hello, my name is" + name)

    greeting += name
    System.out.println(greeting)
    // output: hello, carlos
    // when a string is concatonated this way a new instance is made
    // the variable then points to that new instance

    int i = 0;
    String output = i + " * "'
    // the compiler will convert i to a string if you add a string to it
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

    System.out.println(s1.concat(s2));
    // combines two strings

    System.out.println(s1.trim());  
    // returns a certain section of the string

    System.out.println(s1.split());
    // splits a string into characters

    System.out.println(s1.charAt());
    // extract a character from string

    System.out.println(s1.subString());
    // take a small section of a string and return it

    System.out.println(s1.endsWith());
    // end with certain characters

    System.out.println(s1.startsWith());
    // start with certain characters

    System.out.println(s1.indexOf());
    // index of a character

    System.out.println(s1.lastIndexOf());
    // location of a character or characters

    System.out.println(s1.equalsIgnoreCase());
    // checks if equal except for a certain case

    System.out.println(s1.compareTo());
    // greater than or less than comparisons

    System.out.println(s1.compareToIgnoreCase());

    //System.out.println(s1.format());

    String val = String.valueOf(var)
    System.out.println(val);
    // create strings from non strings

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

    String s3 = s2.intern();
    String s4 = s1.intern()
    // this methods looks at the value of s2 and looks for a copy
    // if not, it creates a copy of s2.
    // when comparing these values with == double equals s4 == s3 returns true
    // because they are the same value copy and point to the same location
  }
}
```

## String Builder

```Java
class Main {
  public static void main(String[] args) {
    StringBuilder string = new StringBuilder();
    // creates a buffer for building strings

    StringBuilder string = new StringBuilder(40);
    // you can specify how many characters it will have so it runs effiecient

    string.append("hello world");

    string.append(5);
    // you can use the append to add an integer which gets converted to String

    String message = string.toString();
    // convert the string to a string type to extract the value

    int pos = string.indexOf(" w");
    // gives you the position of the space in the buffer

    string.insert(pos, " my ");
    // insert my at the postion with two spaces

    string.insert(pos + 6, " something ");
    // adds something 6 characters to the right of pos

    String message = string.toString();
    // prints out the string that's been further edited
  }
}
```

## User Input

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

## Conditionals

- How to use util.Scanner
examples of if else statements
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

    if (oper.equals("sum")
      System.out.println("sum")
    // java can execute the next line if there's no block, but only the next line
    // if there's mutliple lines of code the next one won't execute
  
    scanner.close();
  }
}
```

conditional assignment

```Java
class Main {
  public static void main(String[] args) {
    // ex condition ? true-value : false-value;

    int value1 = 7
    int value2 = 5
    int result = value1 > value2 ? value1 : value2;

    System.out.println(result) // 7
  }
}
```

And operator

```Java
class Main {
  public static void main(String[] args) {
    int a = 20, b = 14, c = 5;
    
    if ( a > b & b > c) {
      
    }
    // only true if both sides resolve to true
  }
}
```

Or operator

```Java
class Main {
  public static void main(String[] args) {
    int a = 20, b = 14, c = 5;
    
    if ( a > b | b > c) {
      
    }
    // only true if one side or both resolves to true
  }
}
```

Xor operator

```Java
class Main {
  public static void main(String[] args) {
    int a = 20, b = 14, c = 5;
    
    if ( a > b ^ b > c) {
      
    }
    // only true if one side resolves to true, but not both
  }
}
```

Negation operator

```Java
class Main {
  public static void main(String[] args) {
    int a = 20, b = 14, c = 5;
    
    if ( !b < c) {
      System.out.println("true");
    }
    // only true if the condition is false as it returns the opposite of the condition
  }
}
```

And And operator

```Java
class Main {
  public static void main(String[] args) {
    int a = 20, b = 14, c = 5;
    
    if ( a > b && b > c) {
      System.out.println("true");
    }
    // only executes the right side if the left is true
    // if left side is false, the right side is never executed
    // only true if both conditions are true
  }
}
```

Double Or operator

```Java
class Main {
  public static void main(String[] args) {
    int a = 20, b = 14, c = 5;
    
    if ( a > b || b > c) {
      System.out.println("true");
    }
    // only executes right side if the left is false
    // if right side is true then right side never executed
    // only true if one of the sides is true
  }
}
```

examples of switch

```Java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // supported primitive types: byte, short, int, long, char
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter a random number between 1 and 3");
    int oper = Integer.parseInt(scanner.nextLine());

    switch (oper) {
      case 1:
        System.out.println("you chose 1");
        break;
      case 2:
        System.out.println("you chose 2");
        break;
      case 3:
        System.out.println("you chose 3");
        break;
      default:
        System.out.println("default");
      break;
    }
  }
}
```

## Arrays

Array examples
```Java
import java.utils.Arrays;

class Main {
  public static void main(String[] args) {
    char vowels[] = new char[5];
    // or
    double[] interest = new double[argument]
    // you can use an argument with values to fill an array

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

## For Loops

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

    for(int number : numbers) {
      System.out.println(number);
    }
    // shorthand for loop through an array

    for(int number : numbers) {
      System.out.println(number);
      if(number.equals(1)) break;
    }
    // when looping through a for loop you can get out of it by putting in the break keyword
    // this is great for conditions
  }
}
```

## For Each Loop

```Java
class Main {
  public static void main(String[] args) {
    int[] nums = {1,2,3}
    for(int num : nums) {
      // loops through each of the nums under the variable num
    }
  }
}
```

## While Loops

examples of while loops

```Java
class Main {
  public static void main(String[] args) {
    int number = 5;
    int multi = 1;

    while (multi <= 10) {
      System.out.printf("%d X %d = %d \n", number, multi, number * multi);
      multi++;
    // this is the format for a while loop

    int number = 5;
    int multi = 1;

    do {
      System.out.printf("%d X %d = %d \n", number, multi, number * multi);
      multi++;
    } while (multi <= 10) 
    // format for a do while loop
    // runs the body of the loop then checks the condition

  }
}
```
## Array List

examples of an array list

```Java
import java.util.ArrayList;
import java.util.Comparator;

class Main {
  public static void main(String[] args) {
    // Integer Double Float Boolean
    // these are wrapper classes make objects reference types
    // primitive types are like literal values that your giving
    // while reference types reference a value that exists as maybe a variable or something else
    // any data type can exist in array lists
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    // you have to use wrapper classes for Array Lists

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    // you have to use the add method to insert into array lists

    System.out.println(numbers.toString());
    // change it to a string to print
    // Ex. output
    // [1, 2, 3]
    //  0  1  2  index

    System.out.println(numbers.get(1));
    // the get method prints the value of the index of 1 in numbers
    // which will be 2 since that's the value of index 1

    numbers.remove(index);
    // this takes a value out of the array list

    numbers.remove(Integer.valueOf(4));
    // this will remove the value instead of what the index value is

    numbers.clear();
    // empties the array list

    numbers.set(index, Integer.valueOf(30));
    // this method allows you to change update a value inside an array list
    // it takes an index and value you will replace the current value with
    // since the array is a reference type then the value will need to be too

    numbers.sort(Comparator.naturalOrder());
    // sorts the array list
    // the comparator makes the list sort in sequential order

    numbers.sort(Comparator.reverseOrder());
    // reverses the list

    System.out.println(numbers.size());
    // returns size of array

    System.out.println(numbers.contains(Integer.valueOf(1)));
    // checks if the array has a certain value and returns true or false

    System.out.println(numbers.isEmpty());
    // checks if the array contains any values returns false if there's values or true if there's not

    numbers.forEach(number -> {
      numbers.set(numbers.indexOf(number), Integer.valueOf(30));
      // indexOf can be used to find the index of a certain value within an array list
      System.out.println(number);
    });
    // loops through the array and uses an arrow function to do something with each number
  }
}
```

## Hashmaps

examples of hashmaps

```Java
import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> examScores = new HashMap<String, Integer>();
    // first declare HashMap and define the data type of the key and value

    examScores.put("Math", 75);
    examScores.put("English", 85);
    examScores.put("History", 95);

    System.out.println(examScores.toString());
    // this will print out the hashmap in random order and not the order you put the values in

    System.out.println(examScores.get("Math"));
    // this is getting the value for math using the Math key

    examScores.putIfAbsent("Programming", 100);
    // this will insert a new value in the hashmap if it doesn't exist
    // if the key does then nothing will be changed

    examScores.replace("Math", 100);
    // this method will replace the key and value of an existing one inside the hashmap

    System.out.println(examScores.getOrDefault("Programming", 0));
    // this method will return the value of the key or it will return the second argument if it doesn't exist

    examScores.clear();
    // empties the hashmap

    System.out.println(examScores.size());
    // prints the length of the hashmap

    examScores.remove();
    // removes a key value pair from the hashmap

    System.out.println(examScores.containsKey("Math"));
    // checks if the hashmap contains the key and returns true or false

    System.out.println(examScores.containsValue(75));
    // checks if the hashmap contains this certain value and returns true or false
    // you can also use Integer.valueOf(75) and it will work

    System.out.println(examScores.isEmpty());
    // checks if the hashmap is empty and returns true or false

    examScores.forEach((key, value) -> {
      System.out.println();
      examScores.replace(key, value - 10);
    });
    // loops through the hashmap
    // make sure to enclose more than one variable in parentheses ()
  }
}
```

## Methods

```Java

class Main {
  public static void main(String[] args) {
      // methods are made outside the main function
  }

// methods or functions
// get passed parameters. they are a copy of the original value
// they will not alter the original only the copy which is scoped inside a method

static void method() {
  // its always prefered that you exit a method if a certain condition is true
  // one that won't let the code run

  // this is the method structor
  // we put void if the method does not return a value
  // we put the data type of the return value if there is one

  // you can add a return method before the last line of code or after all code is executed
  // running out of code inside a method also exits the method
  return;

}

static int add(int num1, int num2) {
  int sum = num1 + num2;
  return sum;
  // or
  return num1 + num2;
}

static double[] numbers() {
  // this is the data type of a double array
}
}

```

## Methods Continued
- passing objects as parameters
- effect of changes to object parameters
- overloading
- overloaded method resolution
- object class and methods

```Java
/*
- objects are passed by reference. parameter recieves a copy of the reference
- changes can be made to the reference and are visible within the method and not outside
ex:
Flight val1 = new Flight(10);
Flight val2 = new Flight(20);
swapFlight(val1, val2);

// here we swap both flights with each other
// once we print these flights you'll see that they aren't swapped even though
// they were put through the swapFLight method
// it only made changes to the copies and not originals. so instances
static void swapFlight(Flight i, Flight j) {
Flight k = i;
i = j;
j = k;
}

- changes to members visible within method and outside method
ex:
Flight val1 = new FLight(10);
Flight val2 = new Flight(20);
swapNumbers(val1, val2);

// same thing as above, but with members changes are seen outside
// so if we print out getFlightNumber(); to one it shows a changed value that was swapped
static void swapNumbers(Flight i, FLight j) {
  int k = i.getFLightNumber();
  i.setFlightNumber(j.getFlightNumber);
  j.setFlightNUmber(k);
}

overloading
- you can have multiple versions of a method or constructor within a class
- each constructor and method must have a unique signature
- parts that makeup the signature: number of parameters, Data type of each parameter, method name
ex:
class Passenger {
Passenger() {...}
Passenger(int freeBags) {...}
Passenger(double perBagFee) {...}
Passenger(int freeBags, int checkedBags) {...}
}


*/
```

## Command Line Arguments

```Java
// run the program and add a white space separated argument after
ex: java mainprogram hello world
// hello gets added into the string list args
// adding quotes around a space seperated argument makes it into one
ex: java mainprogram "hello world"

class Main {
  public static void main(String[] args) {
      System.out.println(args)
      // would show an array with hello and world seperated in it
  }
```

## Classes and Objects

```Java
// declare a class by the class keyword and name
// you always capitolize the name
class Flight {
  // class members
  //fields
  int passengers;
  int seats;

  // contructor looks like a method
  // does not have a return type and has the same name of the class
  Flight() {
    seats = 150;
    passengers = 0;
  }

  void add1Passenger() {
    if( passengers < seats) {
      passengers += 1;
    }
  }
}
// when you put this in a seperate file you name the file as the same name of the class
// ex: Flight.java
// classes have state and executable code
// field: stores object state
// methods: are executable code that manipulates state and perform operations
// constructors: executable code used during object creation to set initial state

Flight nycToLiv; // creates a reference to the flight object
nycToLiv = new Flight(); // this creates a new flight instance a.k.a. an object
// nycToLiv is a reference to the object instance of the flight class
Flight sfToTx = new Flight(); // this is the same thing in one line

sfToTx.add1Passenger();
// adds one passenger to passengers in sfToTx only

sfToTx = nycToLiv;
// sfToTx now points to nycToLiv reference object and has those values now

nycToLiv.add1Passenger();
// adds one to passengers in the nyc object instance

System.out.println(sfToTx.passengers);
// prints out 1 since it's pointing to the same object instance as nycToLiv

// Array of Classes
Flight[] flights = new Flight[3];
// creats 3 references of type Flight

flights[0] = new Flight();
flights[0].passengers = 10;
// changes the value of the first instance

for(Flight flight: flights) {
  
}

private static Flight create(params here) {
  Flight flights = new Flight();
  flights[0].passengers = 10;
  return flights;
}
// alternate way to create an object from a class

```

## Class Constructors and Initializers

```Java
/*
Default state of fields

byte, short, int, and long = 0
float double = 0.0

char = '\u0000'

boolean = false

reference types = null

Field initializers specifies a fields initial value
ex: int number = 10;
they can be set to a certain state using type casting
ex: int number = (int) (100 + 1.0);
this will equal 101

Contructors are code that runs during object creation
every class must have atleast one constructor
They are also not limited to having just one constructor
- each must have a unique parameter list
- different number of parameters
- different parameter types
** example of two constructors below in Example Default **
a constructor without any arguments is called the default constructor
it also allows you to create an instance without any arguments needed

chaining constructors - when one constructor calls another
the call must be the first line of a constructor with params
** There's an example below under Example Constructor Chaining **
the first constructor called depends on the arguments passed in
each value will be passed into the other constructor depending on data type
the constructors resolve from conditionals to passing in arguments to other constructors
then assigning values. kind of like resolving backwards after all conditions are resolved
- you can use this(); to chain to the first constructor if it has code in it

constructor visibility:
a constructor that's public can still chain to a private constructor

initialization blocks:
- cannot recieve params
- place code within brackets outside of methods or constructors
- always execute no matter how many you have
- executes in order of top to bottom

initialization and constructor order:
- field initializers are first and set
- then it's the initialzation blocks that run
- lastly constructors run depending on specified arguments

*/

initialize values in a constructor with loops example:
class Flights {
private int seats = 150
private boolean[] isSeatAvailable = new boolean[seats]
Flights() {
  for(int i = 0; i < seats; i++) {
    isSeatAvailable[i] = true
  }
}
}

initialization block example:
class Flights {
private int seats = 150
private boolean[] isSeatAvailable = new boolean[seats]
// this block below is code that runs instantly and in order
{
  for(int i = 0; i < seats; i++) {
    isSeatAvailable[i] = true
  }
}

}

Example Default:
class Flight {
  int passengers;
  int seats;
  int bags;

  Flight() {}
  Flight(int bags) {
    this.bags = bags
}

  public int getSeats() {
  return seats;
}

  public void setSeats(int seats) {
  this.seats = seats;
}
}

Example Constructor Chaining:
class Flight {
  int passengers;
  int seats;
  int bags;
  double perBagFee;

  Flight(int bags) {
    this(freeBags > 1? 25.0d : 50.0d);
    this.bags = bags;
}

  Flight(int freeBags, int checkedBags) {
    this(freeBags); // calls first constructor and passes freeBags as an argument
    this.checkedBages = checkedBags;
}

  Flight(double perBagFee) {
    this.perBagFee = perBagFee;
}

  public int getSeats() {
  return seats;
}

  public void setSeats(int seats) {
  this.seats = seats;
}
}

```

## Encapsultation and Access Modifiers

```Java
// Types of Modifiers

// None - A.K.A. package private - usable in classes and members
// Visibility only within it's own package

// public - usable in classes and members
// Visible everywhere

// private - usable in members - Usable within top-level classes which makes it available to nested; Unusable to classes 
// Visible only within the declaring class

// protected - variable, methods or class - can be accessed within it's own package and by subclasses even in a differnet package

class Main {
  public static void main(String[] args) {
      System.out.println(args)
      
  }

class Flight {
  int passengers;
  int seats;

  Flight() {...}

  void add1Passenger() {...}

  private void handleTooMany() {...}
}

// marking class flight as public lets you declare variables of flight anywhere including seperate files
// ex : public class Flight {...}

// marking the constructor public allows you to create instances anywhere
// ex : public FLight() {...}

// marking the two variables passengers and seats private means that they can only be accessed inside the class
// This will give off an error if you try to access it from anywhere else
// ex : private int passengers; private int seats;

// marking the add1Passenger method as public will allow you to add one to passengers even when passengers is set to private
// ex : public voic add1Passenger() {...}

// another method from within the class can access and use a seperate private method
// The handle too many method can be called like this handleTooMany();
// outside of the class it can't be used
```

## This and Null

```Java
// this - implicit reference to the current object
// null - represents an uncreated object
Flight lax1 = new Flight();
Flight lax2 = new Flight();

Flight lax3 = null;

if(lax1.hasRoom(lax2));
  lax3 = lax1.createNewWithBoth(lax2);
// combines passengers from both lax1 and lax2 into lax3 while creating a new instance


class Main {
  public static void main(String[] args) {
      
  }

class Flight {
  int passengers;
  int seats;
  Flight() {
}

public boolean hadRomm(Flight f1) {
  int total = this.passengers + f1.passengers
  // here this refers to this classes passengers and not f1
  return total <= seats
}
}
```

## Field Encapsulation

```Java
class Flight {
  int passengers;
  int seats;
  Flight() {}

  public int getSeats() {
  return seats;
}

  public void setSeats(int seats) {
  this.seats = seats;
}
// we use getters and setters to hide the implimentation details of the class state
// the methods implimented control the class field access. fields meaning the variables
// the state should not be directly accessible from outside the class
// this pattern is called the access/mutators pattern

}
```

## Static Members

```Java
/*
static members are shared class-wide and are not associated with an individual instance
- Declared using the static keyword
- accessible using class name

static Fields
- not associated with a specific instance
- all instances have accesss to the same value


static methods
- performs an action not tied to a specific instance, but class
- has access to other static members only
instances of a class will have seperate counts, but the original class will hold the sum of a value that is static

static import statement
- used with static methods
- allows method name to be used without being class-qualified
ex:
import static Flight.methodName;
- reference a static member
This changes FLight.methodName(); to methodName(); simplifying a call to a method
or
You can use import static Flight.*; to import all static methods

static initialization blocks
- perform one-time type initialization
  - execute before type's first use
  - has access to static members only
Statements enclosed in brackets
  - Preceded by statci keyword
  - outside of any method or constructor
ex:
public class Flight {
private int passengers, seates = 150;
private static int allPassengers, maxPassengersPerFlight;

static {
  AdminService admin = new AdminService();
  admin.connect();
  maxPassengersPerFlight = admin.isRestricted() ?
    admin.getMaxFlightPassenger() : Integer.MAX_VALUE;
  admin.close();
}
}

 */
```

## Object Class Inheritance & Methods

```Java
/*
Class Inheritance
- Allows one class to be declared with the characteristics of another

Object Class
- root of java hierarchy
- an object reference can reference an instance of any class
- every class has characteristics of an object or values
- automatically provide methods like toString();
ex:
Object[] stuff = new Object[3];
stuff[0] = new Flight(123);
stuff[1] = new MathEquation();
stuff[2] = "I like java";
// strings are considered a class
// these references let you work with the object characteristics

Object o = "just a string";
o = new Flight(123);
// you can reassign the reference

ex2:
void doWork(Object o) {
  // do something with object characteristics of o
}

Flight f = new Flight(123);
doWork(f);

Passenger p = new Passenger();
doWOrk(p);

Methods:
clone - create new object instance that duplicates the current instance
hashCode - get a hashcode for the current instance
getClass - return type info for the current instance
finalize - handle special resource cleanup scenarios
toString - return a string value representing the current instance
equals - compare another object to the current instance for equality

comparing values ex:
// the equals method will be modified to compare flightNumber values instead of instances
public class Flight {
private int flightNumber;

public boolean equals(Object o) {
  if ( !(o instanceof Flight) )
    return false;
  // Flight flight = (Flight) o;
  return flightNumber == flight.flightNumber;
}
// with this method edited with the check. you can't compare instances of Flight with other class instances
// you can't type instances of one class to another
}
*/
```

## Primitive Wrappers

```Java
/*
Primitive Types
- byte, short, int, long
- float, double
- char
- boolean
- primitive types represent data only
- unable to provide methods for operating on that data

Primitive Wrapper Classes
- can hold primitive data values
- can also have methods because they are classes
- enable compatability with richer aspects of java type system
- each primitive type has a wrapper class
Wrapper Classes:
- Byte, Short, Integer, Long
- Float, Double
- Character
- Boolean

examples of how primitive types are stored
int valA = 10; // directly stored in variable

Integer valB = 20; // holds a reference to the Integer instance
// inside the instance is the value 20.
// think of a class Integer that has a variable that holds 20

Boxing:
- Process of converting a primitive type to a wrapper class
Integer valC = valA; // automatic conversion in this case

Unboxing:
- Process of converting a wrapper class to a primitive type
int valD = valB; // automatic conversion

Methods primitive wrappers add:
- converting to and from other types
- extracting values from strings // string integer to int
- finding min/max values of a type
- and more!

*/
```

## Enums and Relative Comparisons

```Java
/*
- useful for defining a type with a finite list of valid values
- provide a comma seperated value list
- value names are all upper case
- holds references
- enums are classes with methods
ex:
public enum FlightCrewJob {
FLIGHT_ ATTENDANT, // lowest ordering
COPILOT, // mid ordering
PILOT // highest ordering
}

- supports equality tests like == or != operators
ex:
FlightCrewJob job1 = FlightCrewJob.PILOT;
FlightCrewJob job12 = FlightCrewJob.FLIGHT_ATTENDANT;

if(job1 == FlightCrewJob.PILOT)
  System.out.println("job1 is Pilot");

if(job1 != job2)
  System.out.println("job1 and job2 are different");

- Enum supports switch statements
ex:
void jobResponsibilites(FlightCrewJob job) {
  switch(job) {
    case FLIGHT_ATTENDANT:
      System.out.println("Assures passenger safety");
      break;
    case PILOT:
      System.out.println("flies plane");
      break;
    
  }

enum methods
values - returns array containing all values
valueOf - returns the value that corresponds to a string (case sensitive)

enums types are a class
- implicitly inherit from Java's enum class
- similar to other class in some ways
- have some special characters
enum types can have members
- fields
- methods
- constructors
enum values
- each value is an instance of the enum type
- declaring the value creates the instance
- can leverage the enum type's constructor

ex:
public enum FlightCrewJob {
FLIGHT_ATTENDANT("Flight Attendant"), // like passing in a string to a constructor. we pass in the title to each
COPILOT("First Officer"),
PILOT("Captain");
private String title;
public String getTitle() {return title;}

private FlightCrewJob(String title) {  
  this.title = title;
}
}

Relative Comparison
- values are ordered
- first value is lowest
- last value is highest

use compareTo for relative comparison
- returns negative, zero, or positive value
- indicates current instances ordering relative to another value
- comparing one num to another returns negative if the current num is lower or positive
if it's higher
ex:
class CrewMember {
FlightCrewJob job;
String name;

CrewMember(FlightCrewJob job, String name) {
    this.job = job;
    this.name = name;
  }
}

void whoIsInCharge(CrewMember member1, CrewMember member2) {
  CrewMember boss = member1.getJob().compareTo(member2.getJob()) > 0?
    member1 : member2;

  System.out.println(bos.getName() + " is Boss");
}

}

*/
```

## Records

```Java
/*
Data-only classes
- serve only as data carriers
- initialized with required data values
- those values never change
has boiler plate code
- constructor to initialize instance fields
- getters for each instance field
- common methods such as equals, hashCode, and toString

Record
- fixes all of these issues
- simplifies data-only classes
- create a record by using record keyword
- created class is immutable
- automatically generates a constructor to initialize fields, getters for each field,
and creates the common methods needed in each class
- in some use cases there are extra things you can do

ex:
public record Passenger(String name, int checkedBags) {}

Passenger p1 = new Passenger("bob", 2);
String name = p1.name(); // gets name
int bags = p1.checkedBags(); // getters same name as params

Passenger p2 = new Passenger("maria", 1);

if(p1.equals(p2)) // compares all fields in p1 & p2 like looping through a list
  // do something
*/
```

## Annotations

```Java
/*
- special types that act as metadata
- applied to a specific target
- no direct affect on target behavior
- must be interpreted by tools like compilers and/or execution environments and/or any program

- annotations allow other code to act on your metadata
- always preceded by an @ "at" symbol
- placed directly before a target
- allowable targets vary with annotations

- built into core java platform
- java provides types for creating annotations
- java has only a few annotations
- widely used by other tools/environments
- like xml and json processesors to simplify mapping between xml or json representations
- interpret annotations with your code

Common java core platform annotations
- Override | override an inherited method
- Deprecated | indicate that a prefered method is no longer the way to do something
- SurpressWarnings | indicate to the compiler not to generate certain warnings

ex:
@SurpressWarnings("deprecated") // stops warning related to deprecation
public class MyWorker {
  @Deprecated // makes this function deprecated
  void doSomeWork() { // generates a warning when the code is compiled
    Doer d1 = new Doer();
    d1.doThing();
  }

  @SurpressWarnings("deprecated") // you can move this annotation to the method to affect only that instead of the whole class
  void doDoubleWork() {
    Doer d2 = new Doer();
    d1.doThing();
    d1.doThing();
  }

}

*/
```

## The end of basics!!
