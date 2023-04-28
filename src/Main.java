import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/angrybird/workspace/personal/javaLearning/TestDB/testjava.db");
//            Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name Text, phone INTEGER, email Text)");
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/angrybird/workspace/personal/javaLearning/TestDB/testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE contacts (name Text, phone INTEGER, email Text)");

            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: "+ e.getMessage());
        }
    }
}