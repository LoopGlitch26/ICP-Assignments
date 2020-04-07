//Input an integer through the keyboard. Write a java program to find out whether it is an
//odd number or even number.

import java.util.Scanner;
public class A3Q3 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter a number");
n=sc.nextInt();
if(n%2==0)
System.out.println("Even number");
else
System.out.println("Odd number");
}
}