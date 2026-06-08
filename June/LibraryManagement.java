
package June;

import java.util.ArrayList;
import java.util.Scanner;


public class LibraryManagement {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        ArrayList<Book> book=new ArrayList<>();
        
        while(true){
            System.out.println("1.Add Book");
            System.out.println("2.View Book");
            System.out.println("3.Search Book");
            System.out.println("4.Issue Book");
            System.out.println("5.Return Book");
            System.out.println("6.Deleete Book");
            System.out.println("7.Exit");
            
            System.out.println("Enter Your Choice");
            int choice=sc.nextInt();
            
            switch(choice){
            
                case 1:
                    System.out.println("Enter Book Id: ");
                    int id=sc.nextInt();
                    
                    sc.nextLine();//buffer clear
                    System.out.println("Title: ");
                    String title=sc.nextLine();
                    
                    System.out.println("Enter Author: ");
                    String author=sc.nextLine();
                    
                    book.add(new Book(id,title,author));
                    System.out.println("Book Added");
                    break;
                    
                case 2:
                    if(book.isEmpty()){
                        System.out.println("No Books Aviailable");
                    }
                    else{
                    for(Book b:book){
                    b.display();
                    }
                    }
                    break;
                case 3:
                    System.out.println("Book Id");
                    id=sc.nextInt();
                    
                    boolean found=false;
                    for(Book b:book){
                    if(b.bookId==id){
                     b.display();
                     found=true;
                     break;
                    }
                    }
                    if(!found){
                        System.out.println("Book Not Found");
                    }
                    break;
                case 4:
                    System.out.println("Book Id");
                    id=sc.nextInt();
                    
                     found=false;
                    
                    for(Book b:book){
                    if(b.bookId==id){
                        found=true;
                        //System.out.println("Current status = "+b.status);
                    if(b.status.equals("Available")){
                    b.status="Issued";
                        System.out.println("Book Issued");
                    }
                    }
                    else{
                        System.out.println("Aleardy Issued");
                    }
                    break;
                    
                    }
                    if(!found){
                        System.out.println("Book Not Found");
                    }
                    break;
                case 5:
                  System.out.println("Book Id");
                  id=sc.nextInt();
                  
                  found=false;
                  for(Book b:book){
                    if(b.bookId==id){
                     found=true;
                    if(b.status.equals("Issued")){
                    b.status="Available";
                        System.out.println("Book Returned");
                    }
                    else{
                        System.out.println("Aleardy Available");
                    }
                    break;
                    }
                    }
                    if(!found){
                        System.out.println("Book Not Found");
                    }
                   break;
                case 6:
                   System.out.println("Book Id");
                   id=sc.nextInt(); 
                   
                   /*ithu oru lamda method
                   book.removeIf(b->b.bookId==id);
                    System.out.println("Book Deleted");
                    break;*/
                   
                   //ithu innoru normal method
                   Book temp=null;
                   
                   for(Book b:book){
                   if(b.bookId==id){
                   temp=b;
                   break;
                   }
                   }
                   if(temp!=null){
                   book.remove(temp);
                       System.out.println("Book deleted");
                   }
                   else{
                       System.out.println("Book Not Found");
                   }
                   break;
                case 7:
                    System.exit(0);
                default :
                    System.out.println("Invalid Choice! Please Enter 1 to 7");
            }
        }
    }
}
