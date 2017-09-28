
public class Speaker {
	// Field - Attribute
	int volume;
	final int MAX_VOLUME = 100;
	// Constructor
	public Speaker(){
		
	}
	
	public Speaker (int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public Boolean setVolume(int volume) {
		//0���� ������ null�� �߰�
		// || or && and
		if (volume<0 || volume>MAX_VOLUME) {
			String msg = volume<0 ? "�ʹ� ���� ������ �Է��ϼ̽��ϴ�." : "������ �ʹ� Ů�ϴ�.";
			System.out.println(msg);
			return false;
		}
		this.volume = volume;
		return true;
	}
}
