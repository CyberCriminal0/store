//Writes objects to files

import java.io.*;

public class tofile{

    public void to(user c){

	try
	    {
         File dir = new File("items");
	 dir.mkdir();
         FileOutputStream fileOut = new FileOutputStream("items/" + c.getNum() + ".item");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(c);
         out.close();
         fileOut.close();
         System.out.println("Saved to: items/" + c.getNum() + ".item");
	    }catch(IOException i)
	    {
		i.printStackTrace();
	    }

    }



}