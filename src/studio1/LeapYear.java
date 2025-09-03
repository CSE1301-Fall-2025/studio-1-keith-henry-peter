package studio1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner LeapYear = new Scanner(System.in);
        System.out.println("Please enter the number of the year. ");
        int YearNum = LeapYear.nextInt();
        Boolean Leap = ((YearNum%4 == 0) && (YearNum%100 != 0)) || (YearNum%400 == 0);
        System.out.println(Leap);
	}

}
