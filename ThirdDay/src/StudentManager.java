
public class StudentManager extends UserManager {
	
	public void numberOfLessons (Student student) {
		
		System.out.println(student.name + "" + student.surName + "" +
		"Adlı Kullanıcının Aldığı Eğitim Sayısı: " + student.registeredTrainings);
	}

}
