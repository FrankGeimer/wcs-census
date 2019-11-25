
public class Wilder {

	/* Instanzvariablen */
	private String firstname;
	private boolean present;

	/* Konstruktor */
	public Wilder(String firstname, boolean present) {

		this.firstname = firstname;
		this.present = present;

	}

	public String getFirstname() {
		return this.firstname;
	}

	public boolean isPresent() {
		return this.present;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}

	public String whoAmI() {

		if (this.isPresent() == false) {
			return "My name is " + this.getFirstname() + " and I'm not present";
		}
		else {
			return "My name is " + this.getFirstname() + " and I'm present";
		}

	}
}
