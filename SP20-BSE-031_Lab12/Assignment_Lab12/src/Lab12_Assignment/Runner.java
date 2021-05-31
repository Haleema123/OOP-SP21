
package Lab12_Assignment;
public class Runner
{
    public static void main(String[] args) 
    {
        
        HumanResource<Association> HR = new HumanResource<>();
        Association student = new Student("Haleema","8882");
        Association teacher = new Teacher("Amna","9981");
        Association student1 = new Student("Asma","4563");
        HR.add(student);
        HR.add(teacher);
        HR.add(student1);
        HR.add(new Teacher("Mehwish","2313"));
        HR.delete(student1);
        System.out.println(HR);
    }   
}
