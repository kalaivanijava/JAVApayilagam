package tamilnadu.chennai;

public class ActorSivakumar implements Actor {
	public static String address="Coimbatore";
	int age;
	String car;

	public ActorSivakumar(int age, String car) {
		this.age=age;
		this.car=car;
		// TODO Auto-generated constructor stub
	}

	public ActorSivakumar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ActorSivakumar as=new ActorSivakumar(65,"Audicar");
		as.act();
		as.dance();
		as.sing();
		as.speaking();
		System.out.println("Sivakumar Address : "+address);
		Actor ac=new ActorSivakumar();
	    ac.act();
	    ac.dance();
	    ac.sing();
	    // object as can access interface and child class method. 
	    // but ac only access interface methods
		
		System.out.println("Actor address :"+Actor.address); // 
		
	}

	@Override
	public void act() {
		System.out.println("Actor Acting : acting is ok");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sing() {
		System.out.println(" Actor singing :  its ok");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dance() {
		System.out.println("Actor dancing : no comments    ");
		// TODO Auto-generated method stub
		
	}
	public void speaking()
	{
		System.out.println(" sivakumar Speaking : worry about people who are listening");
	}

}
