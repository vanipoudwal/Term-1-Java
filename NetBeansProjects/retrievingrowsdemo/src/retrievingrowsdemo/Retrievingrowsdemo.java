
package retrievingrowsdemo;

import java.sql.*;

public class Retrievingrowsdemo 
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/hi","hi","hi");
            String str = "select * from hi where name = ?";
            PreparedStatement ps = c.prepareStatement(str);
            ps.setString(1,"a1001");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+""+rs.getString(2));
            }
        }
        catch(Exception e) {}
    }
}
//inserting rows
/*  String str = "insert into authors(id, name) values(?,?)";
    PreparedStatement ps = c.prepareStatement(str);
    ps.setString(1,"a1001");
    ps.setString(2,"abrahim white");
    int rt = ps.executeUpdate();  */

//updating and deleting rows
/*  String str = "update authors set state=? where city=?";
    PreparedStatement ps = c.prepareStatement(str);
    ps.setString(1,"CA");
    ps.setString(2,"Oakland");
    int rt = ps.executeUpdate(); 

    String str = "delete from authors where name=?";
    PreparedStatement ps = c.prepareStatement(str);
    ps.setString(1,"abrahim white");
    int rt = ps.executeUpdate();  */
