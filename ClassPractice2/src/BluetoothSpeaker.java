/*2017.9.27 ������� ����Ŀ �޼ҵ� �ۼ�*/
// paring �̹� �� �Ǿ��ֽ��ϴ�. true false 
// connect ���� �Ǿ�� Ŀ���� �ǰԲ� �޼ҵ带 ������ ������ �����ߵ� �ȵǸ� ������ �ٽ� ���ߵ� 
// ���͸� , ���͸�üũ �ο� ���� , �����ϴ� �޼ҵ� , ������ �ϸ� ���͸��� �ø� , ���͸� ���� 

public class BluetoothSpeaker extends Speaker {
	
	int volume ;
	Boolean pairing;
	Boolean connection;
	int battery;
	Boolean charging;
	final int MAX_BATTERY = 100;
	
	
	/*���͸� ���� constructor*/
	public Boolean batterypercent(int battery) {
		if (battery < 0 || battery > MAX_BATTERY) {
			String msg = battery < 0 ? "���͸��� �����մϴ�." : "������ �Ϸ�Ǿ����ϴ�";
			System.out.println(msg);
			return false;
		}
		this.battery = battery;
		return true;
	}
	/*speaker main constructor*/
	public BluetoothSpeaker (){
		System.out.println("JOON�����Դϴ�. \n1���� �����ø� ������ �õ� �ϰڽ��ϴ�." );
		this.pairing = true;
	}
	
	
	public void startpairing (){
		setPairing(true);
		System.out.println("���� �����ϰڽ��ϴ�");
	}
	public void startconnection(){
		setConnection(true);
		System.out.println("�����ϰڽ��ϴ�.");
	}
	public void stoppairing(){
		System.out.println("���� ���ڽ��ϴ�.");
	}
	public void stopconnection(){
		System.out.println("������ ���ڽ��ϴ�. ");
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