
public class Instructor extends BaseData {
	
	String detail;
	String surName;
	
	public Instructor( int id , String name , String surName , String email, String detail  ) {
		
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
		this.setSurName(surName);
		this.setDetail(detail);
		
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}
	

}
