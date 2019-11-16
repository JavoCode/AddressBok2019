import java.util.Calendar;

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
    public float checkIn(Calendar dateIn) {
        // TODO Auto-generated method stub
        float charge;
        charge = super.checkIn(dateIn) +(super.checkIn(dateIn) * 0.10);
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
        return "Item No: "+getItemNo()+"/n"+
                "Owner/Description: "+getOwner()+"/"+getDescription()+
                "Value: "+getValue()+
                "Status: "+getStatus()+
                "Title/Author: "+getTitle()+"/"+getAuthor()+
                "ISBN: "+getIsbn();
    }

}