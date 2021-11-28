package tamilnadu.chennai;

public abstract class FactoryDemo extends SmartPhone{
	
	boolean originalpiece=false;
	static int price=0;
	
	public abstract void verifyfingerprint();
	public abstract void providepattern();
	public void browse()
	{
		System.out.println("Factory demo browsing");
	}

}
