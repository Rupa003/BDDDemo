import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JdbcRowSetUpdateDemo {
    String url="jdbc:mysql://localhost:3306/universalit";
    String uname="root";
    public static void main(String[] args) throws Exception {
        RowSetFactory rsf= RowSetProvider.newFactory();
        JdbcRowSet rs= rsf.createJdbcRowSet();
        rs.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);
        rs.setConcurrency(ResultSet.CONCUR_UPDATABLE);
        rs.setUrl("jdbc:mysql://localhost:3306/universalit");
        rs.setUsername("root");
        rs.setPassword("secretpassword");
        rs.setCommand("select * from student");
        rs.execute();
        while(rs.next()){
            String name= rs.getString(1);
            if(((String)name).equalsIgnoreCase("Sudhir1")){
                System.out.println(name);
                rs.updateString(1,"Rupa");
                rs.updateRow();
            }
        }
        System.out.println("Record updated successfully");
        rs.close();
    }
}
