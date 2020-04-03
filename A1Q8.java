//Write a java program to exchange the values of two variables of integer type A and B
//without using third temporary variable.

public class A1Q8 {
public static void main(String[] args) {
int a=14;
int b=17;
System.out.println("Before swapping a="+a+" b="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping a="+a+" b="+b);
}
}