import java.util.Scanner;

public class finalVelocity {
public static void main(String[] args) {
double u,a,t,v,s;

Scanner sc = new Scanner(System.in);

System.out.println("Enter initial Velocity: ");
u = sc.nextDouble();
System.out.println("Enter acceleration: ");
 a = sc.nextDouble();
System.out.println("Enter time: ");
 t= sc.nextDouble();

v = u+a*t;
s = (u*t)+(a*t*t);

System.out.println("Final velocity= " +v);
System.out.println("Distance travelled= " +s);
}
}