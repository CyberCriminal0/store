public class item{

    String name;
    int price, stock, num;


    public item(String name, int price, int stock){

	this.name = name;
	this.price = price;
	this.stock = stock;

	this.num = 10000 + (int)(Math.random()*99999); 

    }





}