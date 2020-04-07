//The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained using the following
//formula: b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
//equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation
//has no real roots.
//Write a program that prompts the user to enter values for a, b, and c and displays the result
//based on the discriminant. If the discriminant is positive, display two roots. If the discriminant
//is 0, display one root. Otherwise, display “The equation has no real roots”. Note that you
//can use Math.pow(x, 0.5) to compute 2x.

import java.util.Scanner;
public class A3Q5 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a, b, c: ");
double a = input.nextDouble();
double b = input.nextDouble();
double c = input.nextDouble();
double discriminant = Math.pow(b, 2) - 4 * a * c;
System.out.print("The equation has ");
if (discriminant > 0)
{
double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
System.out.println("two roots " + root1 + " and " + root2);
} else if (
discriminant == 0)
{
double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
System.out.println("one root " + root1);
} else
System.out.println("no real roots");
}
}