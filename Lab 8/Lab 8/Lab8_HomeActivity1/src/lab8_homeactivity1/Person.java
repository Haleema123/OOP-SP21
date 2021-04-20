
package lab8_homeactivity1;
public class Person 
{
   protected String name;
   protected String adress;
   protected int phoneNum;
   protected String email_adress; 
   
   public Person(String name, String adress, int phoneNum, String email_adress)
   {
       this.name = name;
       this.adress = adress;
       this.phoneNum = phoneNum;
       this.email_adress = email_adress;   
   } 
   
   public void display()
   {
       System.out.println("Name: "+name+"\nAdress: "+adress+"\nPhoneNum: "+phoneNum+"\nEmail_adress: "+email_adress);
   }
}
