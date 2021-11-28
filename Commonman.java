package tamilnadu.chennai;

public class Commonman implements TrafficRuleschennai{
//commonman chennai implements chennai rules


public void gobyDieselvehicle()
{
	System.out.println("going by disel Vehicle // chennai");
}
public void gobybicycle()
{
	System.out.println("going by bicycle is good for health // chennai");
}

public static void main(String[] args)
{
	Commonman cm=new Commonman();
	cm.gobybicycle();
	cm.gobyDieselvehicle();
	System.out.println("chennai commissioner  Mr."+TrafficRuleschennai.trafficcommissioner);
}
}