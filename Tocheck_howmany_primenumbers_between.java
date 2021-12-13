package loops.workings;

public class Tocheck_howmany_primenumbers_between {
	public static void main(String[] args)
	
	{
	    int fn=100;int num=1,nod=0;
	    while(num<fn)
	    {
		
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
		       System.out.println(num+" -- prime ");
		       nod=nod+1;
		}
	    num++;
	    }
	    System.out.println("total prime between 1 and "+fn+ " is "+nod);
	}
	
			

}


