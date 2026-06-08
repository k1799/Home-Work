
package June;


public class Book {
    int bookId;
    String title;
    String author;
    String status;
    
    Book(int bookId,String title,String author){
    this.bookId=bookId;
    this.title=title;
    this.author=author;
    this.status="Available";
    }
    void display(){
        System.out.println(bookId + " " + title+ " " + author + " " + status);
    }
}
