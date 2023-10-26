package bookstore;



import static org.junit.Assert.*; 
import org.junit.Before;
import org.junit.Test;

public class BookStoreTest {

	private BookStore store;
	private Book b1 = new Book(1, "Harper Lee", "To Kill a Mockingbird");
	private Book b2 = new Book(2, "Harper Lee", "To Kill a Mockingbird");
	private Book b3 = new Book(3, "Frances Hodgson", "The Secret Garden");
	private Book b4 = new Book(5, "J.K. Rowling",
			"Harry Potter and the Sorcerer's Stone");
	private Book b5 = new Book(4, "Douglas Adams",
			"The Hitchhiker's Guide to the Galaxy");



	/**
	 * setup the store
	 * 
	 */
	@Before
	public void setUpBookStore() {
		store = new BookStore();
		store.addBook(b1);
		store.addBook(b2);
		store.addBook(b3);
		store.addBook(b4);
		

	}

	/**
	 * tests the addition of book
	 * 
	 */

	@Test
	public void testAddBook() {
		store.addBook(b5);
		assertTrue(store.getBooks().contains(b5));

	}

	/**
	 * tests the deletion of book
	 * 
	 */

	@Test
	public void testDeleteBook() {
		store.deleteBook(b1);
		assertFalse(store.getBooks().contains(b1));

	}

	/**
	 * tests sorting of books by author name
	 * 
	 */

	@Test
	public void testGetBooksSortedByAuthor() {
		BookStore store2 = new BookStore();
		store2.addBook(b3);
		store2.addBook(b1);
		store2.addBook(b2);
		store2.addBook(b4);
		assertEquals(store2.getBooks(), store.getBooksSortedByAuthor());

	}

	/**
	 * tests sorting of books by title
	 * 
	 */

	@Test
	public void testGetBooksSortedByTitle() {
		BookStore store2 = new BookStore();
		store2.addBook(b4);
		store2.addBook(b3);
		store2.addBook(b1);
		store2.addBook(b2);
		assertEquals(store2.getBooks(), store.getBooksSortedByTitle());

	}

	/**
	 * tests the number of copies of book in store
	 * 
	 */

	@Test
	public void testCountBookWithTitle() {
		
		assertEquals(2, store.countBookWithTitle("To Kill a Mockingbird"));
		assertEquals(1, store.countBookWithTitle("Harry Potter and the Sorcerer's Stone"));

	}
	
	@Test
	public void testGetBooks() {
		BookStore expectedBookstore = new BookStore();
		expectedBookstore.addBook(b1);
		expectedBookstore.addBook(b2);
		expectedBookstore.addBook(b3);
		expectedBookstore.addBook(b4);
		
		assertEquals(expectedBookstore.getBooks(), store.getBooks());
	}

}
