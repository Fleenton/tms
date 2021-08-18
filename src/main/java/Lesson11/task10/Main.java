package Lesson11.task10;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Вася");
        Dog dog = new Dog("Арчи");
        Parrot parrot = new Parrot("Гриша");
        Pet pet = new Pet();
        HashMap<String, Pet> animals = new HashMap<>();
        animals.put(cat.getNamePet(), pet);
        animals.put(dog.getNamePet(), pet);
        animals.put(parrot.getNamePet(), pet);

        printKeyAnimals(animals);
    }

    public static void printKeyAnimals (HashMap<String, Pet> animals){
        for (Map.Entry<String, Pet> petEntry: animals.entrySet()) {
            System.out.println(petEntry.getKey());
        }
    }
}
