import java.util.Scanner;

public class LibraryCatalogSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LibraryCatalog catalog = new LibraryCatalog();
		boolean exit = false;

		while (!exit) {
			System.out.println("\nLibrary Catalog System");
			System.out.println("1. Add Book");
			System.out.println("2. Search Book by Title");
			System.out.println("3. Search Book by Author");
			System.out.println("4. List All Books");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
				case 1:
					System.out.print("Enter book title: ");
					String title = scanner.nextLine();
					System.out.print("Enter book author: ");
					String author = scanner.nextLine();
					catalog.addBook(title, author);
					break;
				case 2:
					System.out.print("Enter book title to search: ");
					title = scanner.nextLine();
					catalog.searchByTitle(title);
					break;
				case 3:
					System.out.print("Enter author name to search: ");
					author = scanner.nextLine();
					catalog.searchByAuthor(author);
					break;
				case 4:
					catalog.listBooks();
					break;
				case 5:
					exit = true;
					System.out.println("Exiting the system...");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
		scanner.close();
	}
}
