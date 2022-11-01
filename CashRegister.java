import java.io.*;
import java.util.*;
public class CashRegister {
    public String process(int productID){
        int counter=0;
        String[] productList = new String[10];
        try{
            File products = new File("products.txt");
            Scanner reader = new Scanner(products);
            
            while(reader.hasNextLine()){
                productList[counter]= reader.nextLine();
                counter++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String item = productList[productID-1];
        Display object1  = new Display();
        //object1.display(item);
        return item;
        
    }
}
