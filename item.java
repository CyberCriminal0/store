/**An item in a store 
@author Jack Eller
*/

import java.io.Serializable;

public class item implements Serializable{

  /**Name of Item*/
	public String name;
  /**Number of Items*/
    	public int stock;
  /**Unique ID*/
    	public int num;
  /**Cost of Item*/
    	public double price;

    public item(String name, double price, int stock){

	this.name = name;
	this.price = price;
	this.stock = stock;

	this.num = 10000 + (int)(Math.random()*99999); 

    }

    public String getName(){

	return this.name;
    }

    public double getPrice(){
	
	return this.price;
    }
    
    public int getStock(){

	return this.stock;
    }

    public int getNum(){

	return this.num;
    }

}
