import java.util.Scanner;
public class Temperature{
public static void main(String[] args){
double k,c,f;
Scanner sc=new Scanner(System.in);
System.out.println("Enter temperature in f :"); 
f=sc.nextDouble();

c=(5/9)*(f-32);
k=c+273.15;

System.out.println("Temperature in c:"+c);
System.out.println("Temperature in k:"+k);
}
}