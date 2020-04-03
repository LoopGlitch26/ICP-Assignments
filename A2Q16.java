//Write a java program that prints the sum of two random integers between 1 and 6 (such as
//you might get when rolling dice).

public class A2Q16 {
public static void main(String[] args) {
int a,b,res1,res2;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
res1=a+(int)(Math.random()*(a-b+1));
res2=a+(int)(Math.random()*(a-b+1));
int sum=res1+res2;
System.out.println(sum);
}
}