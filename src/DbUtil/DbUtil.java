/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbUtil;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar
 */
public class DbUtil {

    private static Connection connection = null;

    /**
     *
     * @return
     */
    public static Connection getConnection() throws Exception {
        if (connection != null) {
            return connection;
        } else {
            try {
                Properties prop = new Properties();
                InputStream inputStream = DbUtil.class.getResourceAsStream("db.properties");
                prop.load(inputStream);

                String driver = prop.getProperty("driver");
                String url = prop.getProperty("url");
                String user = prop.getProperty("user");
                String password = prop.getProperty("password");

                Class.forName(driver);

                connection = (Connection) DriverManager.getConnection(url, user, password);

            } catch (IOException | ClassNotFoundException | SQLException ex) {
                throw new Exception("Error in connection to the server");
            }
            return connection;
        }
    }
}
