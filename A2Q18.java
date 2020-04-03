//Write a java program that takes three double values x, y, and z as command-line
//arguments and prints true if the values are strictly ascending or descending (x<y<z or x>y>z),
//and false otherwise.

public class A2Q18 {
public static void main(String[] args) {
int x,y,z;
x=Integer.parseInt(args[0]);
y=Integer.parseInt(args[1]);
z=Integer.parseInt(args[2]);
boolean res=((x<y&&y<z)||(x>y&&y>z));
System.out.println(res);
}
}