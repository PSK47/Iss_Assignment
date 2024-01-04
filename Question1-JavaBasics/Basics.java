import java.io.*;
import java.util.*;

class Example
{
    int var1;
    int var2;
    //Default constructor
    Example()
    {
        var1=10;
        var2=20;
    }
    //Parameterized constructor
    Example(int var1,int var2)
    {
        this.var1=var1;
        this.var2=var2;
    }
    void display()
    {
        System.out.println("var1:"+var1);
        System.out.println("var2:"+var2);
    }
    int add()
    {
        return var1+var2;
    }
}

public class Basics
{
    public static void main(String[] args)
    {
        //initializing objects of Example
        Example object1=new Example();
        Example object2=new Example(5,10);

        object1.display();
        System.out.println();
        object2.display();

        System.out.println("Addition function of object 1:"+object1.add());
        System.out.println();
        System.out.println("Addition function of object 2:"+object2.add());
    }
}
