import java.util.Scanner;
public class store{

    public static void main(String[] args){

	System.out.println("Loading Store " + "Timestamp " + System.currentTimeMillis() + "...");
	
	Scanner scan = new Scanner(System.in);

	System.out.print("\007");

	System.out.println("Welcome to Store!");

	System.out.println("Please input your name");

	String username = scan.nextLine();
	
	System.out.println("Welcome " + username + " are you a returning user? y/n");

	String returning = scan.nextLine();

	boolean returningB;

	if(returning.equalsIgnoreCase("y")){

		returningB = true;
	    
	    }else{
		
		returningB = false;

	    }
	
	if(returningB){

	    System.out.println("Placeholder!!");
	
	}else{

	    System.out.println("Hello " + username + " here is what we have in stock...");

	     }

	}



}