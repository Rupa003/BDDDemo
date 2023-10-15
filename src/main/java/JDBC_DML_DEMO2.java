import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC_DML_DEMO2 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url= "jdbc:mysql://127.0.0.1:3306/universalit";
        String uname="root";
        String password="secretpassword";
        ResultSet resultSet=null;
        Connection con= null;
        String query="select * from student"; //DQL
        String insertQuery="insert into student values('Supriya','C++');";
        try{
            con= DriverManager.getConnection(url, uname, password);
            Statement st= con.createStatement();
            boolean execute = st.execute(insertQuery);
            if(execute) {
                ResultSet resultSet1 = st.getResultSet();
                resultSet1.next();
                System.out.println(resultSet1.getString(1));
            }else{
                System.out.println("No. of rows updated=="+  st.getUpdateCount());
            }
         /*   int count=st.executeUpdate(insertQuery);
            System.out.println("No of rows affected= "+ count);*/
        }
        finally {
            if(resultSet !=null)
                resultSet.close();
            if(con != null)
                con.close();
        }
    }
}


