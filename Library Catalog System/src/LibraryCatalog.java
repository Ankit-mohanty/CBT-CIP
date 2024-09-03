import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
	private List<Book> books;

	public LibraryCatalog() {
		this.books = new ArrayList<>();
	}

	public void addBook(String title, String author) {
		books.add(new Book(title, author));
		System.out.println("Book added successfully!");
	}

	public void listBooks() {
		if (books.isEmpty()) {
			System.out.println("No books in the catalog.");
		} else {
			System.out.println("Listing all books:");
			for (Book book : books) {
				System.out.println(book);
			}
		}
	}

	public void searchByTitle(String title) {
		boolean found = false;
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				System.out.println("Found: " + book);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No book found with the title: " + title);
		}
	}

	public void searchByAuthor(String author) {
		boolean found = false;
		for (Book book : books) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				System.out.println("Found: " + book);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No book found by the author: " + author);
		}
	}
}
