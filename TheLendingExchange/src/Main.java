package TheLendingExchange.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Locale;

public class Main{
    public static void main(String[] args) throws ParseException{
        //Item it1 = new Item("BOOK", "Bob Brown", 1500);
        //Item it2 = new Item("EQUIPMENT","Jason Smith",400);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy",Locale.ENGLISH);

        Date dateIn = sdf.parse("6/30/2019");
        Date dateOut = sdf.parse("6/20/2019");

        //it1.checkOut("Max Phillips", dateOut);
        // System.out.println(it1.checkIn(dateIn));
        
        // //System.out.println(it1.diffDays());
        
        // //System.out.println(it1.checkIn(calc2));
        // System.out.println(it1.toString());
        
        // System.out.println(it1.getItemNo());
        // System.out.println(it2.getItemNo());
        // System.out.println(it2.toString());

        //Testing the id of both classes

        
        EqItem eq1 = new EqItem("JKX23091820", "Samsung", "S5", "James Brown", 2000);

        eq1.checkOut("Mathew Charles", dateOut);
        eq1.checkIn(dateIn);

        BookItem book1 = new BookItem("Jack and Jill", "Michael Cousins", "978-0134462028", "Kevin Tierney", 1800);
        book1.checkOut("Mike Pence", dateOut);
        book1.checkIn(dateIn);

        System.out.println(eq1.toString());
        System.out.println(book1.toString());
        System.out.println();


        
        
    }
}