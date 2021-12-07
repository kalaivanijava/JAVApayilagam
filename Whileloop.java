package tamilnadu.chennai;

import java.util.Scanner;

public class Whileloop {
	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter the numbers");
		int a=sc.nextInt();
		Whileloop w=new Whileloop();
		w.print(a);
		}
	private void print(int a) {
			int i=1;
		while(i<=a)
		{
		System.out.println("product of "+i+","+i+" is "+(i*i));
		i++;
	}

}
}
