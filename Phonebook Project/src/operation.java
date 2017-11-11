import java.nio.channels.ShutdownChannelGroupException;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PhoneInfo phonebook = new PhoneInfo("김준", "0109269", "2월17일");
		// PhoneInfo phonebook = null;
		/* 5개의 전화번호를 만들 공간을 생성 */
		PhoneInfo[] phonebook = new PhoneInfo[3];
		// phonebook[1] = new PhoneInfo("김준", "0109269", "2월17일");
		// System.out.println(phonebook[1].getPhonenumber());

		Scanner scan = new Scanner(System.in);

		int count = 0;
		int menu;
		String name;
		String num;
		String birth;

		do {
			showMenu();
			menu = scan.nextInt();

			if (menu == 1) {

				if (count >= phonebook.length) {
					System.out.println("용량이 부족합니다!");
				} else if (phonebook[count] == null) {
					System.out.print("이름: ");
					name = scan.next();
					// phonebook.setName(name);
					System.out.print("전화번호: ");
					num = scan.next();
					// phonebook.setPhonenumber(num);
					System.out.print("생년월일: ");
					birth = scan.next();
					phonebook[count] = new PhoneInfo(name, num, birth);
					phonebook[count].showPhoneInfo();
					count++;
				}

			}

			// phonebook.setBirthday(birth);
			// phonebook = new PhoneInfo(name, num, birth);
			// phonebook.showPhoneInfo();

			else if (menu == 2) {

				boolean search = false;

				if (phonebook == null) {
					System.out.println("저장된 연락처가 업습니다!");
				} else {
					System.out.println("데이터 검색을 시작합니다...");
					System.out.print("이름 :");
					name = scan.next();
					/*
					 * 같다는 주소로 갈수 있으니 조심해야함 그러나 equals는 그 값들이 같은지 확인을 해줌 , string 비교인것을 유의할것 int면 됨
					 * (그냥 == 하는거)
					 */

					for (int i = 0; i < phonebook.length; i++) {
						if (phonebook[i] != null && name.equals(phonebook[i].getName())) {
							phonebook[i].showPhoneInfo();
							search = true;
							break;
						}
					}
					if (!search) {
						System.out.println("검색 결과가 존재하지 않습니다.");
					}
				}
			} else if (menu == 3) {

				boolean delete = false;

				if (phonebook == null) {
					System.out.println("저장된 연락처가 없습니다.");
				} else {
					System.out.println("데이터 삭제를 시작합니다...");
					System.out.print("이름 :");
					name = scan.next();
					for (int i = 0; i < phonebook.length; i++) {
						if (name.equals(phonebook[i].getName())) {
							phonebook[i] = null;
							delete = true;
							System.out.println("데이터 삭제가 완료되었습니다.");
							for(int j=i+1; j<phonebook.length; j++) {
								if(j < phonebook.length) {
								phonebook[i] = phonebook[j];
								phonebook[j] = null;
								}
							}
						}
					}
					if (!delete) {
						System.out.println("지우려는 데이터가 존재하지않습니다.");
					}

				}
			} else if (menu == 4) {
				System.out.println("서버에 정보를 업데이트하고 있습니다.");
			}
			System.out.println("=========================================");
		} while (menu != 4);

	}

	static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.프로그램 종료");
		System.out.print("선택: ");

	}

}
