import java.sql.*;
public class JDBC {
    public static void main(String args[])
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/dbbca","postgres","123");

        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
      System.out.println("Connection Succesfully");
    }
}