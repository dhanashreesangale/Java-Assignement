import java.util.Scanner;
public class profitLoss{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter cost price");
	double CP=sc.nextDouble();
	System.out.println("Enter selling price");
	double SP=sc.nextDouble();
	if(SP>CP)
	System.out.println("Seller has profit ");
	else
	System.out.println("Seller has loss");
}
}