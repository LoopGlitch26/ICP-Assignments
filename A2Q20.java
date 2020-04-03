//Write a program that takes two int values m and d from the command line and prints true
//if day d of month m is between 3/20 and 6/20, false otherwise.

public class A2Q20 {
public static void main(String[] args) {
int m,d;
m=Integer.parseInt(args[0]);
d=Integer.parseInt(args[1]);
boolean res=(m==3&&d>=20)||(m==4&&d<=30)||(m==5&&d<=31)||(m==6&&d<=20);
System.out.println(res);
}
}