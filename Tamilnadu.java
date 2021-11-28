package tamilnadu.chennai;

public class Tamilnadu extends SouthIndia{
	
	public Tamilnadu() {
		
		// TODO Auto-generated constructor stub
	}
	public Tamilnadu(String primeminister) {
		super(primeminister);
		// TODO Auto-generated constructor stub
	}
	static String capital="chennai";
	
	
	
	
	public static void main(String[] args) {
		India in=new Tamilnadu("Indra");
		
		System.out.println(India.capital);
		in.dress();
		in.eat();
		in.speaklanguage();
		
		Tamilnadu tn=new Tamilnadu();
		tn.cultivate();
		tn.livingstyle();
		tn.dress();
		tn.speaklanguage();
		System.out.println(Tamilnadu.capital);
		SouthIndia si=new Tamilnadu();
		si.cultivate();
		si.dress();
		si.livingstyle();
		si.eat();
		
	}
	public void cultivate()
	{
		System.out.println(" Rice and sugarcan cultivation //TN");
	}
	public void livingstyle()
	{
		System.out.println("tamilnadu is above average development //TN");
	}
	public void speaklanguage()
	{
		System.out.println(" speaking in Tamil is the first preference //TN");
	}
	public void eat()
	{
		System.out.println(" eat whtever you like  //TN");
	}
	public void dress()
	{
		System.out.println(" colorful dressing   //TN");
	}

}
