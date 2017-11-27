/*2017.10.12 전화번호부  */
public class PhoneInfo {
	public String name;
	public String phonenumber;
	public String birthday;
	
	
	
	public PhoneInfo(String name, String phonenumber, String birthday) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.birthday = birthday;
	}
	/*생일을 추가 하지 않는경우*/
	public PhoneInfo(String name, String phonenumber) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.birthday = "";
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