package week1.day2;

public class Library {


String addBook(String bookTitle) {
	System.out.println("Book Added Successfully");
	return bookTitle;
	

	}
void issueBook() {
	
	System.out.println("Book Issued Successfully");
}
public static void main(String[] args) {
	Library L=new Library();
	String book = L.addBook("C#");
	System.out.println(book);
	L.issueBook();
}
}


