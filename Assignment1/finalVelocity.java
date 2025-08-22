import java.util.Scanner;

public class finalVelocity {
public static void main(String[] args) {
float u,a,t;
double v,s;
Scanner sc = new Scanner(System.in);
System.out.println("Enter initial Velocity: ");
u = sc.nextFloat();
System.out.println("Enter acceleration: ");
a = sc.nextFloat();
System.out.println("Enter time: ");
t= sc.nextFloat();
v = u+a*t;
s = u+((a*t)*2);
System.out.println("Final velocity= " +v);
System.out.println("Distance travel= " +s);
}
}