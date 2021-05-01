
public class User extends BaseData{
			
	private String courseName;
	

	public User (int id , String name , String email , String courseName) {
		
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
		this.setCourseName(courseName);
		
		
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
		
	
	
	
	
	

}
