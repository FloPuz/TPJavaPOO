package app.bdd;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

    private static DbConnection instance = null;
    private Connection conn;

    private DbConnection() throws IOException, SQLException, ClassNotFoundException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("./src/app/properties/db.properties");
        props.load(in);
        in.close();
        Class.forName(props.getProperty("DB_DRIVER_CLASS"));
        String url = props.getProperty("DB_HOST");
        String user = props.getProperty("DB_USERNAME");
        String password = props.getProperty("DB_PASSWORD");

        conn = DriverManager.getConnection(url, user, password);
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    public static DbConnection getInstance() throws SQLException, IOException, ClassNotFoundException {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }

    public void close() throws SQLException {
        conn.close();
    }

}
