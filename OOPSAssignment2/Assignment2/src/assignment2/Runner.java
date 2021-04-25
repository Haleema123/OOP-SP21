
package assignment2;

import java.util.Scanner;

public class Runner 
{
    public static void main(String[] args) 
    {
        boolean s = true;
        EmailAddress from = null;
        
        do
        {
            try
            {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter an Email adress of Sender: ");
                String adress = input.nextLine();
                from = new EmailAddress(adress);
                s = false;
            }
            catch(IllegalArgumentException ex)
            {
                System.out.println("OOPS...:(\nInvalid email....Enter Again");
            }   
        } while(s); 
        
        s = true;
        EmailAddress to = null;
        do
        {
            try
            {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter an Email adress of Receiver: ");
                String adress = input.nextLine();
                to = new EmailAddress(adress);
                s = false;
            }
            catch(IllegalArgumentException ex)
            {
                System.out.println("OOPS...:(\nInvalid email....Enter Again");
            }   
        } while(s);
        
        String subject = "Subject of email";
        String message = "These are the contents of email";

        Email email = new Email(from, to, subject, message);

        email.addPara("This is another para that is added");
        System.out.println(email);

        BookChapter bookChapter = new BookChapter("Inheritance", 11, "Contents about inheritance");
        System.out.println(bookChapter);
    }
}