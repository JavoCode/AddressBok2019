package project;
import java.util.Scanner;

/**
 * Write a description of class ExchangeManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExchangeManager <T> extends DataManager
{
    public ExchangeManager(String fileName){
        super(fileName);
    }
    
    // The following are stubs so that the code compiles
    public Scanner openFile(String fileName){
        File file = new File(filename);
        Scanner scan = new Scanner (file);
        return scan;
    }
    
    
    public void storeToList(String[] toks){
    
    }
    
    public void closeFile(boolean flag) {
    }
    
    public Object buildObject(String[] toks) {

        return null;
    }


    public static void main(String[] args){
        ExchangeManager<Integer> myData = new ExchangeManager<Integer>("Test");
        myData.add(new Integer(3));
        myData.add(new Integer(2));
        while (myData.hasNext()){
            System.out.println(myData.next());
        }
    }

}
