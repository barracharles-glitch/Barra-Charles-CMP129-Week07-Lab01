import java.util.Scanner;
public class Library {
    private Member[] current_memebers= new Member[5];
    private Book[] current_books= new Book[5];
    Scanner str_scan = new Scanner(System.in);

    public void addMember(){
        System.out.println("Enter the name of the member you would like to add: ");
        String name = str_scan.nextLine();
        System.out.println("Enter the member ID of the member you would like to add: ");
        String id = str_scan.nextLine();
        Member m = new Member(name, id);
        for (int i=0; i < current_memebers.length; i++){
            if (current_memebers[i] == null){
                current_memebers[i] = m;
            }
        }
    }

    public void addBook(){
        System.out.println("Enter the name of the book you would like to add: ");
        String name = str_scan.nextLine();
        System.out.println("Enter the author of the book you would like to add: ");
        String author = str_scan.nextLine();
        System.out.println("Enter the ISBN of the book you would like to add: ");
        String ISBN = str_scan.nextLine();
        System.out.println("Enter the availability of the book you would like to add: ");
        String availability = str_scan.nextLine();
        Book b = new Book(author, ISBN, name, availability);
        for (int i=0; i < current_books.length; i++){
            if (current_books[i] == null){
                current_books[i] = b;
            }
        }
    }

    public void RemoveMember(Member m){
        System.out.println("Enter the ID of the member you would like to remove: ");
        String id = str_scan.nextLine();
        for (int i=0; i < current_memebers.length; i++){
            if (current_memebers[i].getID() == id){
                current_memebers[i] = null;
            }
        }
    }

    public void RemoveBook(Book b){
        System.out.println("Enter the title of the book you would like to remove: ");
        String title = str_scan.nextLine();
        for (int i=0; i < current_books.length; i++){
            if (current_books[i].getTitle() == title){
                current_books[i] = null;
            }
        }
    }

}
