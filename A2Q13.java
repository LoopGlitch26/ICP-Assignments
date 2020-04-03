//Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays
//the number of years and days for the minutes. For simplicity, assume a year has 365 days.

import java.util.Scanner;
public class A2Q13 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of minutes: ");
int minutes = input.nextInt();
int years = minutes / 525600;
int days = (minutes % 525600) / 1440;
System.out.println(minutes + "minutes is approximately " + years + " years and " + days + " days");
}
}