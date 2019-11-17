package project;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/**
 * Abstract class DataManager - Manage data read from a text file of comma separated values
 *
 * @author COMP1161
 * @version 1.0 2019 Semester 1
 */
public abstract class DataManager<tempData>
{
    // instance variables - replace the example below with your own
    protected List<tempData> data;
    protected int currentPos = 0;
    
    public DataManager(String fileName){
        data = new ArrayList<tempData>();
        try {
            Scanner myScanner = openFile(fileName);
            while (myScanner.hasNext()) {
                    String oneLine = myScanner.nextLine();
                    String[] tokens = oneLine.split(",");
                    tempData newObject = buildObject(tokens);
                    add(newObject);
            }
        }
        catch (Exception e) {
            System.out.println("File not found");
        }
    }
    
    /**
     * Adds an object to the collection of objects
     * @param newData the new object that is to be added to the list
     */
    public void add(tempData newData){
        data.add(newData);
    }
    
    /**
     * Returns the count of the objects in the collection
     * @return count of objects
     */
    public int size() {
        return data.size();
    }
    
    /**
     * Go to the start of the collection
     */
    public void rewind(){
            currentPos = 0;
    }
    
    /**
     * Retrieve the next object from the collection and advance after
     * @return the next object from the list, or null is at the end
     */
    public tempData next(){
        if (currentPos < data.size())
            return data.get(currentPos++);
        else
            return null;
    }
    
    /**
     * Checks to see if the end of the collection has been reached
     * @return true if the end of the collection has not yet been reached. False otherwise
     */
    public boolean hasNext() {
        return currentPos < data.size();
    }
    
    
    /**
     * Open a text file
     * @param f name of file containing comma separated values
     * @return scanner object that can be used to read the file 
     */
    public abstract Scanner openFile(String f);
    
    /**
     * Parse data read from file to create an object
     * and add the object to the list
     * @param tokens list of strings being data read from file
     * @return a new object that is to be added to the list
     */
    public abstract tempData buildObject(String[] tokens);
    
    /** 
     * Close the file after writing the data back (overwriting) if flag is set to true
     * @param flag set to true if data is to be written to the file
     */
    public abstract void closeFile(boolean flag);
}
