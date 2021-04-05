
package lab6homeact2;
public class lab6homeact2_Runner
{
    public static void main(String[] args)
    {
        Lab6HomeAct2 obj1 = new Lab6HomeAct2();
        Lab6HomeAct2 obj2 = new Lab6HomeAct2('h');
        Lab6HomeAct2 obj3 = new Lab6HomeAct2();
        obj1=null;
        Lab6HomeAct2.destroyObj();
        obj2=null;
        Lab6HomeAct2.destroyObj();
        Lab6HomeAct2.display();
 
    }  
}
