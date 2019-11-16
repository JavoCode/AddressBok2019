public class EqItem extends Item{
    
    //Attributes 
    private String serialNum;
    private String make;
    private String model;

    //Constructor
    public EqItem(String serialNum, String make,String model, String owner, float value){
        super("EQUIPMENT",author,value);
        this.serialNum = serialNum;
        this.make = make;
        this.model = model;

    }

    //Methods
    public String getSerialNumber(){
        return serialNum;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String toString(){
        return "Item No: "+getItemNo()+"/n"+
                "Owner/Description: "+getOwner()+"/"+getDescription()+
                "Value: "+getValue()+
                "Status: "+getStatus()+
                "Make/Model: "+getMake()+"/"+getModel()+
                "Serial Number: "+getSerialNumber();
    }
}