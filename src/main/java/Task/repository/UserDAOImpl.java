package Task.repository;

import Task.configuration.Connector;
import Task.model.Person;
import Task.utill.Generator;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class UserDAOImpl {
    private static final String SQL_CREATE_TABLE = "CREATE TABLE people (Id INT PRIMARY KEY AUTO_INCREMENT, u_name VARCHAR(20), u_number INT )";
    private static final String SQL_ADD_PERSON = "insert into people (u_name, u_number) values (?,?)";
    Connector connector = new Connector();

    public void createTable() {
        try (Statement statement = connector.getConnection().createStatement()) {
            statement.executeUpdate(SQL_CREATE_TABLE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPerson(Person person) {
        try (PreparedStatement preparedStatement = connector.getConnection().prepareStatement(SQL_ADD_PERSON)) {
            preparedStatement.setString(1, person.getName());
            preparedStatement.setInt(2, person.getNumber());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPersons() {
        List<Person> list = Generator.generatePersons();
        /*for (Person person: list) {
            addPerson(person);
        }*/
        //list.stream().forEach(person -> addPerson(person)); -> тоже самое что и строка ниже, так же замена цикла строками выше
        list.stream().forEach(this::addPerson);
    }
}
