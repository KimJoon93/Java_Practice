
public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonProject person01 = SingletonProject.getInstance();
		System.out.println(person01.getName());
		person01.setName("라이언");
		
		SingletonProject person02 = SingletonProject.getInstance();
		System.out.println(person02.getName());
		
		/* private으로 constructer 을 잠궈놨기 떄문에 새로운 싱글사람을 만들 수 없다. */
		SingletonProject person03 = new SingletonProject();
		System.out.println(person03.getName());
	
	}

}
