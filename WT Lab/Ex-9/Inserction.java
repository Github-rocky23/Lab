import java.sql.*;
class Inserction 
{
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vasavi", "root","root");
            PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
            ps.setInt(1,7);
            ps.setString(2, "hello");
            ps.setInt(3, 26);
            ps.executeUpdate();
            System.out.println("Record inserted!");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
