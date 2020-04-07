//Write a java program to input the mark of a student and check if the student mark is
//greater than or equal to 40, then it generates the following message.
//”Congratulation! You have passed the exam.”
//Otherwise the output message is
//”Sorry! You have failed the exam.”

import java.util.Scanner;
public class A3Q2 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int mark;
System.out.println("Enter the mark of the student");
mark=sc.nextInt();
if(mark>=40)
System.out.println("Congratulations! You have passed the exam");
else
System.out.println("sorry! you have failed the exam");
}
}