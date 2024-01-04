
import java.io.*;
import java.sql.*;
import java.util.Properties;

public class db_2
{
    public static void main(String[] args)
    {
        try
        {
            //Using files to establish connection
            Properties p=new Properties();
            File f=new File("data.txt");
            FileInputStream fs= new FileInputStream(f);
            p.load(fs);
            Class.forName("com.mysql.jdbc.Driver");
            //Connection con= DriverManager.getConnection("jdbc:mysql://localhost/sts","root","pk0804");
            Connection con= DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
            System.out.println("Connection Successful");
            Statement stmt= con.createStatement();
            //***creating tables***
            /*
            try
            {
            String query="create table Stu(regno int,name varchar(30),program varchar(10),school varchar(10))";
            stmt.execute(query);
            System.out.println("Table created");
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
            */
            //***Inserting Values***
            /*
            try
            {
                String query = "Insert into stu values(110,'Prajwal','CSEcore','SCOPE')";
                stmt.execute(query);
                System.out.println("Values inserted");
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
            */
            //***Displaying columns***
            ResultSet rs= stmt.executeQuery("Select * from stu");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
