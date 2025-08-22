import java.util.Scanner;
public class CylinderVolume{
public static void main(String[] args){
double r,h,Volume,surfaceArea;

Scanner sc=new Scanner(System.in);

System.out.println("Enter the radius :");
r=sc.nextFloat();

System.out.println("Enter the height :");
h=sc.nextFloat();

surfaceArea=2*Math.PI*r*r+2*Math.PI*r*h;
Volume=Math.PI*r*r*h;

System.out.println("Surface area is ="+surfaceArea);
System.out.println("Volume is       ="+Volume);

}
}
