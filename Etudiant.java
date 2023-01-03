package poo_base_exercices;

public class Etudiant {
	private String firstname;
	private String lastname;
	private int gradeOne;
	private int gradeTwo;
	private int gradeThree;
	private int gradeFour;

	public Etudiant(String firstname, String lastname, int gradeOne, int gradeTwo, int gradeThree, int gradeFour) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gradeOne = gradeOne;
		this.gradeTwo = gradeTwo;
		this.gradeThree = gradeThree;
		this.gradeFour = gradeFour;
	}

	public double average() {
		return (this.gradeOne + this.gradeTwo + this.gradeThree + this.gradeFour) / 4;
	}

	public String getInitials() {
		String initials = "";
		initials += this.firstname.charAt(0);
		return initials += this.lastname.charAt(0);
	}

	public String getTrigram() {
		String initials = "";
		initials += this.firstname.charAt(0);
		initials += this.lastname.charAt(0);
		initials += this.lastname.charAt(this.lastname.length() - 1);
		return initials.toUpperCase();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getGradeOne() {
		return gradeOne;
	}

	public void setGradeOne(int gradeOne) {
		this.gradeOne = gradeOne;
	}

	public int getGradeTwo() {
		return gradeTwo;
	}

	public void setGradeTwo(int gradeTwo) {
		this.gradeTwo = gradeTwo;
	}

	public int getGradeThree() {
		return gradeThree;
	}

	public void setGradeThree(int gradeThree) {
		this.gradeThree = gradeThree;
	}

	public int getGradeFour() {
		return gradeFour;
	}

	public void setGradeFour(int gradeFour) {
		this.gradeFour = gradeFour;
	}
}
