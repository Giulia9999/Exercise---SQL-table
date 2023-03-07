import java.sql.*;

// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/newdb?" +
                            "user='root'&password=c620918fazuKl420");
            stmt = conn.createStatement();
            String query = "CREATE TABLE students (student_id INT(10), first_name VARCHAR(30), last_name VARCHAR(30))";
            String query2 = "ALTER TABLE `students`\n" +
                    "\tCHANGE COLUMN `student_id` `student_pk` INT(10) NOT NULL AUTO_INCREMENT FIRST,\n" +
                    "\tADD PRIMARY KEY (`student_pk`);";
            String addStudent1 = "INSERT INTO students (first_name, last_name) VALUES ('Giulia', 'Conta')";
            String addStudent2 = "INSERT INTO students (first_name, last_name) VALUES ('Luca', 'Rossi')";
            String addStudent3 = "INSERT INTO students (first_name, last_name) VALUES ('Andrea', 'Valli')";
            String addStudent4 = "INSERT INTO students (first_name, last_name) VALUES ('Franco', 'Carta')";

            stmt.execute(addStudent4);


            //rs = stmt.executeQuery("SELECT * FROM students");

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
