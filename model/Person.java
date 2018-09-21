package model;

public class Person {

	private String		firstName;
	private String		lastName;

	private String     phone;
	private String		address;

	public Person() {
	}

	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Person(String firstName, String lastName,  String phone, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.phone = phone;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", address=" + address + "]";
	}

}
