import java.util.Scanner;
public class Swapping {
public static void main(String args[])
{
 int a,b;
 Scanner sc=new Scanner(System.in);
 System.out.printf("Enter 1st number : ");
 a = sc.nextInt();
 System.out.print("Enter 2nd number : ");
  b = sc.nextInt();
  a = a + b;
  b = a - b;
  a = a - b;
  System.out.println("a="+a);
  System.out.println("b="+b);
  a = a * b;
  b = a / b;
  a = a / b;
  System.out.println("a="+a);
  System.out.println("b="+b);
}
}
