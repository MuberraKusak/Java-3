
public class Main {

	public static void main(String[] args) {
		
		Student nobleStudent = new Student();
		nobleStudent.seteMail("mbr@gmail.com");
		nobleStudent.setRegisteredTrainings(10);
		nobleStudent.setName("Müberra");
		nobleStudent.setPhoneNumber("536 666 66 66");
		nobleStudent.setSurName("it Kuþak");
		
		Instructor nobleInstructor = new Instructor();
		nobleInstructor.seteMail("engn@gmail.com");
		nobleInstructor.setName("Engin");
		nobleInstructor.setPhoneNumber("534 444 44 44");
		nobleInstructor.setPreparedTrainings(20);
		nobleInstructor.setSurName("Demiroð");
		
		UserManager usermanager = new UserManager();
		StudentManager studentmanager = new StudentManager();
		InstructorManager instructormanager = new InstructorManager();
		
		usermanager.add(nobleStudent);
		usermanager.add(nobleInstructor);
		studentmanager.numberOfLessons(nobleStudent);
		instructormanager.training(nobleInstructor);
		
		
		

	}

}
