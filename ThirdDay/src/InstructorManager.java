
public class InstructorManager extends UserManager {

	public void training (Instructor instructor) {
		
		System.out.println(instructor.name + "" + instructor.surName + "" +
		"Adl� E�itmenin Haz�rlam�� Oldu�u E�itim Say�s�: " + instructor.preparedTrainings);
	}
}
