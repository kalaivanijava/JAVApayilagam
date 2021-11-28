package tamilnadu.chennai;

public class Trainer {
public String dept,institute;
private int salary=10000;


public Trainer(String dept, String institute) {
	this.dept=dept;
	this.institute=institute;
	// TODO Auto-generated constructor stub
}
public Trainer()
{

}
public int getSalary()
{
	return salary;
}
public void setValue(String dept, String institute)
{
	this.dept=dept;
	this.institute=institute;
}
public void training()
{
	System.out.println(" training provided ");
	
}
public static void main(String[] args)
{
	Trainer trainerkumar=new Trainer("CSE","payilagam");
System.out.println(trainerkumar.dept);
	System.out.println(trainerkumar.institute);

	
}
}
