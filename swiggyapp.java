import java.util.Scanner;
class  swiggyapp
{	static int choice,cart=0;
	static Scanner swiggy= new Scanner(System.in);
	public static void main(String[] args) 
	{	
		greetings1(); 
		ifelse();
		ifelse1();
		
		greetings2();
	}
		public static void hotels()
	{
		System.out.println("--------------------------------------------");
		System.out.println("\t\tHotels list");
		System.out.println("--------------------------------------------");
		System.out.print("1.Ananda Bhavan Restaurant"+
									"\n2.Chella Mess Hotel"+
								"\n3.Raman Hotel"+
								"\n4.Priya Restaurant");
		System.out.println("\n--------------------------------------------");
		System.out.print("Select the restaurant:");
		choice=swiggy.nextInt();
		switch (choice)
		{
				case 1:
				{
					typeoffood();
					break;
				}
				case 2:
				{
					typeoffood();
					break;
				}
				case 3:
				{
					typeoffood();
					break;
				}
				case 4:
				{
					typeoffood();
					break;
				}
		}
	}
	
	public static void typeoffood()
	{
		System.out.println("\n1.Vegetarian food"+"\n2.Non-Vegetarian food");
		System.out.print("\nChoose the type of food needed :");
		int type=swiggy.nextInt();
		if(type==1)
		{
			VegFood();
		}
		if(type==2)
		{
			NonVegFood();
		}
	}

	public static void VegFood()
	{	
		int rate;
		System.out.println("\n-------------------------------------------");
		System.out.println("Items available\t\tCost per item ");
		System.out.println("\n1.Idly\t\t\t5/-"+"\n2.Dosa\t\t\t40/-"+
							"\n3.Masala Poori\t\t50/-"+"\n4.Pongal\t\t35/-");
		System.out.println("\n-------------------------------------------");
		System.out.print("Select the food to make order:");
		int a=swiggy.nextInt();
		switch (a)
		{
		case 1:
			System.out.print("How many Idlies needed = ");
			int idly=swiggy.nextInt();
			rate=5*idly;
			System.out.print("\nThe cost of your food is :"+rate+"/-");
			System.out.print("\n Item added to the cart.");
			cart=cart+rate;
			break;
		case 2:
			System.out.print("How many Dosas needed = ");
			int dosa=swiggy.nextInt();
			rate=40*dosa;
			System.out.print("\nThe cost of your food is :"+rate+"/-");
			System.out.print("\n Item added to the cart.");
			cart=cart+rate;
			break;
		case 3:
			System.out.print("How many Masala Poories needed = ");
			int poori=swiggy.nextInt();
			rate=50*poori;
			System.out.print("\nThe cost of your food is :"+rate+"/-");
			System.out.print("\n Item added to the cart.");
			cart=cart+rate;
			break;
		case 4:
			System.out.print("How many Pongal needed = ");
			int pongal=swiggy.nextInt();
			rate=35*pongal;
			System.out.print("\nThe cost of your food is :"+rate+"/-");
			System.out.print("\n Item added to the cart.");
			cart=cart+rate;
			break;
		}
		
	}
	public static void NonVegFood()
	{	
		int rate;
		System.out.println("-------------------------------------------");
		System.out.println("Items available\t\tCost per item ");
		System.out.println("\n1.Full Meals\t\t80/-"+"\n2.Chicken Biriyani\t120/-"+
							"\n3.Mutton Biriyani\t250/-"
							+"\n4.Variety Rice\t\t40/-"+"\n5.Grilled Chicken\t100/-");
		System.out.println("-------------------------------------------");
		System.out.print("Select the food to make order:");
		int b=swiggy.nextInt();
		switch (b)
		{
		case 1:
			System.out.print("How many Full Meals needed = ");
			int meals=swiggy.nextInt();
			rate=80*meals;
			System.out.print("\nThe cost of your food is :"+rate+"/-");
			System.out.print("\n Item added to the cart.");
			cart=cart+rate;
			break;
		case 2:
			System.out.print("How many Chicken Biriyani needed = ");
			int chickb=swiggy.nextInt();
			rate=120*chickb;
			System.out.print("\nThe cost of your food is :"+rate+"/-");
			System.out.print("\n Item added to the cart.");
			cart=cart+rate;
			break;
		case 3:
			System.out.print("How many Mutton Biriyani needed = ");
			int muttb=swiggy.nextInt();
			rate=250*muttb;
			System.out.print("\nThe cost of your food is :"+rate+"/-");
			System.out.print("\n Item added to the cart.");
			cart=cart+rate;
			break;
		case 4:
			System.out.print("How many Variety Rice needed = ");
			int varrice=swiggy.nextInt();
			rate=40*varrice;
			System.out.print("\nThe cost of your food is :"+rate+"/-");
			System.out.print("\n Item added to the cart.");
			cart=cart+rate;
			break;
		case 5:
			System.out.print("How many Grilled Chicken needed = ");
			int grill=swiggy.nextInt();
			rate=100*grill;
			System.out.print("\nThe cost of your food is :"+rate+"/-");
			System.out.print("\n Item added to the cart.");
			cart=cart+rate;
			break;

		}
		
	}

	public static void greetings1()
	{
		System.out.println("\n--------------------------------------------");
		System.out.println("\t\t SWIGGY WORLD");
		System.out.println("\tJust order and enjoy your food...!");
		System.out.println("--------------------------------------------");
		System.out.println("1.New member of SWIGGY?"+"\n2.To login the account?");
		System.out.print("Enter your choice :");
		int userchoice=swiggy.nextInt();
		if(userchoice==1)
		{
			registration();
		}
		if(userchoice==2)
		{
			login();
		}
	}

	public static void greetings2()
	{
		System.out.println("\n--------------------------------------------");
		System.out.println("Your order is placed !");
		System.out.println("You will receive your food within 30 minutes !");
		System.out.println("\n--------------------------------------------");
		System.out.println("\t\tThank You !");
		System.out.println("--------------------------------------------");
	}
	public static void registration()
	{
		System.out.print("USERNAME:\t");
		String name=swiggy.next();
		System.out.print("AGE:\t\t");
		int age=swiggy.nextInt();
		System.out.print("PLACE:\t\t");
		String place=swiggy.next();
		System.out.print("PASSWORD:\t");
		String password=swiggy.next();
		System.out.println("\n---------------------------------------------");
		System.out.println("\tYOUR REGISTRATION DETAILS");
		System.out.println("\n---------------------------------------------");
		System.out.print("\nUSERNAME:\t"+name);
		System.out.print("\nAGE:\t\t"+age);
		System.out.print("\nPLACE:\t\t"+place);
		System.out.print("\nPASSWORD:\t"+password);
		System.out.println("\n---------------------------------------------");
		System.out.println("\nYaahoo..!Now you are a member of SWIGGY");
		System.out.println("\n---------------------------------------------");
	}

	public static void login()
	{
		String x1,y1;
		System.out.print("Enter the user name:\t");
		String x=swiggy.next();
		System.out.print("Enter your password:\t");
		String y=swiggy.next();
		x1="aaaa";
		y1="1111";
		if((x.equals(x1))&(y.equals(y1)))
		{
			System.out.println("Your login is succesfull! :)");
			System.out.print("\n---------------------------------------------");
		}
		else
		{
			System.out.println("Your login is failed! :("+"\nTry again");
			System.out.println("\n---------------------------------------------");
		}
	}
	public static void ifelse()
	{
		System.out.print("\nPress 1 to see the list of hotels :");
		int press=swiggy.nextInt();
		if(press==1)
		{
			hotels();
		}
		else
		{
			System.out.println("Invalid option");
		}
	}

	public static void ifelse1()
	{
		System.out.println("\nPress 1 to continue the order."+
		"\nPress 2 to confirm and place the order: ");
		int press=swiggy.nextInt();
		if(press==1)
		{
			typeoffood();
		}
		if(press==2)
		{
			cartvalue();
		}
	}
	public static void cartvalue()
	{
		System.out.println("\n---------------------------------------------");
		System.out.println("The total rate of your food odered :\t"+cart+"/-");
		System.out.println("\n---------------------------------------------");
	}

}
