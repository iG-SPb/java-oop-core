package ru.geekbrains.java.oop.core.lesson8;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static void main(String[] args) throws SQLException {
        DataSource dataSource = prepareDataSource();
        try (Connection connection = dataSource.getConnection()) {
        readFromBase_name(connection, "Ivan");
        showUsersByAge(connection, 18, 50);
        deleteRecord(connection,"GeekBrains");
        insertRecord(connection,"GeekBrains 45 test@mail");
       }
    }

    private static DataSource prepareDataSource() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("iG");
        dataSource.setPassword("12345678");
        dataSource.setUrl("jdbc:mysql://localhost:3306/user_schema");
        dataSource.setServerTimezone("UTC");
        return dataSource;
    }

    private static void readFromBase_name(Connection connection, String name) throws SQLException {
        List<User> users = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM user WHERE name = ?")) {
            statement.setString(1, name);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setName(resultSet.getString("name"));
                    user.setAge(resultSet.getInt("age"));
                    user.setEmail(resultSet.getString("email"));
                    System.out.println(user);
                    users.add(user);
                }
            }
        }
    }

    private static void showUsersByAge(Connection connection, int min, int max) throws SQLException {
        List<User> users = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM user WHERE age BETWEEN ? AND ?")) {
            statement.setInt(1, min);
            statement.setInt(2, max);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setName(resultSet.getString("name"));
                    user.setAge(resultSet.getInt("age"));
                    user.setEmail(resultSet.getString("email"));
                    System.out.println(user);
                    users.add(user);
                }
            }
        }
    }

    private static void insertRecord(Connection connection, String record) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("INSERT INTO user (name, age, email) VALUES (?, ?, ?)")) {
            //statement.setString(1, record);
            String[] subStr;
            subStr = record.split(" ");
            statement.setString(1, subStr[0]);
            statement.setInt(2, Integer.parseInt(subStr[1]));
            statement.setString(3, subStr[2]);
            int result = 0;
            result = statement.executeUpdate();
            System.out.println(result);
        }
    }

    private static void deleteRecord(Connection connection, String name) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("DELETE FROM user WHERE name = ?")) {
            statement.setString(1, name);
            int result = 0;
            result = statement.executeUpdate();
            System.out.println(result);
        }
    }
}
