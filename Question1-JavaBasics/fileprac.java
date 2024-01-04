import java.io.*;
import java.util.Scanner;

class bank implements Serializable
{
    String accName;
    String branch;

    public bank(String a, String b)
    {
        this.accName=a;
        this.branch=b;
    }
    public String retName()
    {
        return this.accName;
    }

    public String getBranch()
    {
        return this.branch;
    }

    public void dispBranch()
    {
        System.out.println(this.branch);
    }

}

public class fileprac
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        bank arr[]=new bank[3];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter account name:");
            String a=sc.next();
            System.out.print("Enter Branch name:");
            String b=sc.next();
            arr[i]=new bank(a,b);
        }

        File obj=new File("Account.txt");
        try
        {
            if(!obj.exists())
            {
                if (obj.createNewFile())
                {
                    System.out.println("New File created");
                }
            }
        }
        catch (Exception e)
        {

        }
        try
        {
            ObjectOutputStream objout=new ObjectOutputStream(new FileOutputStream(obj));
            objout.writeObject(arr);
            objout.close();
        }
        catch (Exception e)
        {

        }
        bank res[]=null;
        try
        {
            ObjectInputStream objin= new ObjectInputStream(new FileInputStream(obj));
            res=(bank[])objin.readObject();
            for(int i=0;i< res.length;i++)
            {
                if((res[i].retName()).equalsIgnoreCase("Vellore"))
                {
                    res[i].dispBranch();
                }
            }

        }
        catch (Exception e)
        {

        }
    }
}
