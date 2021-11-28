package india.newdelhi;

public class CommonmaninDelhi implements TrafficRules{
	 public void dontgobydiselvehicle()
	{
		System.out.println(" disel price is too high, so dont use disel vehicle");
	}
	
	public void gobybicycle()
	{
		System.out.println("use  bicycle to avoid air polution");
	}
	public static void main(String[] args)
	{
		CommonmaninDelhi cid=new CommonmaninDelhi();
		cid.dontgobydiselvehicle();
		cid.gobybicycle();
		
	}

}
