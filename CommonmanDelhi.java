package india.newdelhi;

import tamilnadu.chennai.TrafficRuleschennai;


public  class CommonmanDelhi implements TrafficRules,TrafficRuleschennai{

	
	
	@Override
	public void dontgobydiselvehicle() {
	System.out.println("please dont go by diselvehicle // delhi");
		// TODO Auto-generated method stub
	}
	
	

	@Override
	public void gobybicycle() {
		System.out.println(" better go by cycle   // delhi");
		
	}
	public static void main(String[] args)
	{
		CommonmanDelhi cd=new CommonmanDelhi();
		cd.dontgobydiselvehicle();
		cd.gobybicycle();
		cd.gobyDieselvehicle();
		System.out.println(" for Delhi  Mr."+TrafficRules.trafficcommissioner);
		TrafficRules tr=new CommonmanDelhi();
		tr.dontgobydiselvehicle();
		tr.gobybicycle();
		TrafficRuleschennai tc=new CommonmanDelhi();
		System.out.println(" for Chennai  Mr."+TrafficRuleschennai.trafficcommissioner);
		tc.gobybicycle();
		tc.gobyDieselvehicle();
						
		}
	@Override
	public void gobyDieselvehicle() {
		// TODO Auto-generated method stub
		System.out.println(" go by diselvehicle in delhi // chennai traffic rules abstract method");
		
	}




	
	}


