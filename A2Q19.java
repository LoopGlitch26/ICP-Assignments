//Input the basic salary of an employee of an organization through the keyboard. His
//dearness allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of
//basic salary. Write a java program to calculate his gross salary.

public class A2Q19 {
public static void main(String[] args) {
double basic,HRA,DA,gross;
System.out.println("Enter the basic salary of the person");
basic=Double.parseDouble(args[0]);
DA=0.40*basic;
HRA=0.20*basic;
gross=basic+DA+HRA;
System.out.println("The gross salary is: "+gross);
}
}