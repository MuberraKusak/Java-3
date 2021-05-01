
public class InstructorManager extends UserManager {

	public void training (Instructor instructor) {
		
		System.out.println(instructor.name + "" + instructor.surName + "" +
		"Adlý Eðitmenin Hazýrlamýþ Olduðu Eðitim Sayýsý: " + instructor.preparedTrainings);
	}
}
