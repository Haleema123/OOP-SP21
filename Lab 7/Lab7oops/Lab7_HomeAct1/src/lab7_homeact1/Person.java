
package lab7_homeact1;
// class with one arrgumented constructor
public class Person 
{
    public Adress adress;
    public String name;
    
    // constructor
    public Person(String Name,Adress adress)
    {
        this.name=Name ;
        this.adress =adress;
    }
    
    //Setter method 
    public void set(String name,Adress adress)
    {
        this.name =name;
        this.adress= adress;
    }
    
    // method to display Person's adress
    public void display()
    {
        System.out.println("Person's name: "+name);
        adress.display();
    }   
}
