//Write a java program that prints five uniform random values between 0 and 1, their
//average value, and their minimum and maximum value. Use Math.random(), Math.min(), and
//Math.max().

public class A2Q24 {
public static void main(String[] args) {
double r1,r2,r3,r4,r5;
r1=Math.random();
r2=Math.random();
r3=Math.random();
r4=Math.random();
r5=Math.random();
System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
double sum=r1+r2+r3+r4+r5;
double avg=sum/5;
System.out.println("Average ="+avg);
double max=Math.max(r1,Math.max(r2,Math.max(r3,Math.max(r4, r5))));
double min=Math.min(r1,Math.min(r2,Math.min(r3,Math.min(r4, r5))));
System.out.println("Max="+max);
System.out.println("Min="+min);
}
}