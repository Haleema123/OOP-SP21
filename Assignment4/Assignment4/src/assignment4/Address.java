
package assignment4;
import java.io.*;
public class Address implements Serializable
{
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String adress;

    public Address(String firstname, String lastname, String phonenumber, String adress) 
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.adress = adress;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }

    public void setAdress(String adress) 
    {
        this.adress = adress;
    }

    @Override
    public String toString() 
    {
        return "Firstname: " + firstname + "\nLastname: " + lastname + "\nPhonenumber: " + phonenumber + "\nAddress: " + adress;
    }
    
    
    
}
