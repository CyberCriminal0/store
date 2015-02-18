/**An item in a store 
@author Jack Eller
*/
public class item{

  /**Name of Item*/
	public String name;
  /**Number of Items*/
    	int stock;
  /**Unique ID*/
    	int num;
  /**Cost of Item*/
    	double price;

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
