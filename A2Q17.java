//Write a java program that takes three positive integers as command-line arguments and
//prints true if any one of them is greater than or equal to the sum of the other two and false
//otherwise. (Note: This computation tests whether the three numbers could be the lengths of
//the sides of some triangle.)

public class A2Q17 {
public static void main(String[] args) {
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
boolean res=((a+b)>=c)||((b+c)>=a)||((a+c)>=b);
System.out.println(res);
}
}