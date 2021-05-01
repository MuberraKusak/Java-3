
public class UserManager {

	public void add(User user) {
		
		System.out.println(user.name + "" + user.surName + "Kayýt Baþarýyla Eklendi!");
	}
	
	public void delete(User user) {
		
		System.out.println(user.name + "" + user.surName + "Kayýt Baþarýyla Silindi!");
	}
	
	public void update(User user) {
		
		System.out.println(user.name + "" + user.surName + "Kayýt Baþarýyla Güncellendi!");
	}
		
	}
