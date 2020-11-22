package samplePackage;

public class EmployeeWage
{
	public static void main(String[] args)
	{
		final int IS_PART_TIME = 1;
	    final int IS_FULL_TIME = 2;
	    int EMP_RATE_PER_HOUR = 20;
	    int NUM_OF_WORKING_DAYS = 5;
	    int MAX_HRS_IN_MONTH = 20;
	    
	    
	    int totalWage = 0;
	    int totalEmpHrs = 0;
	    int totalWD = 0;
	    //cOMPUTATION
	    while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWD < NUM_OF_WORKING_DAYS)
	    {
	      	int empHrs = 0;
	        int empWage = 0;
	        totalWD++;

	        int empCheck = (int) Math.floor(Math.random()*10)%3;

	        switch (empCheck)
	        {
	           	case IS_FULL_TIME:
	           		empHrs = 8;
	                break;
	            case IS_PART_TIME:
	                empHrs = 4;
	                break;
	            default:
	                empHrs = 0;
	        }
	        empWage = empHrs * EMP_RATE_PER_HOUR;
	        totalWage += empWage;
	        totalEmpHrs += empHrs;
	        System.out.println("Emp Hrs: "+empHrs);
	        System.out.println("Emp Wage: "+empWage);
	    }
	        
	    System.out.println("total Emp wage = " + totalWage);
	}
}
