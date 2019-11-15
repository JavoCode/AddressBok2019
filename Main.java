import java.util.Calendar;

public class Main{
    public static void main(String[] args) {
        Item it1 = new Item("BOOK", "Bob Brown", 300);
        Item it2 = new Item("EQUIPMENT","Jason Smith",400);
        Calendar calc = Calendar.getInstance();
        Calendar calc2 = Calendar.getInstance();
        calc.set(2019, 10, 15);
        calc2.set(2019, 11, 10);
        it1.checkOut("Max Phillips", calc);
        //System.out.println(it1.checkIn(calc2));
        //System.out.println(it1.toString());
        
        System.out.println(it1.getItemNo());
        System.out.println(it2.getItemNo());
        
        
    }
}