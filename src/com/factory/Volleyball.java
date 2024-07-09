package com.factory;

import java.util.Scanner;

public class Volleyball
{
	
	int weight;
	double price;
	String color;
	boolean state;//determines filled with air or not.
	
	static int quantity;
	static String brandName;
	
/*
 * Static block: 
 * Used for intializing data at class loading time 
 */
	
	static
	{
		quantity=0;
		brandName="ARSH";
		System.out.println("[!!****************Vollyball Factory Project For-- "+brandName+"-- Volleyball*****************!!]");
		System.out.println("");
	}
	
	/*
	 * Init block:
	 * this will update the value of object with respect to every constructor 
	 */
	
	{
		quantity++;
	}

/*
 * Default constructor :
 * for initializing similar type of data for different objects
 */
	Volleyball()
	{
		weight=100;
		price=34.5;
		color="red";
		state=true;
	}
	/*
	 * Parametrised constructor:
	 * for initializing diffrent type of data for different object
	 */
	
	Volleyball(int weight,double price,String color,boolean state)
	{
		 this.weight = weight;
		 this.price = price;
		 this.color = color;
		 this.state = state;
	}
	
	//displaying details
	
	void showDetails()
	{
		System.out.println("Watt of Volleyball="+weight);
		System.out.println("Color of Volleyball="+color);
		System.out.println("Price of Volleyball="+price);
		System.out.println("State of Volleyball="+state);
		System.out.println("Brand of Volleyball="+brandName);
		System.out.println("-----------------------------------------------");
	}
	
	//changing state

	void changeState()
	{
		if(state==true)
			state=false;
		else
			state=true;
	}
	
	//count the number of manufactured bulb

	static void countVolleyball()
	{
		System.out.println("[!!*****Total Nuber of vollayball="+quantity+"*******!!]");
	}

	//to change name of company
	
	void changeCompanayName(String cname)
	{
	brandName=cname;	
	}

	
	
	public static void main(String[] args) 
	{
		/*
		 * for same type of volleyball
		 */
		
		Volleyball.countVolleyball();
		
		System.out.println("[!!**********Creating Same Type of Volleyball***********!!]");
		System.out.println("");
		Volleyball bulb1=new Volleyball();
	    Volleyball bulb2=new Volleyball();
		Volleyball bulb3=new Volleyball();
		System.out.println("***********Details of Volleyball1***************");
		bulb1.showDetails();
		System.out.println("***********Details of Volleyball2***************");
		bulb2.showDetails();
		System.out.println("***********Details of Volleyball3***************");
		bulb3.showDetails();
		Volleyball.countVolleyball();
		
		/*
		 * for different types volleyballs
		 */
		
		System.out.println("[!!**********Creating Different Type of vollyball***********!!]");
		System.out.println("");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter weight for Volleyball4:");
        int weight4 = scan.nextInt();
        System.out.println("Enter price for Volleyball4:");
        double price4 = scan.nextDouble();
        
        scan.nextLine(); // consume newline
        
        System.out.println("Enter color for Volleyball4:");
        String color4 = scan.nextLine();
        System.out.println("Enter state (true/false) for Volleyball4:");
        boolean state4 = scan.nextBoolean();
        
        Volleyball bulb4 = new Volleyball(weight4, price4, color4, state4);
        
        System.out.println("Enter weight for Volleyball5:");
        int weight5 = scan.nextInt();
        System.out.println("Enter price for Volleyball5:");
        double price5 = scan.nextDouble();
        
        scan.nextLine(); // consume newline
        
        System.out.println("Enter color for Volleyball5:");
        String color5 = scan.nextLine();
        System.out.println("Enter state (true/false) for Volleyball5:");
        boolean state5 = scan.nextBoolean();
        
        
        Volleyball bulb5 = new Volleyball(weight5, price5, color5, state5);
        
         
		
		System.out.println("***********Details of Volleyball4***************");
		bulb4.showDetails();
		System.out.println("***********Details of Volleyball5***************");
		bulb5.showDetails();
		 
		Volleyball.countVolleyball();
		
		bulb5.changeCompanayName("Nadeem-Volleyball");
		
		System.out.println("***********updated Details of Volleyball5***************");
		bulb5.showDetails();
		
	}

}
