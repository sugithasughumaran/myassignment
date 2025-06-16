package week1.day3;

public class Library {
	
	String addBook(String bookTitle) {
		
		System.out.println("Book added successfully.");
		return bookTitle;
		}
	
	void issueBook() {
		System.out.println("Book issued successfully.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library Lib = new Library();
		
		String Addb = "Jack and Jill";
		
		Lib.addBook(Addb);
		System.out.println("Newly added book: " +Addb);
		Lib.issueBook();
		

	}

}
