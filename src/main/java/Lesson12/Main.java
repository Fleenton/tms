package Lesson12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Denis", 24, Sex.MALE),
                new Person("Anna", 21, Sex.FEMALE),
                new Person("Jany", 29, Sex.FEMALE),
                new Person("Nick", 20, Sex.MALE),
                new Person("Tom", 38, Sex.MALE),
                new Person("Mary", 30, Sex.FEMALE));

        //people.stream().filter(person -> person.getSex().equals(Sex.MALE)).forEach(System.out::println);

        List<Person> woman = people.stream().filter(person -> person.getSex().equals(Sex.FEMALE)).collect(Collectors.toList());
        //woman.forEach(System.out::println);

        List<Person> oldMan = people.stream().sorted(new ComparatorByAge()).collect(Collectors.toList());

        people.stream().filter(person -> person.getAge() > 35).forEach(System.out::println);

        long count = people.stream().filter(person -> person.getName().length()>5).count();
        System.out.println(count);

        Map <String, Integer> mapPeople = people.stream().collect(Collectors.toMap(Person::getName, Person::getAge));

        List<String> nameAndAge = people.stream().map(p -> p.getName() + ":" + p.getAge()).collect(Collectors.toList());
        nameAndAge.forEach(System.out::println);

        int ageSum = people.stream().map(Person::getAge).reduce(0,(a,b) -> a+b);
        System.out.println(ageSum);

        people.stream().filter(person -> person.getName().contains("a")||person.getName().contains("i")).forEach(System.out::println);
    }
}
