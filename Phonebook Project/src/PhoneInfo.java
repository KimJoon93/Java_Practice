/*2017.10.12 전화번호부  */
public class PhoneInfo {
	private String name;
	private String phonenumber;
	private String birthday;

	
	public PhoneInfo(){

	}
	
	public PhoneInfo(String name, String phonenumber, String birthday) {
		System.out.println("셍성자 호출!!");
		this.name = name;
		this.phonenumber = phonenumber;
		this.birthday = birthday;
	}

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