import java.util.Scanner;

public class Operation {
	static Scanner scaner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BluetoothSpeaker speaker01 = new BluetoothSpeaker();
		speaker01.firststate(false, false);

		scaner = new Scanner(System.in);
		String a = scaner.nextLine();

		if (a.equals("a")) {
			speaker01.startpairing();
			speaker01.pairing = true;
		}
		if (speaker01.pairing = false) {
			
			if (speaker01.connection = true) {
				System.out.println("페어링을 먼저 해주세요.");

			}
			String b = scaner.nextLine();
			if (b.equals("b")) {
				speaker01.startconnection();
				speaker01.connection = true;

			}

		}
	}

}
