import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

class Main {
  public static void Main(String[] args) {
    User youngerUser = new User("Carlos", "0000-00-00");

    // youngerUser.name = "Carlos";
    // youngerUser.birthday = LocalDate.parse("0000-00-00");
    // these methods were given values without a constructor in the User class

    User olderUser = new User("Johnathan Wick", "1964-09-02");

    // olderUser.name = "Johnathan Wick";
    // olderUser.birthday = LocalDate.parse("1964-09-02");

    Book book = new Book("Harry Potter", "J.K. Rowling");
    // book.title = "Harry Potter";
    // book.author = "J.K. Rowling";

    youngerUser.borrow(book);

    // System.out.printf("%s was born in %s. His age is %d years old", youngerUser.name, youngerUser.birthday.toString(), youngerUser.age());
    System.out.printf("%s was born in %s. His age is %d years old", youngerUser.getName(), youngerUser.getBirthday(), youngerUser.age()); // values will be retrieved using the new methods
    // example output: Carlos was born in 0000-00-00. His age is (date difference) years old
    
    // System.out.printf("%s was born in %s. His age is %d years old", olderUser.name, olderUser.birthday.toString(), olderUser.age());
    System.out.printf("%s was born in %s. His age is %d years old", olderUser.getName(), olderUser.getBirthday(), olderUser.age());
    // example output: Johnathan Wick was born in 1964-09-02. His age is 59 years old // 2023 as of this example

    // System.out.printf("%s has borrowed these books: %s", youngerUser.name, youngerUser.books.toString());
    System.out.printf("%s has borrowed these books: %s", youngerUser.name, youngerUser.borrowedBooks());
    // example output: Carlos has borrowed these books: [Harry Potter by J.K. Rowling]
  }

}

public class User {
  private String name;
  // setting this to private requires a getter to retrieve the value
  // private also prevents changes to this variable outside the User class
  // public String name;
  private LocalDate birthday;
  private ArrayList<Book> books = new ArrayList<Book>();

  User(String name, String birthday) {
    this.name = name;
    this.birthday = LocalDate.parse(birthday);
  }

  public String getName() {
    return this.name;
  }

  public String getBirthday() {
    return this.birthday.toString();
  }

  public String borrowedBooks() {
    return this.books.toString();
  }

  public void borrow(Book book) {
    this.books.add(book);
  }

  public int age(){
    int age = Period.between(this.birthday, LocalDate.now());
    return age.getYears();
  }
}

public class Book {
  private String title;
  private String author;

  Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  public String toString() {
    return String.format("%s by %s", this.title, this.author);
  }
  
}
