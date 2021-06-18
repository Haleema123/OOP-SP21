
package assignment4;
import java.io.*;
public class AddressBook implements Serializable
{
    private Address[] contact;

    //  Constructor
    public AddressBook()
    {
        this.contact = new Address[1];    
    }
    
    // Method to add Contact
    public void addContact(Address address) throws Exception
    {
        if(contact[0]==null)
        {
            contact[contact.length-1] = address;
        }
        else
        {   
            extend();
            contact[contact.length-1] = address;
        }  
        FileOutputStream fos = new FileOutputStream("Address Book");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        for(int i=0; i<contact.length; i++)
        {
            oos.writeObject(contact[i]);   
        }
        oos.close();
    } 
   
    //  Method to Extend the size of list
    private void extend()
    {
        Address[] temp = new Address[contact.length];
        temp=contact;
        contact = new Address[contact.length+1];
        
        for(int i=0; i<temp.length; i++)
        {
            contact[i]= temp[i];
        }      
    }
    
    // Method to Search Contact
    public Address searchContact(String firstName,String lastName) throws Exception
    {
        FileInputStream fis = new FileInputStream("Address Book");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        for(int i=0; i<contact.length; i++)
        {            
            Address b = (Address)ois.readObject(); 
            if(b.getFirstname().equals(firstName)&&(b.getLastname().equals(lastName)))
            {
                return b;
            }       
        } 
        return null;
    } 
    
    //Method to update any contact
    public void updateContact(Address address) throws Exception
    {
        FileInputStream fis = new FileInputStream("Address Book");
        ObjectInputStream ois = new ObjectInputStream(fis);
       
       
        for(int i=0; i<contact.length; i++)
        {
            if(contact[i].getFirstname()==address.getFirstname())
            {
                contact[i]=address;  
            }
        }
        FileOutputStream fos = new FileOutputStream("Address Book");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        for(int i=0; i<contact.length; i++)
        {
            oos.writeObject(contact[i]);   
        }
        oos.close();    
    } 
    
    // Method to Delete any Contact
    public void deleteContact(Address address) throws Exception
    {
        FileInputStream fis = new FileInputStream("Address Book");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        for(int i=0; i<contact.length; i++)
        {
            Address b = (Address)ois.readObject(); 
            if(address.getFirstname().equals(b.getFirstname())&& address.getLastname().equals(b.getLastname()))
            {
                Address[] temp = contact;
                contact = new Address[temp.length-1];
                for(int j=0,k=0; j<contact.length; j++, k++)
                {
                    if(k==i)
                    {
                        k++;   
                    }
                    contact[j] = temp[k];               
                }
            }
        }
        FileOutputStream fos = new FileOutputStream("Address Book");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        for(int i=0; i<contact.length; i++)
        {
            oos.writeObject(contact[i]);   
        }
        oos.close();
    }
    
    // Method to Display Contacts 
    public void display() throws Exception
    {
        FileInputStream fis = new FileInputStream("Address Book");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        try
        {
            while(true)
            {
                Address b = (Address)ois.readObject(); 
                System.out.println(b+"\n");
            }    
        }
        catch(Exception e)
        {
        }
        
        ois.close();   
    }   
}
