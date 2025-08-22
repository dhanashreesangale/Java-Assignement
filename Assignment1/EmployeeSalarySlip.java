import java.util.Scanner;
public class EmployeeSalarySlip
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	float basicSalary;
	double tax;
	System.out.println("Enter salary :");
	basicSalary=sc.nextFloat();
	if(basicSalary<150000)
	tax=0;
	else if(basicSalary>150000 && basicSalary<=300000)
	tax=(basicSalary - 150000) * 0.20;
	else
	tax=(150000 * 0.20) +((basicSalary- 300000) * 0.30);
	System.out.println("tax : "+tax);
}
}

