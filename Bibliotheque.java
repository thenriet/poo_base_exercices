package poo_base_exercices;



public class Bibliotheque {

	public String getInfo(Livre livre) {
		String result = "";
		result += livre.getAuthorFirstname() + "\n" + livre.getAuthorLastname() + "\n" + livre.getCategory() + "\n"
				+ livre.getIsbn() + "\n" + livre.getCode();
		return result;
	}
}
