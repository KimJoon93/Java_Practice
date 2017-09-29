/*2017.9.27 블루투스 스피커 메소드 작성*/
// paring 이미 페어링 되어있습니다. true false 
// connect 페어링이 되어야 커넥이 되게끔 메소드를 만들어라 에러도 만들어야됨 안되면 페어링으로 다시 가야됨 
// 베터리 , 베터리체크 로우 하이 , 충전하는 메소드 , 차지를 하면 베터리를 올림 , 베터리 제한 

public class BluetoothSpeaker extends Speaker {
	
	int volume ;
	Boolean pairing;
	Boolean connection;
	int battery;
	Boolean charging;
	final int MAX_BATTERY = 100;
	
	
	/*베터리 충전 constructor*/
	public Boolean batterypercent(int battery) {
		if (battery < 0 || battery > MAX_BATTERY) {
			String msg = battery < 0 ? "베터리가 부족합니다." : "충전이 완료되었습니다";
			System.out.println(msg);
			return false;
		}
		this.battery = battery;
		return true;
	}
	/*speaker main constructor*/
	public BluetoothSpeaker (){
		System.out.println("JOON투스입니다. \n1번을 누르시면 연결을 시도 하겠습니다." );
		this.pairing = true;
	}
	
	
	public void startpairing (){
		setPairing(true);
		System.out.println("페어링을 시작하겠습니다");
	}
	public void startconnection(){
		setConnection(true);
		System.out.println("연결하겠습니다.");
	}
	public void stoppairing(){
		System.out.println("페어링을 끊겠습니다.");
	}
	public void stopconnection(){
		System.out.println("연결을 끊겠습니다. ");
	}
	public Boolean getPairing() {
		return pairing;
	}
	public void setPairing(Boolean pairing) {
		this.pairing = pairing;
	}
	public Boolean getConnection() {
		return connection;
	}
	public void setConnection(Boolean connection) {
		this.connection = connection;
	}
	
	
}