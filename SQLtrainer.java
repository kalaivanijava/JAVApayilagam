package tamilnadu.chennai;

public class SQLtrainer extends Trainer{

	public static void main(String[] args)
	{
		SQLtrainer ram=new SQLtrainer();
		ram.training();
		System.out.println(ram.getSalary());
		ram.setValue("JAVA","PAYILAGAM");
		System.out.println(ram.dept);
		System.out.println(ram.institute);
		
		
		
		
	}

}
