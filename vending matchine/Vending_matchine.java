package vending;
import java.util.*;

public class Vending_matchine {
	Scanner s=new Scanner(System.in);
	
	String[] products= {"candy","snack","nuts","coke","pepsi","soda" };
	int[] p_quantity= {30,40,20,10,35,20};
	int quantity=0;
	int cost=0;
	static int total_amount;

	void select_product()

	{char ch='n';
       
		System.out.println("proucts are");
		System.out.println("1:candy 20 /n 2:snack 50 /n 3: nuts 90 /n 4:coke 25 /n 5:pepsi  35 /n 6:soda 45");
		do {
		System.out.println("enter your choice");
		int c=s.nextInt();
						
		
		switch(c)
		{
		case 1:
		{
			System.out.println("enter the quantity of candy");
			
			quantity=s.nextInt();
			if(quantity > p_quantity[0])
				System.out.println("we don't have this much amount /n we have only"+(p_quantity[0]-quantity));
			else
	         cost=20*quantity;
			//return cost;
			System.out.println("your amount is"+cost);
			break;
			}
		
		case 2:
		{
			System.out.println("enter the quantity of snack");
			quantity=s.nextInt();
			if(quantity>p_quantity[2])
				System.out.println("we don't have this much amount /n we have only"+(p_quantity[1]-quantity));
			else
			cost=20*quantity;
			System.out.println("your amount is"+cost);
			
			break;
		}
		
		case 3:
		{
			System.out.println("enter the quantity of nuts");
			quantity=s.nextInt();
			if(quantity>p_quantity[0])
				System.out.println("we don't have this much amount /n we have only"+(p_quantity[2]-quantity));
			else
		    cost=20*quantity;
			System.out.println("your amount is"+cost);
			
			break;
		}
		

		case 4:
		{
			System.out.println("enter the quantity of coke");
			 quantity=s.nextInt();
			if(quantity>p_quantity[0])
				System.out.println("we don't have this much amount /n we have only"+(p_quantity[3]-quantity));
			else
			cost=20*quantity;
			System.out.println("your amount is"+cost);
			
			break;
		}
		

		case 5:
		{
			System.out.println("enter the quantity of pepsi");
			 quantity=s.nextInt();
			if(quantity>p_quantity[0])
				System.out.println("we don't have this much amount /n we have only"+(p_quantity[4]-quantity));
			else
		    cost=20*quantity;
			System.out.println("your amount is"+cost);
			
			break;
		}
		

		case 6:
		{
			System.out.println("enter the quantity of soda");
			 quantity=s.nextInt();
			if(quantity>p_quantity[0])
				System.out.println("we don't have this much amount /n we have only"+(p_quantity[5]-quantity));
			else
			 cost=20*quantity;
			System.out.println("your amount is"+cost);
			
			break;
		}
		
		}
		
		total_amount+=cost;
		
		System.out.println("wanna add someything more click y");
		ch=s.next().charAt(0);
		
		}while(ch=='y');
	System.out.println("total amount"+total_amount);
		
	

		
	
	}

	public static void main(String[] args) {
		
		transaction T=new transaction();

	Vending_matchine ve=new Vending_matchine();
	System.out.println("hello there");
	ve.select_product();
	T.billing();
		
	System.out.println("thanks for using me have a great day!");		

	}

}
