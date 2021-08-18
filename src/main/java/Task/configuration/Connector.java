package Task.configuration;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Connector {
    public Connection getConnection() throws Exception {
        Properties properties = new Properties();
        try (InputStream in = Connector.class.getClassLoader().getResourceAsStream("database.properties")) {
            properties.load(in);
        }
        String url = properties.getProperty("db.url");
        String login = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");
        String driver = properties.getProperty("db.driver");
        Class.forName(driver);

        return DriverManager.getConnection(url, login, password);
    }
}
