
package assignment4;
import java.io.*;
public class Runner 
{
    public static void main(String[] args) throws Exception
    {
        AddressBook x = new AddressBook();
        Address Address1 = new Address("Haleema","Saud","03432158437","Islamabad");
        Address Address2 = new Address("Manahil","Fatima","098643165","Lahore");
        Address Address3 = new Address("Soha","Saud","0345623487","Karachi");
        Address Address4 = new Address("Rabia","Awan","051456324","Multan");
        Address Address5 = new Address("Emaan","Dawood","03452467354","Islamabad");
        Address Address6 = new Address("Hina","Ali","0515674387","Lahore");
        Address Address7 = new Address("Fariha","Auqasha","04325684590","Islamabad");
        Address Address8 = new Address("Aliya","Imran","03452810649","Rawalpindi");
        Address Address9 = new Address("Raheela","Hashim","032415469262","Murree");
        Address Address10 = new Address("Aqsa","Awan","0311563832","Islamabad");
        
        x.addContact(Address1);
        x.addContact(Address2);
        x.addContact(Address3);
        x.addContact(Address4);
        x.addContact(Address5);
        x.addContact(Address6);
        x.addContact(Address7);
        x.addContact(Address8);
        x.addContact(Address9);
        x.addContact(Address10);
        
        System.out.println("-----ADDRESS BOOK-----\n");
        x.display();  
        
        System.out.println("-----Contact that is Searched-----\n");
        System.out.println(x.searchContact("Haleema", "Saud")+"\n");
       
        Address10.setAdress("Sialkot");
        Address4.setPhonenumber("0513245173");
        Address4.setAdress("Lahore");
        
        x.updateContact(Address10);
        x.updateContact(Address4);
        
        x.deleteContact(Address9);
        x.deleteContact(Address2);
        
        System.out.println("-----Address Book after update and deletion of specific contacts-----\n");
        x.display();
    }    
}
