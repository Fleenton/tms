package Task.utill;

import Task.constant.Alphabet;
import Task.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private static final int NAME_LENGTH = 8;
    private static final int NUMBER_MIN = 10;
    private static final int NUMBER_MAX = 1000;
    private static final int SIZE_PERSONS = 100;

    public static String generatorName() {
        Random random = new Random();
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < NAME_LENGTH; i++) {
            int randomNumber = random.nextInt(Alphabet.ENGLISHALPHABET.getValue().length());
            char letter = Alphabet.ENGLISHALPHABET.getValue().charAt(randomNumber);
            name.append(letter);
        }
        return name.toString();
    }

    public static int generatorNumber() {
        Random random = new Random();
        return random.nextInt((NUMBER_MAX - NUMBER_MIN) + NUMBER_MIN);
    }

    public static List<Person> generatePersons() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < SIZE_PERSONS; i++) {
            Person person = new Person(generatorName(), generatorNumber());
            personList.add(person);
        }
        return personList;
    }
}
