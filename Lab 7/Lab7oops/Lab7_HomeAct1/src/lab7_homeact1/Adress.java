
package lab7_homeact1;
// class with one non-arrgumented constructor
public class Adress 
{
    public int streetNum;
    public int houseNum;
    public String city;
    public int code;
    
    //constructor
    public Adress()
    {
    }
    
    //Setter method
    public void Set(int streetNum, int houseNum, String city, int code)
    {
        this.streetNum = streetNum;
        this.houseNum = houseNum;
        this.city = city;
        this.code = code;
    }
    
    //Get Method for street number
    public int getStreetNum()
    {
        return streetNum;
    }
    
    //Get method for House number
    public int gethouseNum()
    {
        return houseNum;
    }
    
    // Get method for city
    public String getCity()
    {
        return city;
    }
    
    //Get methods for code
    public int getcode()
    {
        return code;
    }
    
    //display method to display adress
    public void display()
    {
        System.out.println("Adress:"+"\nStreet Num: "+streetNum+"\nHouse Number: "+
        houseNum+"\nCity: "+city+"\nCode: "+code);
    }   
}

