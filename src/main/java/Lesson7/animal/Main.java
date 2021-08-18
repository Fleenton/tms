package Lesson7.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бакстер", "корм Pedigree", "Двор", "лабрадор");
        Cat cat = new Cat("Феликс", "корм Whiskas", "Дом", "Серый");
        Horse horse = new Horse("Брут", "Сено", "Загон", 100);

        Animal [] animals = {dog, cat, horse};
        receptionVet(animals);
    }

    public static void receptionVet(Animal [] animals){
        Vet vet = new Vet();
        System.out.println("Животные пришедшие на прием к ветеренару:");
        for (Animal animal : animals){
            vet.treatAnimal(animal);
        }
    }
}
