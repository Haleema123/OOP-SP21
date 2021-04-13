
package lab7_homeact1;
public class Lab7_HomeAct1_Runner 
{
    public static void main(String[] args) 
    {
        Adress ADRESS = new Adress();
        Person PERSON = new Person("xyz",ADRESS);
        ADRESS.Set(1,2,"Murree",123);
        PERSON.display();
    }   
}
