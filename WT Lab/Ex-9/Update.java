import java.sql.*;
class Update
{
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vasavi","root","root");
            Statement stmt =con.createStatement();

            String s="update emp set name='name' "+"where id in(1,4)";
            stmt.executeUpdate(s);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}