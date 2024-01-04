import java.util.*;

class multithread
{
    public static void main(String args[])
    {
        Random rand = new Random();

        int stu[]=new int[240];
        for(int i=0;i<240;i++)
        {
            stu[i]=rand.nextInt(3)+1;
        }
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                count1 f1 = new count1(0, 60);
                f1.countfirst(stu);
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run()
            {
                count1 f2= new count1(61, 120);
                f2.countfirst(stu);
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run()
            {
                count1 f3= new count1(121, 180);
                f3.countfirst(stu);
            }
        });
        Thread t4=new Thread(new Runnable() {
            @Override
            public void run()
            {
                count1 f4= new count1(181, 240);
                f4.countfirst(stu);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }
        catch(Exception e)
        {

        }
        System.out.println(count1.count_a+" "+count1.count_b+" "+count1.count_c);
        if( count1.count_a >= count1.count_b && count1.count_a >= count1.count_c)
            System.out.println("Student A is the Program Representative");

        else if (count1.count_b >= count1.count_a && count1.count_b >= count1.count_c)
            System.out.println("Student B is the Program Representative");

        else
            System.out.println("Student C is the Program Representative");


    }
}

class count1
{
    static int count_a=0;
    static int count_b=0;
    static int count_c=0;
    int start;
    int end;
    public count1(int a,int b)
    {
        this.start=a;
        this.end=b;
    }
    /*
    public void run()
    {
        for (int i = 0; i < 5; i++) {
         System.out.println("The Thread name is " + Thread.currentThread().getName());
      }
    }
    */

    public synchronized void countfirst(int stu[])
    {

        for(int i=start;i<end;i++)
        {
            if(stu[i]==1)
            {
                count_a++;
            }
            else if(stu[i]==2)
            {
                count_b++;
            }
            else
            {
                count_c++;
            }
        }
    }

}
