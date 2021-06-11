
package lab14_assignmentq1;
import java.io.*;
import java.util.*;
public class Lab14_Runner implements Serializable
{
    public static void main(String[] args)throws Exception
    {
        Scanner input = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("ATM System.hax");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        Account[] account = new Account[10];
        account[0] = new Account("Haleema",1234,1000);
        account[1] = new Account("Alisha",7568,500);
        account[2] = new Account("Hooria",4325,2000);
        account[3] = new Account("Amber",9876,1500);
        account[4] = new Account("Manahil",2314,1200);
        account[5] = new Account("Soha",7639,1100);
        account[6] = new Account("Sundus",3567,4000);
        account[7] = new Account("Sana",1256,3400);
        account[8] = new Account("Hani",8721,1340);
        account[9] = new Account("Maryam",9811,2500);
        
        for(int i=0; i<account.length; i++)
        {
            oos.writeObject(account[i]);
        }
        
        oos.close();
        
        FileInputStream fis = new FileInputStream("ATM System.hax");
        ObjectInputStream ois= new ObjectInputStream(fis);
        System.out.print("Enter your account number: ");
        
        int account_Num= input.nextInt();
        try
        {
            int count=0;
            while(true)
            {
                Account obj = (Account)ois.readObject();
                boolean a = true;
                int x =0; 
                if(obj.accountNum==account_Num)
                {
                    while(x!=-1)
                    {
                        System.out.print("1 deposit\n2 withdraw\n3 transfer\n4 balanceInquiry\nEnter any option: ");
                        int option = input.nextInt();
                        System.out.println();
                      
                        if(option==1)
                        {
                            System.out.print("Enter amount You want to deposit: ");
                            int amount = input.nextInt();
                            account[count].deposit(amount);
                        }
                        else if(option==2)
                        {
                            System.out.print("Enter amount You want to withdraw: ");
                            int amount = input.nextInt();
                            account[count].withdraw(amount);
                        }
                        else if(option==3)
                        {
                            System.out.print("Enter amount You want to transfer: ");
                            int amount = input.nextInt();
                            System.out.print("Enter receiver's account number: ");
                            int accountNumber = input.nextInt();
                            account[count].transfer(amount , accountNumber,account);
                        }
                        else 
                        {
                            account[count].balanceInquiry();
                        }
                        System.out.print("Enter any key for more transaction or to exit press -1: ");
                        x = input.nextInt();
                        System.out.println();
                    }
                    break;    
                }
                count++;   
               
               
            }  
        }
        catch(Exception e)
        {
            System.out.println("The account number does not match/n");
        }
        ois.close();
        
        fos = new FileOutputStream("ATM System.hax");
        oos= new ObjectOutputStream(fos);
        
        for(int i=0; i<account.length; i++)
        {
            oos.writeObject(account[i]);
        }
        
        oos.close();
        fis = new FileInputStream("ATM System.hax");
        ois= new ObjectInputStream(fis);

        try
        {
            while(true)
            {
                System.out.println(ois.readObject());      
            }
        }
        catch(Exception e)
        {
            
        }
    }   
}
