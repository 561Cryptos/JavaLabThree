import java.util.Scanner;
public class JobInterview 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		char cdegree;
		System.out.println("Welcome to your job interview");
		System.out.println("Do you have a college degree (y/n)");
		cdegree=input.nextLine().charAt(0);
		if(cdegree=='y')
		{
			
			System.out.println("Do you know java? (y/n)");
			char knowjava = input.nextLine().charAt(0);
			if (knowjava=='y')
			{
				System.out.println("Here is our job offer");
				System.out.println("We would like to hire you at an Senior level position");
			
			
			}
			else
			{
				System.out.println("Here is our job offer");
				System.out.println("We would like to hire you at an entry level position");
			}
		}
			
		else
		{
		
	    System.out.println("We can not extend you a job offer at this time");
	    input.close();
		
		
		}
	
		
		
		

}

}

