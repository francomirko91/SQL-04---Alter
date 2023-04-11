import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/mirkodb", "developer", "developer");
                Statement statement = connection.createStatement();
               statement.executeUpdate("alter table students add column country varchar(30)");

                statement.executeUpdate("update students set country = 'italy' where idstudents_id = 1");
                statement.executeUpdate("update students set country = 'italy' where idstudents_id = 2");
                statement.executeUpdate("update students set country = 'germany' where idstudents_id = 3");
                statement.executeUpdate("update students set country = 'germany' where idstudents_id = 4");



            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }