//Write a java program that takes two positive integers as command-line arguments and
//prints true if either evenly divides the other.

public class A2Q14 {
public static void main(String[] args) {
int a,b;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
boolean ans=((a%b==0)||(b%a==0));
System.out.println(ans);
}
}