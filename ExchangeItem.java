import java.util.Calendar;

public interface ExchangeItem{

    //Abstract method to get the Status of the Item
    public String getStatus();

    //Method that uses a boolean to tell if the item is Available
    public boolean isAvailable();
    
    //Method to check out an item
    public void checkOut(String burrower, Calendar dateOut);

    //Method to check in an item
    public float checkIn(Calendar dateIn);



    
}