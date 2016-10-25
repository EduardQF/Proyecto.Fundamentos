package builshop;

public class User extends Person{
	private String id;
	private String password;
	private String access;

	public User(String id, String password, String access, String firstname, String lastname,String age, String email) {
		this.age=Integer.valueOf(age);
                this.id = id;
		this.password = password;
		this.access = access;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public void setID(String s) {
		id = s;
	}

	public String getID() {
		return id;
	}

	public void setPassword(String s) {
		password = s;
	}

	public String getPassword() {
		return password;
	}

	public void setAccess(String s) {
		access = s;
	}

	public String getAccess() {
		return access;
	}

}
