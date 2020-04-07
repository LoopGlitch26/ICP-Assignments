//Any character is entered through the keyboard, write a java program to determine whether
//the character entered is a capital letter, a small case letter, a digit or a special symbol. The following
//table shows the range of ASCII values for various characters.
//Characters ASCII Values
//A – Z 65 – 90
//a – z 97 – 122
//0 – 9 48 – 57
//special symbols 0 - 47, 58 - 64, 91 - 96, 123 – 127

import java.util.Scanner;
public class A3Q4 {
public static void main(String[] args) {
char c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character");
c=sc.next().charAt(0);
if(c>=65 && c<=90)
System.out.println("The entered character is an uppercase");
else if(c>=97 && c<=122)
System.out.println("The entered character is a lower case");
else if(c>=48 && c<=57)
System.out.println("It is a digit");
else if((c>=0 && c<=47) || (c>=58 && c<=64) || (c>=91 && c<=96) || (c>=123 &&
c<=127))
System.out.println("It is a special Character");
}
}