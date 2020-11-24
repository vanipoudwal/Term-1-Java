
package plenty;

import java.sql.*;

public class Plenty
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientServer").newInstance();
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/qwerty","qwe","qwe");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into yay values(1,'vani',987,'female',10)");
            ResultSet rs = stmt.executeQuery("select * from yay");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3)+""+rs.getString(4)+""+rs.getInt(5));
            }
        }
        catch(Exception e){}
    }
}
/*
Statement stat = c.createStatement
stat = con.prepareStatement("select * form autoors where auid = ?");
stat.setString(1,"a101");
*/
