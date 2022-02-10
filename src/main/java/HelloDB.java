import java.sql.*;

public class HelloDB {
    public static void main(String[] args) throws SQLException {
        DatabaseOperations a = new DatabaseOperations("localhost:3306", "human_ressources", "root", "");
        DatabaseMetaData rst = a.displayElementsInDB("human_ressources");

    }
}
