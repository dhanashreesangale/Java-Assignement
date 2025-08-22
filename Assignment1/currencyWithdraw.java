import java.util.Scanner;

public class currencyWithdraw{
public static void main(String[] args) {
int amount,tenRup,fiveRup,oneRup,remainder;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the amount to withdraw: ");
amount = sc.nextInt();
tenRup= amount / 10;        
remainder = amount % 10;   
fiveRup = remainder / 5;     
oneRup = remainder % 5;    

 System.out.println("10-rupee notes: " + tenRup);
 System.out.println("5-rupee notes: " + fiveRup);
 System.out.println("1-rupee notes: " + oneRup);

    }
}