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
				System.out.print("이름: ");
				name = scan.next();
				phonebook.setName(name);
				System.out.print("전화번호: ");
				num = scan.next();
				phonebook.setPhonenumber(num);
				System.out.print("생년월일: ");
				birth = scan.next();
				phonebook.setBirthday(birth);
				if (phonebook.birthday == null){
					phonebook.setBirthday("생일을 입력해주세요");
				}
					
				phonebook.showPhoneInfo();
				new PhoneInfo();
				
			}

			  else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다");
				return;
			}
			
		}while (menu!= -1);
	}
}
