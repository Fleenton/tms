package Lesson7.animal;

public class Vet {
    public void treatAnimal(Animal animal){
        StringBuilder builder = new StringBuilder();
        builder.append(animal).append(" по кличке ").append(animal.name).append("\n").
                append("Питается: ").append(animal.food).append("\n").
                append("Находится: ").append(animal.location).append("\n");
        System.out.println(builder);
    }
}
