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

    Book harryPotter = new Book("Harry Potter", "J.K. Rowling", 223);
    // book.title = "Harry Potter";
    // book.author = "J.K. Rowling";

    AudioBook dracula = new AudioBook("Dracula", "Bram Stoker", 30000);

    Ebook jeeves = new Ebook("Carry On Jeeves", "P.G. Wodehouse", 280, "PDF");

    youngerUser.borrow(harryPotter);

    // System.out.printf("%s was born in %s. His age is %d years old", youngerUser.name, youngerUser.birthday.toString(), youngerUser.age());
    System.out.printf("%s was born in %s. His age is %d years old", youngerUser.getName(), youngerUser.getBirthday(), youngerUser.age()); // values will be retrieved using the new methods
    // example output: Carlos was born in 0000-00-00. His age is (date difference) years old
    
    // System.out.printf("%s was born in %s. His age is %d years old", olderUser.name, olderUser.birthday.toString(), olderUser.age());
    System.out.printf("%s was born in %s. His age is %d years old", olderUser.getName(), olderUser.getBirthday(), olderUser.age());
    // example output: Johnathan Wick was born in 1964-09-02. His age is 59 years old // 2023 as of this example

    // System.out.printf("%s has borrowed these books: %s", youngerUser.name, youngerUser.books.toString());
    System.out.printf("%s has borrowed these books: %s", youngerUser.name, youngerUser.borrowedBooks());
    // example output: Carlos has borrowed these books: [Harry Potter by J.K. Rowling]

    System.out.println(dracula.toString());
    // example output: Dracula by Bram Stoker
    // AudioBook is inheriting the toString method from Book

    System.out.println(jeeves.toString());
    // example output: Carry On Jeeves by P.G. Wodehouse
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
  private int pageCount;

  Book(String title, String author, int pageCount) {
    this.title = title;
    this.author = author;
    this.pageCount = pageCount;
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

public class AudioBook extends Book {
  private int runTime;

  AudioBook(String title, String author, int runTime) {
    super(title, author, 0);
    this.runTime = runTime;
  }
}

public class Ebook extends Book {
  private String format;
  
  Ebook(String title, String author, int pageCount, String format) {
    super(title, author, pageCount);
    this.format = format;
  }
}
