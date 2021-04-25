
package assignment2;
import java.io.IOException;
import java.util.Scanner;
public class EmailAddress 
{
    public String emailAddress;
    
    public EmailAddress(String emailAddress)
    {
        String[] x = {"@","."};    // characters which an Email should contain to be Valid
        String[] y = {" ",",","*","&","=",".."};   // characters which an Email should not contain to be Valid
        boolean validation = true;
        for(int i=0; i<x.length; i++)
        {
            if (!(emailAddress.contains(x[i])))
            {
                validation = false;
                break;
            }      
        }
        if(validation)
        {
            for(int i=0; i<y.length; i++)
            {
                if (emailAddress.contains(y[i]))
                {
                    validation = false;
                    break;
                }      
            }
        }
            
        if (validation){
          
            this.emailAddress = emailAddress;
        }
        
        else
        {
            throw new IllegalArgumentException(); 
        }
    }
    
    public String toString()
    {
        return emailAddress;
    }
}
