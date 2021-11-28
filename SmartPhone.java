package tamilnadu.chennai;

public abstract class SmartPhone {
	public  abstract int call(int seconds);
	public  abstract void sendmessage();
	public  abstract void receivedcall();
	public void browse()
	{
		System.out.println("Smartphone browsing");
	}
	public SmartPhone()
	{
		System.out.println("smartphone under developement");
	}

}
