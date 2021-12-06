package tamilnadu.chennai;

import java.util.Scanner;

public class Flowers {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println(" How many flowers did you buy ?");
	 int flowers=sc.nextInt();
	 Flowers fs=new Flowers();
	 int free=fs.freeFlowers(flowers);
	 System.out.println("your have "+free+" free flowers");
	 System.out.println(" Toatal flowers "+(free+flowers)); 

	}
	public int freeFlowers(int flowers) {
	int ff=flowers/10;
	return ff;
		
	}

}
