import java.util.Scanner;
public class ageId 
{
	public static void main(String[] args)
	{
		int year = 2018;
		Scanner input = new Scanner (System.in);
		System.out.println("What Year were you born");
		int userYear = input.nextInt();
		int userAge = year - userYear;
		System.out.println("You are "+userAge);
		
		if (userAge<=18){
			System.out.println("You Are not an Adult");
		}
		else{
				System.out.println("You Are a Adult");
				
				if (userAge<30) 
					System.out.println("You are still young");
				
				else if(userAge<=50) 
					System.out.println("You Are midage");
				
				else 
					System.out.println("You Are a respected Senior");
				
					

				
				
		
				
			}	
		}
	
	
}
