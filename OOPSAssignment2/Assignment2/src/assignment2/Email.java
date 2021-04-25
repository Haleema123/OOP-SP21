
package assignment2;
public class Email extends Text
{
    private EmailAddress from;
    private EmailAddress to;
    private String subject;
    
    public Email(EmailAddress from, EmailAddress to, String subject, String message)
    {
        super(message);
        this.from = from;
        this.to = to;
        this.subject = subject;
    }
    
    public  String toString()
    {
        return "\n\t\t\t\tEMAIL\n\n"+"TO: "+to+"\nFROM: "+from+"\nSUBJECT: "+ subject+"\n\n"+ super.toString()
        +".\n\n\t\t   ------------------------------\n\n";
    }

    
}
