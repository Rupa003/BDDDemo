import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCD_DML_DEMO {
    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url= "jdbc:mysql://127.0.0.1:3306/universalit";
        String uname="root";
        String password="secretpassword";
        ResultSet resultSet=null;
        Connection con= null;
        String query="select * from student"; //DQL
        String insertQuery="insert into student values('Rupa','Java');";

        try{
            con= DriverManager.getConnection(url, uname, password);
            Statement st= con.createStatement();
            int count=st.executeUpdate(insertQuery);
            System.out.println("No of rows affected= "+ count);
        }
        finally {
            if(resultSet !=null)
                resultSet.close();
            if(con != null)
                con.close();
        }
    }
}
