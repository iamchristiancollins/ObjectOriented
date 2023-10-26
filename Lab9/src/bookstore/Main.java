package bookstore;

public class Main {
	
	public static void main(String[] args) {
		BookStore store = new BookStore();
		Book b1 = new Book(1, "Harper Lee", "To Kill a Mockingbird");
		Book b2 = new Book(2, "Harper Lee", "To Kill a Mockingbird");
		Book b3 = new Book(3, "Frances Hodgson", "The Secret Garden");
		Book b4 = new Book(5, "J.K. Rowling",
				"Harry Potter and the Sorcerer's Stone");
		Book b5 = new Book(4, "Douglas Adams",
				"The Hitchhiker's Guide to the Galaxy");
		
		store.addBook(b1);
		store.addBook(b2);
		store.addBook(b3);
		store.addBook(b4);
		store.addBook(b5);
		
		System.out.println(store.getBooksSortedByAuthor());
	}

}
