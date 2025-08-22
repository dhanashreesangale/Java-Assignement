import java.util.Scanner;

public class cuboid {
public static void main(String[] args) {
double l,b,h,surfaceArea,volume;
Scanner sc = new Scanner(System.in);
    
System.out.println("Enter length (l): ");
l = sc.nextDouble();
System.out.println("Enter breadth (b): ");
b = sc.nextDouble();
System.out.println("Enter height (h): ");
h = sc.nextDouble();

surfaceArea = 2*(l*b+l*h+b*h);
volume = l*b*h;

System.out.println("Surface Area of Cuboid = " + surfaceArea);
System.out.println("Volume of Cuboid = " + volume);
}
}