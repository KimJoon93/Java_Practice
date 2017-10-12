/*2017.10.12 전화번호책  */
public class PhoneInfo {
	String name;
	String phonenumber;
	String birthday;

	
	public PhoneInfo(){
		System.out.println("선택하세요...");
		System.out.println("1.데이터입력");
		System.out.println("2.데이터검색");
		System.out.println("3.데이터삭제");
		System.out.println("4.프로그램 종료");
		System.out.print("선택: ");
	}
	
//	public PhoneInfo(String name, String phonenumber, String birthday) {
//		this.name = name;
//		this.phonenumber = phonenumber;
//		this.birthday = birthday;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void dataInfo() {

	}

	public void showPhoneInfo() {
		System.out.println("입력된 정보 출력...");
		System.out.println("name : " + getName());
		System.out.println("phone : " + getPhonenumber());
		System.out.println("birth : " + getBirthday());
	}

}