/* ΩÃ±€≈Ê - 2017.09.20  */
public class SingletonProject {
	private	int age;
	private String name;
	private static SingletonProject instance = null;
	
	//constructor
	private SingletonProject (){
		System.out.println("√÷√ ª˝º∫");
		this.name = "±Ë¡ÿ";
		this.age = 25;
		
	}
	public static SingletonProject getInstance(){
		if (instance == null){
			instance = new SingletonProject();
		}
		return instance;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
