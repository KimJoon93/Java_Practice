
public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonProject person01 = SingletonProject.getInstance();
		System.out.println(person01.getName());
		person01.setName("���̾�");
		
		SingletonProject person02 = SingletonProject.getInstance();
		System.out.println(person02.getName());
		
		/* private���� constructer �� ��ų��� ������ ���ο� �̱ۻ���� ���� �� ����. */
		SingletonProject person03 = new SingletonProject();
		System.out.println(person03.getName());
	
	}

}
