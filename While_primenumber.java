package loops.workings;

public class While_primenumber 
{
	public static void main(String[] args)
	{
		int num=23;
		int count=0,i=1;
		while(i<=num)
		{
		   if(num%i==0)
		   {
		        count++;	        
		   }
		i++;
		}
		if(count==2)
		{
		       System.out.println(num+" is a prime number ");
		}
		else
		System.out.println(num+" is a Not a prime number ");        
		} 
	      
	
	}


