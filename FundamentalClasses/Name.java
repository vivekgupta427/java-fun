
public class Name implements Comparable <Name> {

	private final String firstName,lastName;
	
	public Name(String firstName, String lastName){
		if(firstName == null || lastName == null){
			throw new NullPointerException();
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Name)){
			return false;
		}
		Name name = (Name) obj;
		return name.lastName.equals(lastName) && name.firstName.equals(firstName);
	}
	
	public int hashCode(){
		return 31*firstName.hashCode() + lastName.hashCode(); 
	}
	
	public String toString(){
		return firstName +" "+ lastName;
	}
	
	@Override
	public int compareTo(Name name) {
		int firstCmp = firstName.compareTo(name.firstName);
		return (firstCmp!=0 ? firstCmp : lastName.compareTo(name.lastName));
		
	}
	
}
