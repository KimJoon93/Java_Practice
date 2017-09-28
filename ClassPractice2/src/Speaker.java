
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
		//0보다 작으면 null이 뜨게
		// || or && and
		if (volume<0 || volume>MAX_VOLUME) {
			String msg = volume<0 ? "너무 작은 볼륨을 입력하셨습니다." : "볼륨이 너무 큽니다.";
			System.out.println(msg);
			return false;
		}
		this.volume = volume;
		return true;
	}
}
