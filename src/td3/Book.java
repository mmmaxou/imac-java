package td3;

import java.util.Objects;

/**
 * @author mpluchar
 *
 */
public class Book {
	
	/**
	 * @param title
	 */
	public Book(String title) {
		// 9.
		this.title = Objects.requireNonNull(title);
		this.author = "<no author>";
	}

	/**
	 * @param title
	 * @param author
	 */
	public Book(String title, String author) {
		// 8.
		// Il faut utiliser this
		// 11.
		this(title);
		this.author = Objects.requireNonNull(author);
	}
	
	// 5.
	// Un accesseur permet d'offrir une interface pour obtenir un champs private d'une classe
	
	// 6.
	// Il doit etre private
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
	// 8.
	// @Override sert à définir explicitement que l'on redéfinit une méthode
	@Override
	public boolean equals(Object o) {
		return (o instanceof Book &&
				this.getTitle().equals(((Book) o).getTitle()) &&
				this.getAuthor().equals(((Book) o).getAuthor()));
		
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (!author.equals("<no author>")) {
			return "ERROR";
		};
		return title + " by " + author;
	}
	// 1.
	private String title;
	private String author;
}
