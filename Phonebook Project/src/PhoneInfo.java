/*2017.10.12 ��ȭ��ȣå  */
public class PhoneInfo {
	String name;
	String phonenumber;
	String birthday;

	
	public PhoneInfo(){
		System.out.println("�����ϼ���...");
		System.out.println("1.�������Է�");
		System.out.println("2.�����Ͱ˻�");
		System.out.println("3.�����ͻ���");
		System.out.println("4.���α׷� ����");
		System.out.print("����: ");
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
		System.out.println("�Էµ� ���� ���...");
		System.out.println("name : " + getName());
		System.out.println("phone : " + getPhonenumber());
		System.out.println("birth : " + getBirthday());
	}

}