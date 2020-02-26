package ex1;

public class Person {
	
	/*Person's attribute*/
	private String firstName;
	private String lastName;
	private int age;
	private String socialNumber;
	private String education;
	private Address address;
	
	/*Person methods*/
	
	//constructors
	Person(){}
	
	Person(String firstName, String lastName){
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	Person(String firstName, String lastName, Address address){
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.address = address;
	}
	
	//sets and gets methods
	public String getAddress() {
		return address.toString();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSocialNumber() {
		return socialNumber;
	}

	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	//class methods
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
	
	public void introduce() {}

	
	/*inner class address*/
	public static class Address{
		private String streetNumber = "";
		private String streetName = "";
		private String cityName = "";
		private String zipCode = "";
		private String state = "";
		
		Address(){
		}
		
		Address(String streetNumber, String streetName, String cityName,
				String state, String zipCode){
			this.setStreetNumber(streetNumber);
			this.setStreetName(streetName);
			this.setCityName(cityName);
			this.setState(state);
			this.setZipCode(zipCode);
		}
		
		/*setters defined here*/
		public void setStreetName(String streetName) {
			this.streetName = streetName;
		}
		
		public void setStreetNumber(String streetNumber) {
			this.streetNumber = streetNumber;
		}
		
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		
		public void setState(String state) {
			this.state = state;
		}
		
		/*getters defined here*/
		public String getStreetNumber() {
			return streetNumber;
		}
		
		public String getStreetName() {
			return streetName;
		}
		
		public String getCity() {
			return cityName;
		}
		
		public String getZipCode() {
			return zipCode;
		}
		
		public String getState() {
			return state;
		}
		
		//methods
		@Override
		public String toString() {
			return streetNumber + " " + streetName + " "
					+ cityName + " " + state + " " +zipCode;
		}
		
	}
}
