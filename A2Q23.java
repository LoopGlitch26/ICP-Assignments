//Write a program that takes three int values from the command line and prints them in
//ascending order. Use Math.min() and Math.max().

public class A2Q23 {
public static void main(String[] args) {
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
int max=Math.max(a,Math.max(b,c));
int min=Math.min(a,Math.min(b,c));
int median=(a+b+c)-max-min;
System.out.println(min+" "+median+" "+max);
}
}