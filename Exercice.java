package poo_base_exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charLength();
		toLowerAndUpperCase();
		System.out.println(replace("Hello"));
		Livre livre1 = new Livre("Thomas", "Henriet", "Horreur", "978-2070584642");
		Bibliotheque maBibliothèque = new Bibliotheque();
		System.out.println(maBibliothèque.getInfo(livre1));
		Triangle tri = new Triangle();
		System.out.println("La distance entre le point a et b est de : " + tri.getDistanceAB());
		System.out.println("La distance entre le point a et c est de : " + tri.getDistanceAC());
		System.out.println("La distance entre le point b et c est de : " + tri.getDistanceBC());
		System.out.println("Le périmètre du triangle est de : " + tri.getPerimeter());
		System.out.println("L'aire du triangle est de : " + tri.getArea());
		System.out.println("Les coordonnées du point a sont : " + tri.getA().getX() + " et " + tri.getA().getY());
		tri.move(3);
		System.out.println(
				"Les nouvelles coordonnées du point a sont : " + tri.getA().getX() + " et " + tri.getA().getY());
		tri.downsize(4);
		System.out.println(
				"Les nouvelles coordonnées du point a sont : " + tri.getA().getX() + " et " + tri.getA().getY());

		Etudiant paul = new Etudiant("Paul", "Heimer", 12, 14, 6, 13);
		System.out.println("La moyenne des notes de "+ paul.getFirstname()+" est de : "+paul.average());
		System.out.println("Les initiales de "+ paul.getFirstname()+" sont : "+paul.getInitials());
		System.out.println("Le trigramme de "+ paul.getFirstname()+" sont : "+paul.getTrigram());
		Voiture voiture1 = new Voiture();
		Voiture voiture2 = new Voiture("Red", "Ferrari");
		Voiture voiture3 = new Voiture(voiture2);
	}

	public static void charLength() {
		Scanner input = new Scanner(System.in);
		System.out.print("Entre des caractères: ");
		String data = input.nextLine();
		System.out.println("Le nombre de caractères rentrés est : " + data.length());
	}

	public static void toLowerAndUpperCase() {
		Scanner input = new Scanner(System.in);
		System.out.print("Entre des caractères: ");
		String data = input.nextLine();
		System.out.println("Voici les caractères en minuscule : " + data.toLowerCase());
		System.out.println("Voici les caractères en majuscule : " + data.toUpperCase());
		input.close();
	}

	public static String replace(String str) {
		String[] arr = str.split("");
		for (int i = 1; i < arr.length; i = i + 2) {
			arr[i] = "*";
		}
		return Arrays.toString(arr);
	}
}
