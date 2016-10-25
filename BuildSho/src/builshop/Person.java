package builshop;

public class Person {
	protected String firstname;
	protected String lastname;
	protected String address;
        protected int age;
	protected String email;
        
        public void setAge(String s) {
		firstname = s;
	}

	public String getAge() {
		return firstname;
	}
	
	public void setFirstName(String s) {
		firstname = s;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setLastName(String s) {
		lastname = s;
	}

	public String getLastName() {
		return lastname;
	}

	public void setEmail(String s) {
		email = s;
	}

	public String getEmail() {
		return email;
	}

}
