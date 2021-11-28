package tamilnadu.chennai;

public class Samsung extends FactoryDemo{
	
	static int price=5000;
	public static void main(String[] args)
	{
		Samsung sam=new Samsung();
		sam.browse(); // immediate parent class method
		System.out.println("samsung mobile price :"+price);
		System.out.println("calling "+sam.call(50));
		sam.providepattern();
		sam.receivedcall();
		sam.sendmessage();
		
	}
	public void verifyfingerprint()
	{
		System.out.println(" samsung verifying finger prints");
	}
	public void providepattern()
	{
		System.out.println("samsung provide patterns");
	}
	public  int call(int seconds)
	{
		return seconds;
	}
	public void sendmessage()
	{
		System.out.println("sausung sending message");
	}
	public void receivedcall()
	{
		System.out.println("samsung receiving calls");
	}
	

}
