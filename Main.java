import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Locale;

public class Main{
    public static void main(String[] args) throws ParseException{
        Item it1 = new Item("BOOK", "Bob Brown", 1500);
        Item it2 = new Item("EQUIPMENT","Jason Smith",400);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy",Locale.ENGLISH);

        Date dateIn = sdf.parse("6/30/2019");
        Date dateOut = sdf.parse("6/20/2019");

        it1.checkOut("Max Phillips", dateOut);
        System.out.println(it1.checkIn(dateIn));
        
        //System.out.println(it1.diffDays());
        
        //System.out.println(it1.checkIn(calc2));
        System.out.println(it1.toString());
        
        System.out.println(it1.getItemNo());
        System.out.println(it2.getItemNo());
        System.out.println(it2.toString());
        
        
    }
}