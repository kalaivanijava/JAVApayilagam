package tamilnadu.chennai;

import java.util.Scanner;

public class While_zero {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.println(" Enter number");
         int num=sc.nextInt();
         int tot=0;
         int i=0;
         while(num!=0)
         {
        	 
        	 tot=tot+num;
        	 System.out.println(" Enter number");
             num=sc.nextInt();
             i++;
         }
         System.out.println("total of "+i+ " numbers is " +tot);
	} 

}
