package samplePackage;

import java.util.Scanner;
import java.util.regex.*;

public class EmployeeWage
{
	public static void main(String[] args)
	{
		System.out.println("Select Company:");
		System.out.println("Press 1 for abc");
		System.out.println("Press 2 for xyz");
		
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		
		if(option == 1)
		{
			CompanyABC abc = new CompanyABC();
			abc.wagecompute();
		}
		else if(option == 2)
		{
			CompanyXYZ xyz =new CompanyXYZ();
			xyz.wagecompute();
		}
		else
		{
			System.out.println("invalid selection");
		}
	}
}
