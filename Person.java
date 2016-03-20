public class Person {

    private String firstName;
    private String lastName;    
	
	public Person(String firstName, String lastName){
		this.setFirstName(firstName);
		this.setLastName(lastName);
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
	
}