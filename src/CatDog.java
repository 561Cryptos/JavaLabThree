import java.util.Scanner;
public class CatDog {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first String");
		String firstString = input.nextLine();
		System.out.println("Enter the Second String");		
		String secondString = input.nextLine();
		int firstOrsecond = firstString.compareTo(secondString);
		if (firstOrsecond < 0)
		{
		System.out.println(firstString+" procedes "+secondString);
		}
		else if (firstOrsecond==0)
		{
		System.out.println(firstString+" is equal to "+secondString);	
		}
		else 
		{
		System.out.println(secondString+" procedes "+firstString);		
		}
		input.close();
		
				
	}
	
}
