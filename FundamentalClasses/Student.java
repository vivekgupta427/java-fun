package equalsandhashcode;

public class Student {
	
	private String registrationNumber;
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Student(String registrationNumber){
		this.registrationNumber = registrationNumber;
	}
	
	public boolean equals(Object o){
		//System.out.println("From Map....Equals");
		if(o!=null && o instanceof Student){
			String regNumber = ((Student)o).getRegistrationNumber();
			if(regNumber != null && regNumber.equals(this.getRegistrationNumber())){
				return true;
			}
		}
		return false;
	}
	
	public int hashCode(){
		//System.out.println("From Map...HashCode");
		return this.registrationNumber.hashCode();
	}

}
