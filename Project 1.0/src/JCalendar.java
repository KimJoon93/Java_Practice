import java.util.Calendar;
import java.util.Scanner;

public class JCalendar {
	static int year, month;
	static String[] dayform = { "일", "월", "화", "수", "목", "금", "토" };
	static String[][] dateform = new String[6][7];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JCalendar.scanning();
		Calendar jcal = Calendar.getInstance();

		int nowyear = jcal.get(Calendar.YEAR);
		int nowmonth = jcal.get(Calendar.MONTH);
		int nowdate = jcal.get(Calendar.DATE);

		System.out.println("현재날짜 : " + nowyear + "년 " + (nowmonth + 1) + "월 " + nowdate + "일");
		System.out.println(" ");

		jcal.set(Calendar.YEAR, year);
		jcal.set(Calendar.MONTH, month - 1);

		int lastday = jcal.getActualMaximum(Calendar.DATE);
		int startday = jcal.get(Calendar.DAY_OF_WEEK);
		int day = 1;
		
		
//		System.out.println("StartDay: "+startday);
		/* 숫자 표시 */
		for (int i = 0; i < dateform.length; i++) {

			for (int j = 0; j < dateform[i].length; j++) {
				if (day < (lastday + 1)) {

					if (i == 0 && j < startday-1) {
						dateform[i][j] = "";
					} else if (day == nowdate && year == nowyear && month == (nowmonth + 1)) {
						dateform[i][j] = "★";
						day++;
					} else {
						dateform[i][j] = String.valueOf(day);
						day++;
					}

				} else if (day > lastday) {
					dateform[i][j] = "";
				}

			}
		}

		/* 요일 표시 */
		for (int i = 0; i < dayform.length; i++) {
			System.out.print(dayform[i]+"\t");
		}

		/* 날짜 표시 */
		for (int i = 0; i < dateform.length; i++) {
			System.out.println("\t");

			for (int j = 0; j < dateform[i].length; j++) {

				System.out.print(dateform[i][j]+"\t");
			}
		}
	}

	public static int getYear() {
		return year;
	}

	public static void setYear(int year) {
		JCalendar.year = year;
	}

	public static int getMonth() {
		return month;
	}

	public static void setMonth(int month) {
		JCalendar.month = month;
	}

	public static void scanning() {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하시오: ");
		year = sc.nextInt();
		System.out.print("월을 입력하시오: ");
		month = sc.nextInt();
		System.out.println("검색날짜 : " + year + "년 " + month + "월");
	}

	public static void calendarinfo() {

	}

}