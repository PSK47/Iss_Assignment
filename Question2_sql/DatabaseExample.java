import java.sql.*;

public class DatabaseExample {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/employee";
    private static final String USER = "prajwal";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            // Create a JDBC connection
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // Example using CallableStatement
            CallableStatement callableStatement = connection.prepareCall("{call DisplayDatabase()}");
            ResultSet callableResultSet = callableStatement.executeQuery();
            // Process the result set if there's any

            // Example using PreparedStatement
            String preparedStatementQuery = "SELECT * FROM employee WHERE department_number = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(preparedStatementQuery);
            preparedStatement.setInt(1, 3);  // Example parameter
            ResultSet preparedStatementResultSet = preparedStatement.executeQuery();


            // Close resources
            callableResultSet.close();
            callableStatement.close();
            preparedStatementResultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
