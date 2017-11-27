
public class PhonecompanyInfo extends PhoneInfo {

	String company;

	public PhonecompanyInfo(String name, String phonenumber, String company) {
		/* 상속받으면 부모의 생성자를 super를 이용하여 호출 가능합니다. */
		super(name, phonenumber);
		this.company = company;
//		this.name = name;
//		this.phonenumber = phonenumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void showphonecompanyInfo() {
		System.out.println("입력된 정보 출력중...");
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getPhonenumber());
		System.out.println("회사: " + getCompany());
	}
}
