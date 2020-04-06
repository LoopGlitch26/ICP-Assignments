//Write a java program that takes a double value t from the command line and prints the
//value of sin (2t) + sin (3t).

public class A2Q21 {
public static void main(String[] args) {
double t,sum;
t=Double.parseDouble(args[0]);
t=Math.toRadians(t); // convert degree to radian
sum=Math.sin(2*t)+Math.sin(3*t);
System.out.println(sum);
}}