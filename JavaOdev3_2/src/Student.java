
public class Student extends BaseData {
	
	String surName;
	String nationlityIdenty;
	
	public Student (int id , String name , String surName ,String email, String nationlityIdenty  ) {
		
		this.setId(id);
		this.setName(name);
		this.setSurName(surName);
		this.setEmail(email);
		this.setNationlityIdenty(nationlityIdenty);
		
	}
		
	

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getNationlityIdenty() {
		return nationlityIdenty;
	}

	public void setNationlityIdenty(String nationlityIdenty) {
		this.nationlityIdenty = nationlityIdenty;
	}
	
}
