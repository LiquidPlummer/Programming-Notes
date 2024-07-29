package demo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyClass implements AutoCloseable{
    private Connection connection;

    public MyClass(Connection connection) throws SQLException {
        this.connection = connection;
    }

    public void close() throws SQLException {
        System.out.println("I'm closing!");
        this.connection.close();
    }
}
