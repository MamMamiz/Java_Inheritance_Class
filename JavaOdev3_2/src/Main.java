
public class Main {

	public static void main(String[] args) {
		 
		
		User user1 = new User(1,"Programmer", "ytd@gmail.com" , "Java");
		User user2 = new User(2 , "cmdczvine" , "cmdczvine@gmail.com", "C#");
		
		
		User [] users = { user1 ,user2 };
		
		for (User data : users) {
			
			System.out.println("-ID = " + data.getId() + ", -Name = " + data.getName() + ", -Email = " + data.getEmail() + ", -Course Name = " + data.getCourseName());
		}
		
		System.out.println("----------------------------------------------------------------------------");
		
		
		Student student1 = new Student (10, "Muhammet", "mamibaba@gmail.com", "Çakýr" ,"15803223424" );
		Student student2 = new Student (20, "Yusuf", "yusufbaba@gmail.com", "Yýldýz" ,"15803223111" );
		
		Student [] students = {student1 , student2};
	
		for (Student data : students) {
			
			System.out.println("-ID = " + data.getId() + ", -Name = " + data.getName() + ", -Surname =" + data.getSurName() + ", -Email = " + data.getEmail() + ", -NationlityIdenty = " + data.getNationlityIdenty());
			
			
		}
		
		System.out.println("----------------------------------------------------------------------------");
		
		Instructor instructor1 = new Instructor(100 , "Engin","Demiroð","engindemiroð@gmail.com" , "Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarýna sahip");
		Instructor instructor2 = new Instructor(200 , "Þadi Evren","Þeker","þadievren@gmail.com" , "CEO (Optiwisdom) / Akademisyen (Antalya Bilim Üniversitesi) ");
		
		Instructor [] insttructors = { instructor1 , instructor2};
		
		for (Instructor data : insttructors) {
			
			System.out.println("-ID = " + data.getId() + ", -Name = " + data.getName() + ", -Surname =" + data.getSurName() + ", -Email = " + data.getEmail() + ", -Detail = " + data.getDetail());
		}
		
			

		}

}
