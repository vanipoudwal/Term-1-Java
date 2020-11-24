
package connectivity;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class connect 
{
    private static Connection co;
    public static Connection getConnect() throws NamingException, SQLException
    {
       Context ctx = new InitialContext();
       DataSource ds = (DataSource) ctx.lookup("jdbc/NAARAD");
       co = ds.getConnection();
       return co;
    }
}
