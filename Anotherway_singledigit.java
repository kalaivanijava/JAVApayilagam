package loops.workings;

public class Anotherway_singledigit {
	public static void main(String[] args)
	{
		Anotherway_singledigit as=new Anotherway_singledigit();
	    int sum=as.countnumber(335675);
     	System.out.println("sum of digits"+sum );
		while(sum>9)
		{
	    sum=as.countnumber(sum);
		System.out.println(" sum of the digits again "+sum);
		}
	}

	private int countnumber(int num) 
	   {
		int count=0;
		while(num>=1)
		{
			int digits=num%10;
			count=count+digits;
			num=num/10;
		}
		return count;
		}
	}

