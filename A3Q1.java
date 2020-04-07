//Write a java program to input the height of the person and check if the height of the person
//is greater than or equal to 6 feet then print the message “The person is tall”.

import java.util.Scanner;
public class A3Q1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int h;
System.out.println("Enter the height of the person");
h=sc.nextInt();
if(h>6)
System.out.println("The person is tall");
}
}