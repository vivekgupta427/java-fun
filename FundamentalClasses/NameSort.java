import java.util.*;


public class NameSort {

	public static void main(String[] args) {
		
		Name [] names = {
				new Name ("Vivek","Gupta"),
				new Name ("Rakshi","Mishra"),
				new Name ("Babita","Gangil"),
				new Name ("Manju", "Kushwah")
		};
		
		List <Name> namesList = Arrays.asList(names);
		Collections.sort(namesList);
		System.out.println(namesList);
		Name name = new Name("A","B");
		System.out.println(name.getFirstName()+" "+name.getLastName());
		System.out.println(name.hashCode());
		
		
		
		
	}
	
	

}
