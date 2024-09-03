public class Book {
	private String title;
	private String author;

	public Book( String title, String author ) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public Book setTitle( String title ) {
		this.title = title;
		return this;
	}

	public String getAuthor() {
		return author;
	}

	public Book setAuthor( String author ) {
		this.author = author;
		return this;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Book{");
		sb.append("title='").append(title).append('\'');
		sb.append(", author='").append(author).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
