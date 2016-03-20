public class Person {

    private String firstName;
    private String lastName; 
	private String age;
	private String address;
	
	public Person(String firstName, String lastName, String age String, address){
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
		this.setAddress(address);
	}

    public void setFirstName(String firstName) throws IllegalArgumentException {
		if(firstName.isEmpty()) {
			throw new IllegalArgumentException("First name can't be empty");
		}
        this.firstName = firstName;
    }

    public void setLastName(String lastName) throws IllegalArgumentException {
		if(lastName.isEmpty()) {
			throw new IllegalArgumentException("Last name can't be empty");
		}
        this.lastName = lastName;
    }
	
	public void setAge(String age) {
        this.age = age;
    }
	
	public void setAddress(String address) {
        this.address = address;
    }
	
}