import java.util.Scanner;
import java.util.*;
class TempConv
{
 public static void main(String[] args)
  	{
  		double input1=0,input2,temp  ;
  		int a=0,b=0;
  		String scale1,scale2 ;
  		Scanner in=new Scanner(System.in);
  		System.out.println("Temperature Converter ");
  		System.out.println("Enter Your Temperature Scale ");
        // Input for String scale1
        scale1=in.nextLine();
        try
        {
  		System.out.println("Enter the Temperature");
  		// Input for variable "input1"
  		input1=in.nextDouble();
  		}
  		catch(Exception e)
  		{
  			System.out.println("   ");
 			a=1;
  		}
  		if(a==0)
  		{
						  		System.out.println("Enter your Second Temperature Scale to be Converted");
						 		// Input for String scale2
						 		Scanner out=new Scanner(System.in);
						  		scale2=out.nextLine();
						  		if(scale1.equals("Celsius")||scale1.equals("C")||scale1.equals("c")||scale1.equals("celsius")||scale1.equals("Fahrenheit")||scale1.equals("fahrenheit")||scale1.equals("F")||scale1.equals("f"))
						  		{	
									  		if(scale2.equals("Celsius")||scale2.equals("C")||scale2.equals("c")||scale2.equals("celsius"))
									  		{
									           //double n;

									          // n=5/9;
									  			if(scale1.equals("Celsius")||scale1.equals("C")||scale1.equals("c")||scale1.equals("celsius"))
									  			{
									  				a=1;
									  				System.out.println("The following Operation cannot be done");

									  			}
									            else
									            {	
										           	double k;
										           	k=(input1-32)*5;


										  			temp= k/9;     
										  			//temp=temp*n;                      // F to C -->  (32°F − 32) × 5/9 = 0°C
										  			System.out.println("Temperature in Celsius Scale " + temp);
									  			}
									  		}
									  		if(scale2.equals("Fahrenheit")||scale2.equals("fahrenheit")||scale2.equals("F")||scale2.equals("f"))
									  		{ 
									  			if(scale1.equals("Fahrenheit")||scale1.equals("fahrenheit")||scale1.equals("F")||scale1.equals("f"))
									  			{
									  				a=2;
									  				System.out.println("The following Operation cannot be performed");
									  				
									  			}
									  			else
									  			{	
										  			double m;
										  			m=9/5;
										  			temp= input1*9/5;
										  			temp=temp+32;
										  			System.out.println("Temperature in Fahrenheit Scale " + temp);  // C to F -->  (0°C × 9/5) + 32 = 32°F
									            }
									   		}
									   		if(a==1&&a==2)
									   		{
									   			System.out.println(" ");
									   		}
									   		if(a==0)
									   		{

									   			System.out.println("Invalid Input !");
									   		}
								}
								else
								{
									System.out.println("Invalid Input");
								}	   			
		}
		else
		{
			System.out.println("Invalid Numeric Input ");
		}						
  	}
}