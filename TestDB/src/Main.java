import java.sql.*;

public class Main {
    public static void main(String[] args) {
//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/angrybird/workspace/personal/javaLearning/TestDB/testjava.db");
//            Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name Text, phone INTEGER, email Text)");
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/angrybird/workspace/personal/javaLearning/TestDB/testjava.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " + "(name Text, phone INTEGER, email Text)");

//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Hrishi', 7666865747, 'hrishi@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Ketan', 2349813793, 'ketan@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('bhavesh', 9832734792, 'bhavesh@email.com')");
//
//            statement.execute("UPDATE contacts SET phone = 9883763723 where name = 'Ketan'");
//
//            statement.execute("DELETE FROM contacts where name = 'bhavesh'");
//
            statement.execute("SELECT * FROM contacts");
            ResultSet result = statement.getResultSet();

            while (result.next()) {
                System.out.println(result.getString("name") +" " +
                                   result.getInt("phone") + " " +
                                   result.getString("email"));
            }
            result.close();

            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: "+ e.getMessage());
        }
    }
}