public class item{

    String name;
    int price, stock, num;


    public item(String name, int price, int stock){

	this.name = name;
	this.price = price;
	this.stock = stock;

	this.num = 10000 + (int)(Math.random()*99999); 

    }

    public String getName(){

	return this.name;
    }

    public int getPrice(){
	
	return this.price;
    }
    
    public int getStock(){

	return this.stock;
    }

    public int getNum(){

	return this.num;
    }

}
