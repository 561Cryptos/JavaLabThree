 import java.util.Scanner;
public class FootballTryouts 
{
	
	 public static void main(String[] args)
	 {
		 char fastAns,bigAns; 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Football Tryouts:");
		 System.out.println("Are you Fast? (y for yes)(n for no)");
		 fastAns=input.nextLine().charAt(0);
		 System.out.println("Are you big? (y for yes)(n for no)");
		 bigAns=input.nextLine().charAt(0);
		 if (fastAns == 'y' || bigAns=='y')
		 {
		 System.out.print("You're on the team");
		 }
		 else
		 {
		 System.out.println("Sorry try again next year");
		 }
		 input.close();
		 
	
		 
		 
		 
		 
		 
	 
	 
	 
	 
	 }
	
}
