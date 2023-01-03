package poo_base_exercices;

public class Livre {
	private String authorFirstname;
	private String authorLastname;
	private String category;
	private String isbn;

	public Livre(String authorFirstname, String authorLastname, String category, String isbn) {
		this.authorFirstname = authorFirstname;
		this.authorLastname = authorLastname;
		this.category = category;
		this.isbn = isbn;
	}

	public String getAuthorFirstname() {
		return this.authorFirstname;
	}

	public String getAuthorLastname() {
		return this.authorLastname;
	}

	public String getCategory() {
		return this.category;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public String getCode() {
		String result = "";
		int isbnLength = getIsbn().length();
		result += getAuthorFirstname().substring(0, 2) + getAuthorLastname().substring(0, 2) + getCategory().charAt(0)
				+ getIsbn().substring(isbnLength - 3, isbnLength - 1);
		return result.toUpperCase();
	}

}
