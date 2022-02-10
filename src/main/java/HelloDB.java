import java.sql.*;

public class HelloDB {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/human_ressources", "root", "");
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("select count(*) as Nombre_employés from employees ");
        while (rs.next()) {
            System.out.println("Le nombre total d'employés est: "+rs.getInt(1));
        }
    }
}
