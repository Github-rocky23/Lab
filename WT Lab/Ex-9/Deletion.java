import java.sql.*;
class Deletion
{
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vasavi", "root","root");
            Statement stmt=con.createStatement();
            String s="delete from emp where id=2 ";
            stmt.executeUpdate(s);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}