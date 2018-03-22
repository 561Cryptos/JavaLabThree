import java.util.Scanner;
public class IntegerInfo 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please type and integer value");
		
		int number = input.nextInt();
		String npolarity;
		String nparity;
		int nabsolute = Math.abs(number);
		if (number>0)
			npolarity="Positive";
		else if(number<0)
			npolarity="Negitive";
		else
			npolarity="Zero";
		if((nabsolute%2)==0)
			nparity="Even";
		else
			nparity="odd";
		System.out.println(+number+" is a " +npolarity+ " Number its Absolute Value is "+nabsolute+ " and " +nabsolute+ " is on " +nparity+ " number" );
		input.close();	
		
		
	}
	
}
