
public class PhoneunivInfo extends PhoneInfo{
	String major;
	int year;
	
	public PhoneunivInfo(String name, String phonenumber, String major, int year) {
		System.out.println("생성자 호출!");
		this.major = major;
		this.year = year;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void showPhoneunivInfo() {
		System.out.println("입력된 정보 출력...");
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getPhonenumber());
		System.out.println("전공: "+ getMajor());
		System.out.println("학년:" + getYear());
		
	}
	
	
	
}
