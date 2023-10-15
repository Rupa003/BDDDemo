import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_DEMO {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url= "jdbc:mysql://127.0.0.1:3306/universalit";
        String uname="root";
        String password="secretpassword";
        Connection con= DriverManager.getConnection(url,uname,password);
        Statement st= con.createStatement();
        ResultSet resultSet= st.executeQuery("select * from student");
        while(resultSet.next()) {
            //System.out.println("student Id :"+ resultSet.getInt(1));
            System.out.println("student Name :"+ resultSet.getString(1));
            System.out.println("student Subject :"+ resultSet.getString(2));
        }
    }
}
