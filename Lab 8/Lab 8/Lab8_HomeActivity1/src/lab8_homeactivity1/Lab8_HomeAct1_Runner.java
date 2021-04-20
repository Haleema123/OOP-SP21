package lab8_homeactivity1;
public class Lab8_HomeAct1_Runner 
{
    public static void main(String[] args) 
    {
        Date d1 = new Date(2021, 3, 28);
        System.out.println("ABOUT STUDENT");
        Student student = new Student("Soha","House#2,Street#3,Islamabad",3579,"soha456@gmail.com","Gratuated");
        student.display();
        System.out.println("\nABOUT FACULTY");
        Faculty faculty = new Faculty("Alia","House#3,Street#4,Lahore",3456,"aliya1@gmail.com","G10",75000,d1,5,"Manager");
        faculty.display();
        System.out.println("\nABOUT STAFF");
        Staff staff = new Staff("Harm","House#4,Street#5,Multan",6789,"harm@gmail.com","G11S",50000,d1,"Accountant");
        staff.display();
        
        
    }  
}
