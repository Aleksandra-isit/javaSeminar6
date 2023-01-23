public class Main{
	public static void main(String[] args){
		User user = new User("Bob", 33);
		SaveManager saveManager = new SaveManager();
		saveManager.saveJson(user);
		saveManager.saveTxt(new User("Vladimir", 29));
	}
}