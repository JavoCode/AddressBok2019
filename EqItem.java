import java.util.*;
import java.text.*;

public class EqItem extends Item{
    
    //Attributes 
    private String serialNum;
    private String make;
    private String model;

    
    /** 
     * @param serialNum
     * @param make
     * @param model
     * @param owner
     * @param value
     * @return 
     */
    //Constructor
    public EqItem(String serialNum, String make,String model, String owner, float value){
        super("EQUIPMENT",owner,value);
        this.serialNum = serialNum;
        this.make = make;
        this.model = model;

    }

    
    /** 
     * @return String
     */
    //Methods
    public String getSerialNumber(){
        return serialNum;
    }

    
    /** 
     * @return String
     */
    public String getMake(){
        return make;
    }

    
    /** 
     * @return String
     */
    public String getModel(){
        return model;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return "Item No: "+getItemNo()+"\n"+
                "Owner/Description: "+getOwner()+"/"+getDescription()+"\n"+
                "Value: "+getValue()+"\n"+
                "Status: "+getStatus()+"\n"+
                "Make/Model: "+getMake()+"/"+getModel()+"\n"+
                "Serial Number: "+getSerialNumber();
    }

    
    /** 
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException{

        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy",Locale.ENGLISH);

        Date dateIn = sdf.parse("6/30/2019");
        Date dateOut = sdf.parse("6/20/2019");

        EqItem eq1 = new EqItem("JKX23091820", "Samsung", "S5", "James Brown", 2000);

        eq1.checkOut("Mathew Charles", dateOut);
        eq1.checkIn(dateIn);

        
        System.out.println(eq1.toString());

    }
}