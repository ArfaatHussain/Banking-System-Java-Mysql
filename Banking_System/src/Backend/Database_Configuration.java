package Backend;

import java.sql.*;

public class Database_Configuration {

    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    private final String url = "jdbc:mysql://localhost/bank_system"; // Database URL
    private final String databaseUsername = "root"; // Database username
    private final String databasePassword = "mysql@0000"; // Database password

    // Constructor to establish the database connection
    public Database_Configuration() {
        try {
            // Load MySQL JDBC Driver (optional with modern JDBC but good for clarity)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            conn = DriverManager.getConnection(url, databaseUsername, databasePassword);
            System.out.println("Database connected successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
//            throw e; // Rethrow exception for handling outside the class
        }
    }

    // Method to get the connection object
    public Connection getConnection() {
        return conn;
    }

    // Method to prepare a SQL query
    public PreparedStatement prepareStatement(String query) throws SQLException {
        if (conn != null) {
            stmt = conn.prepareStatement(query);
        }
        return stmt;
    }

    // Method to execute a query with ResultSet
    public ResultSet executeQuery(PreparedStatement preparedStatement) throws SQLException {
        rs = preparedStatement.executeQuery();
        return rs;
    }

    // Method to close the resources (PreparedStatement, ResultSet)
    public void closeResources() {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
        } catch (SQLException e) {
            System.err.println("Failed to close resources: " + e.getMessage());
        }
    }

    // Method to close the database connection
    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            System.err.println("Failed to close connection: " + e.getMessage());
        }
    }
}
