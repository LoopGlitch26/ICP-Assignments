//Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
//For example, if an integer is 932, the sum of all its digits is 14. Hint: Use the % operator
//to extract digits, and use the / operator to remove the extracted digit. For instance, 932 % 10 =
//2 and 932 / 10 = 93.

import java.util.Scanner;
public class A2Q4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n, x, sum=0;
System.out.println("Enter number between 0 and 1000");
n=sc.nextInt();
x=n % 10;
sum=sum + x;
n=n / 10;
x=n % 10;
sum=sum + x;
n=n / 10;
x=n % 10;
sum=sum + x;
n=n / 10;
System.out.println("The sum of the digits is " + sum);
}
}