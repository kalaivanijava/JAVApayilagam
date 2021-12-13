package loops.workings;

public class HCF_for_twonumbers {

	public static void main(String[] args) {
	int n1=100;
	int n2=80;
	int temp;
	while(n2>0)
	{
	
		 temp = n2;
   	     n2 = n1% n2; 
   	     n1 = temp;
	}
  System.out.println(" HCF is "+n1);
	}
	}

