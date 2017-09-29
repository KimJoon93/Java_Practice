import java.util.Scanner;

public class Operation {
	static Scanner scaner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BluetoothSpeaker speaker01 = new BluetoothSpeaker();

		speaker01.setPairing(false);
		speaker01.setConnection(false);

		scaner = new Scanner(System.in);

		int a = scaner.nextInt();
		if (a == 1) {
			speaker01.startpairing();

		}
		int b = scaner.nextInt();
		if (b == 2) {
			System.out.println(speaker01.pairing);
			if (speaker01.pairing = false) {
				System.out.println("페어링을 먼저 해주세요.");
				return;
			}
			if (speaker01.pairing = true) {
				speaker01.startconnection();
				}
			}

		}
	}


