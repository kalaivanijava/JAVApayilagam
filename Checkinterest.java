package tamilnadu.chennai;

public class Checkinterest {
	int deposit;
	String name;
	public Checkinterest(String name,int deposit) {
		this.deposit=deposit;
		this.name=name;
	}
	public static void main(String[] args)
	{
	Checkinterest ci=new Checkinterest("AAA",5000);
	Checkinterest c2=new Checkinterest("BBB",10000);
	
	System.out.println(ci.name+"  your interest is  "+ci.getinterest());
	System.out.println(ci.name+"  your total amount is "+(ci.deposit+ci.getinterest()));

	System.out.println(c2.name+"  your interest is  "+c2.getinterest());
	System.out.println(c2.name+"  your total amount is "+(c2.deposit+c2.getinterest()));

     }
public double getinterest()
{    
	double interest;
	if(this.deposit<=5000)
	{
	interest = (2.5/100)*deposit;
	}
	else
		interest=(3.0/100)*deposit;
	return interest;
	
}
}


