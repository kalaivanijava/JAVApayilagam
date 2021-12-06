package tamilnadu.chennai;

import java.util.Scanner;

public class VotingCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your age ");
		int age=scan.nextInt();
		VotingCheck vc=new VotingCheck();
		vc.iseligible(age);

	}

	private void iseligible(int age) {
		if(age>0&&age<150)
		{
			if(age>=18)
			{
				System.out.println("you are eligible to vote ");
			}
			else
			{
				System.out.println("please wait for few years  to vote ");
			}
		}
		else {
			System.out.println(" Really  your age  is  "+age +"?");
		}
		
	}

}
