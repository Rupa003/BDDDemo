import java.sql.*;
public class PrintStudentsTable {

    public static void main(String[] args) throws Exception {
        // Create a connection to the MySQL database.
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universalit", "root", "secretpassword");

        // Create a statement object.
        Statement statement = connection.createStatement();

        // Execute a SQL query to select all rows from the `students` table.
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

        // Loop through the ResultSet and print each row.
        while (resultSet.next()) {
            System.out.println("Student Name: " + resultSet.getString("name"));
            System.out.println("Student Age: " + resultSet.getString("subject"));
            System.out.println();
            System.out.println("user is working on github");
            System.out.println("this time around I am practicing user is working on github via command line");
        }

        // Close the ResultSet, Statement, and Connection objects.
        resultSet.close();
        statement.close();
        connection.close();
    }
}