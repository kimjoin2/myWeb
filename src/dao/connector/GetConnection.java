package dao.connector;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by bumskim on 2017. 5. 30..
 */
public class GetConnection {
    static public final GetConnection instance = new GetConnection();

    private Connection connection = null;

    final static private String url = "jdbc:mysql://localhost:3306/my?useSSL=false";
    final static private String id = "root";
    final static private String pw = "root";

    private GetConnection() {}

    public Connection getConnection() {
        String drv = "com.mysql.jdbc.Driver";

        try {
            Class.forName(drv);
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("driver not found");
        }

        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection = null;
        }
    }
}
