package tamilnadu.chennai;

import java.util.Scanner;

public class Whileflowres {
	public static void main(String[] args)
	{
	int i=1;
	
	while(i<=5)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many flowers do you want?");
		int f=sc.nextInt();
		System.out.println("pls Enter the color ");
		String s=sc.next();
		System.out.println(" please collect your "+f+" "+s+ " roses at counter  :"+i );
		System.out.println();
		i=i+1;
	}
		

}
}
