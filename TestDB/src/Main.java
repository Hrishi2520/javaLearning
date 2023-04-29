import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONECTION_STRING = "jdbc:sqlite:/home/angrybird/workspace/personal/javaLearning/TestDB/" +DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(CONECTION_STRING);
            Statement statement = conn.createStatement();
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" +COLUMN_NAME + " Text, " +
                    COLUMN_PHONE+" INTEGER, " +
                    COLUMN_EMAIL+" Text" +
                    ")");

            insertContact(statement, "Tim", 948592738, "tim@gmail.com");
            insertContact(statement, "Dharmesh", 71652376, "dharmesh@gmail.com");
            insertContact(statement, "Anu", 9309273, "anu@gmail.com");
            insertContact(statement, "Chaitu", 98791829, "chaitu@gmail.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + " =8926378324" +
                    " WHERE " + COLUMN_NAME +" ='abrar'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS+ " WHERE "+ COLUMN_NAME + " ='kunal'");

            ResultSet result = statement.executeQuery("SELECT * FROM "+TABLE_CONTACTS);
            while (result.next()) {
                System.out.println(result.getString(COLUMN_NAME) +" " +
                                   result.getInt(COLUMN_PHONE) + " " +
                                   result.getString(COLUMN_EMAIL));
            }


            result.close();

            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: "+ e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO "+ TABLE_CONTACTS+
                "(" + COLUMN_NAME+ ", "+
                COLUMN_PHONE+ ", "+
                COLUMN_EMAIL+ ")"+
                "VALUES('"+name + "', "+ phone + ", '"+ email + "')");
    }
}