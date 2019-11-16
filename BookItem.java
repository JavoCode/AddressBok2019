import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class BookItem extends Item{


    //Attributes
    private String title;
    private String isbn;
    private String author;
    




    //Constructor
    public BookItem(String title, String author, String isbn, String owner, float value){
        super("BOOK",owner,value);
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }


    //Methods
    @Override
    public float checkIn(Date dateIn) {
        float charge;
        //float rate = 0.10;
        charge = super.checkIn(dateIn) +(super.checkIn(dateIn) * 10/100);
        return charge;
    }
    
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public String toString(){
        return "Item No: "+getItemNo()+"\n"+
                "Owner/Description: "+getOwner()+"/"+getDescription()+"\n"+
                "Value: "+getValue()+"\n"+
                "Status: "+getStatus()+"\n"+
                "Title/Author: "+getTitle()+"/"+getAuthor()+"\n"+
                "ISBN: "+getIsbn();
    }

    public static void main(String[] args) throws ParseException{

        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy",Locale.ENGLISH);

        Date dateIn = sdf.parse("6/30/2019");
        Date dateOut = sdf.parse("6/20/2019");
        
        BookItem book1 = new BookItem("Jack and Jill", "Michael Cousins", "978-0134462028", "Kevin Tierney", 1800);
        book1.checkOut("Mike Pence", dateOut);
        book1.checkIn(dateIn);

        
        System.out.println(book1.toString());

    }

}