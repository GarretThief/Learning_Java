package SE.classwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Garret on 30.03.2017.
 */
public class DbExample {
    private static  String DB_NAME = "jdbc:mysql://localhost/mydbtest";
    private static  String DB_LOGIN = "root";
    private static  String DB_PASSWORD = "root";
    private static  String INSERT_1 = "insert into students (first_name, last_name, age) values ('Sasha', 'Pavlenko', 24),";
    private static  String INSERT_2 = "('Mike', 'Taison', 24)";
    private static  String DELETE = "delete from students;";
        public static void main(String[] args) {
            try (Connection connection = DriverManager.getConnection(DB_NAME,DB_LOGIN,DB_PASSWORD);
                 Statement statement = connection.createStatement()){
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                statement.clearBatch();
                statement.addBatch("insert into students (first_name, last_name, age) values ('Sasha1', 'Pavlenko', 24);");
                statement.addBatch("insert into students (first_name, last_name, age) values ('Sasha2', 'Pavlenko', 24);");
                statement.addBatch("insert into students (first_name, last_name, age) values ('Sasha3', 'Pavlenko', 24);");
                statement.executeBatch();
                ResultSet resultSet = statement.executeQuery("select * from students");
                while (resultSet.next()){
                    System.out.print(resultSet.getInt("id") + " ");
                    System.out.print(resultSet.getString("first_name") + " ");
                    System.out.print(resultSet.getString("last_name") + " ");
                    System.out.println(resultSet.getInt("age"));
                }

            }catch (Exception e){
                e.printStackTrace();
            }

    }
}


