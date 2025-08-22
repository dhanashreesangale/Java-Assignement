import java.util.Scanner;

public class arithmaticMean{
public static void main(String[] args) {
double a,b,AM,HM;

 Scanner sc = new Scanner(System.in);
System.out.print("Enter first number: ");
a = sc.nextDouble();

System.out.print("Enter second number: ");
b = sc.nextDouble();

AM = (a+b)/2;
HM = (a*b)/(a+b);

System.out.println("Arithmetic Mean = " + AM);
 System.out.println("Harmonic Mean = " + HM);
}
}