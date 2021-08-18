package Task.utill;

import Task.configuration.Connector;
import Task.model.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PrintName {
    private static final String dataBase = "SELECT * FROM people";
    Connector connector = new Connector();

    public List<Person> getPersons(char letter) {
        List<Person> personList = new ArrayList<>();
        try (Connection connection = connector.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(dataBase);

            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getInt("Id"));
                person.setName(resultSet.getString("u_name"));
                person.setNumber(resultSet.getInt("u_number"));
                if (StringHandler.isContainsMoreThenTwoCh(person.getName(), letter)) {
                    personList.add(person);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personList;
    }
}

