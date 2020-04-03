//Write a java program to exchange the values of two variables of integer type A and B using
//third temporary variable C.

public class A1Q7 {
public static void main(String[] args) {
int a,b,c;
a=12;
b=15;
System.out.println("Before swapping a="+a+" b="+b);
c=a;
a=b;
b=c;
System.out.println("After swapping a="+a+" b="+b);
}
}