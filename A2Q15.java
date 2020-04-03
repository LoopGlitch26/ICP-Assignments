//Write a java program that takes two int values a and b from the command line and prints
//a random integer between a and b.

public class A2Q15 {
public static void main(String[] args) {
int min;
int max;
min=Integer.parseInt(args[0]);
max=Integer.parseInt(args[1]);
int c=min+(int)(Math.random()*(max-min+1));
System.out.println("c="+c);
}
}