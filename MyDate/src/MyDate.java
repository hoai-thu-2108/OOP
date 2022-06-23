
import java.util.Calendar;
import javax.swing.JOptionPane;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate() {
		Calendar now = Calendar.getInstance();
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH) + 1; // Note: zero based!
		day = now.get(Calendar.DAY_OF_MONTH);
	}

	public MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printDay() {
		System.out.println("Day:" + day + "/" + month + "/" + year);
	}

	public void accept() {
		String d, m, y;
		d = JOptionPane.showInputDialog(null, "Date: ", "Nhap ngay: ", JOptionPane.INFORMATION_MESSAGE);
		m = JOptionPane.showInputDialog(null, "Date: ", "Nhap thang: ", JOptionPane.INFORMATION_MESSAGE);
		y = JOptionPane.showInputDialog(null, "Date: ", "Nhap nam: ", JOptionPane.INFORMATION_MESSAGE);
		day = Integer.parseInt(d);
		month = Integer.parseInt(m);
		year = Integer.parseInt(y);
		
	}

}
