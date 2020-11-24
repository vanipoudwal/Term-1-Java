
package dao;

import connectivity.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.modeldb;

public class studentdaoimpl implements studentdao
{
    Connection co;
    PreparedStatement ps;
    
    public void ArrayList(modeldb obj)
    {
        try
        {
            co = connect.getConnect();
            ps= co.prepareStatement("insert into STUDENT values(?,?,?)");
            ps.setString(1,obj.getId());
            ps.setString(2,obj.getName());
            ps.setString(3,obj.getEmail());
            ps.executeUpdate();
        }
       catch(Exception e)
       {}
    }

    @Override
    public void createRecord(modeldb ob1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Edit(modeldb ob2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Delete(modeldb ob3) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}