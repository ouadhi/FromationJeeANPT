
public class User {
	public long id ; 
	public String firstname; 
	public String lastname; 
	public String company;
	public User(long id, String firstname, String lastname, String company) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.company = company;
	}
	public User(String firstname, String lastname, String company) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.company = company;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getCompany() {
		return company;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", company=" + company + "]";
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
}
