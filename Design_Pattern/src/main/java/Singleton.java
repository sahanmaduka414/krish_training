import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Singleton {



    public static Singleton s;

    public static Connection conn;


    private Singleton() throws SQLException {
        // create single instance of DB connection
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "1234");
        // port & db name
        conn = DriverManager.getConnection("jdbc:mysql://"
                        + "localhost" + ":" + "3307" + "/" + "DATABASE",
                connectionProps);
    }

    public Connection getConnection() throws SQLException {
        return conn;
    }

    public static Singleton getInstance() throws SQLException {

        if (s == null) {
            synchronized(Singleton.class) {
                if (s == null) {
                    s = new Singleton();
                    System.out.print(" DB connection created.");
                }
            }
        }
        conn = s.getConnection();
        return s;
    }

}
