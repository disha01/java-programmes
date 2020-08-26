package vending;

import java.util.Scanner;

public class transaction extends Vending_matchine {
	Scanner s=new Scanner(System.in);
	int a[]= {1,5,10,20,50,100};
	int temp[]=new int[6]; 
	int amount;
	
	Vending_matchine v=new Vending_matchine();
	void billing() {
	int i=0;
	System.out.println("you have to pay"+v.total_amount);

	System.out.println("u can put currency of 1,5,10,20,50,100");
	while(i<6) {
	System.out.println("enter the no of"+a[i]+"currency if not press 0");
	temp[i++]=s.nextInt();
	
	}
	i=0;
	while(i<6)
	{
	amount+=temp[i]*a[i];
	i++;
	}
	if(amount>v.total_amount)
	{
		System.out.println("your bill is "+amount);
		System.out.println("your extra amount "+(amount-v.total_amount));}
else
		
		System.out.println("your bill is "+amount);
	}
}
