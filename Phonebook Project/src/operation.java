import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInfo phonebook = new PhoneInfo();
		
		if (phonebook == null)
			return;
		
		Scanner scan = new Scanner(System.in);
		
		int menu;
		String name;
		String num;
		String birth;

		do {	
		menu = scan.nextInt();

			if (menu == 1) {
				System.out.print("�̸�: ");
				name = scan.next();
				phonebook.setName(name);
				System.out.print("��ȭ��ȣ: ");
				num = scan.next();
				phonebook.setPhonenumber(num);
				System.out.print("�������: ");
				birth = scan.next();
				phonebook.setBirthday(birth);
				if (phonebook.birthday == null){
					phonebook.setBirthday("������ �Է����ּ���");
				}
					
				phonebook.showPhoneInfo();
				new PhoneInfo();
				
			}

			  else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {
				System.out.println("���α׷��� �����մϴ�");
				return;
			}
			
		}while (menu!= -1);
	}
}
