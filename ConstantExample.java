import java.util.Scanner;  

public class ConstantExample  
{  
	//declaring constant   
	private static final int PRICE=10;  
public static void main(String[] args)  
	{  
	int unit;  
	int total;  
		System.out.print("Enter the number of units you have used: ");  
	Scanner sc=new Scanner(System.in);  
		unit=sc.nextInt();  
	total=PRICE*unit;  
	System.out.println("The total amount you have to deposit is: "+total);  
	}  
}  