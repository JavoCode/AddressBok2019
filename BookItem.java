import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class BookItem extends Item{


    //Attributes
    private String title;
    private String isbn;
    private String author;
    




    
    /** 
     * @param title
     * @param author
     * @param isbn
     * @param owner
     * @param value
     * @return 
     */
    //Constructor
    public BookItem(String title, String author, String isbn, String owner, float value){
        super("BOOK",owner,value);
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }


    
    /** 
     * @param dateIn
     * @return float
     */
    //Methods
    @Override
    public float checkIn(Date dateIn) {
        float charge;
        //float rate = 0.10;
        charge = super.checkIn(dateIn) +(super.checkIn(dateIn) * 10/100);
        return charge;
    }
    
    
    /** 
     * @return String
     */
    public String getTitle(){
        return title;
    }

    
    /** 
     * @return String
     */
    public String getAuthor(){
        return author;
    }

    
    /** 
     * @return String
     */
    public String getIsbn(){
        return isbn;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return "Item No: "+getItemNo()+"\n"+
                "Owner/Description: "+getOwner()+"/"+getDescription()+"\n"+
                "Value: "+getValue()+"\n"+
                "Status: "+getStatus()+"\n"+
                "Title/Author: "+getTitle()+"/"+getAuthor()+"\n"+
                "ISBN: "+getIsbn();
    }

    
    /** 
     * @param args
     * @throws ParseException
     */
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