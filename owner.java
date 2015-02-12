//Creates items, manages stock
import java.util.Scanner;
public class owner{


    public static void main(String[] args){

	System.out.println("Welcome admin!");

	System.out.println("What would you like to do?");

	Scanner scan = new Scanner(System.in);

	boolean running = true;

	while(running){

	System.out.println("1.\tCreate new item\n2.\tEdit an item\n3.\tDelete an item\n4.\tQuit");

	int choice = scan.nextInt();

	switch(choice){
	    
	case 1: 

	    System.out.println("Create item");

	    break;
	    
	case 2: 

	    System.out.println("Edit item");

	    break;

	case 3: 

	    System.out.println("Delete item");

	    break;

	case 4:

	    System.out.println("Quit... Goodbye");

			       running = false;

	default:



	    break;

	}

      }
    }


	public void itemload(){


	}


}

