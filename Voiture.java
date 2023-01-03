package poo_base_exercices;

public class Voiture {

	private String color;
	private String brand;
	private int horsePower;
	
	// constructeur paramétré
	public Voiture(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	
	// constructeur par défaut
	public Voiture() {
		
	}
	
	// constructeur par copie
	 Voiture(Voiture voitureACopier) {
		this.color = voitureACopier.color;
		this.brand = voitureACopier.brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getHorsePower() {
		return horsePower;
	}
	
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
}
