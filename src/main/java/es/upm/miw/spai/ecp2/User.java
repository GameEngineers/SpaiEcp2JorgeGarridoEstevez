package es.upm.miw.spai.ecp2;

public class User {

	private int number;

	private String name;

	private String familyName;

	public User(int number, String name, String familyName) {
		this.number = number;
		this.name = this.format(name);
		this.familyName = this.format(familyName);
	}

	private String format(String string) {
		string = string.trim();
		return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
	}

	public String fullName() {
		return this.name + " " + this.familyName;
	}

	public String initials() {
		return this.name.substring(0, 1) + ".";
	}

	public int getNumber() {
		return this.number;
	}

	public String getName() {
		return this.name;
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public String AbbrFullName() {
		return (this.initials() + " " + this.familyName);

	}

	public String upperFullName() {
		return (this.name.toUpperCase());

	}

}
