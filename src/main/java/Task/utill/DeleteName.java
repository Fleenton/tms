package Task.utill;

import Task.configuration.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

public class DeleteName {
    private static final String dataBase = "SELECT * FROM people";
    private static final String DELETE_SQL = ("delete from people where id=?");
    Connector connector = new Connector();

    public void deleteName(char letter) {
        try (PreparedStatement preparedStatement = connector.getConnection().prepareStatement(dataBase)) {
            ResultSet resultSet = preparedStatement.executeQuery(dataBase);
            Set<String> nameSet = new HashSet<>();
            while (resultSet.next()) {
                nameSet.add(resultSet.getString("u_name"));
            }
            nameSet.stream().filter(name -> StringHandler.isContainsMoreThenTwoCh(name, letter)).forEach(this::delete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String name) {
        try (Connection connection = connector.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_SQL)) {
            preparedStatement.setString(1, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
