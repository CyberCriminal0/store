//Creates items, manages stock
import java.util.Scanner;
public class owner{


    public static void main(String[] args){

	System.out.println("Welcome admin!");

	Scanner scan = new Scanner(System.in);

	boolean running = true;

	while(running){

	    System.out.println("What would you like to do?");

	    System.out.println("1.\tCreate new item\n2.\tEdit an item\n3.\tDelete an item\n4.\tQuit");

	int choice = scan.nextInt();

	scan.nextLine();

	switch(choice){
	    
	case 1: 

	    System.out.println("Create item");

	    System.out.println("Item name?");

	    String itemname = scan.nextLine();

	    System.out.println("Item quantity?");

	    int itemquantity = scan.nextInt();

	    System.out.println("Item price?");

	    double itemprice = scan.nextDouble();

	    scan.nextLine();

	    System.out.println("\n\t" + itemquantity + " " + itemname + " at " + itemprice + " each" + "\n\t Is this correct? y/n \n"); 

	    String choiceForNew = scan.nextLine();

	    if(choiceForNew.equalsIgnoreCase("y")){
		    
		    item item = new item(itemname, itemprice, itemquantity);

		    tofile to = new tofile();

		    to.to(item);
		    
		}else{

		    System.out.println("You said " + choiceForNew + " returning to menu...");

	    }

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

