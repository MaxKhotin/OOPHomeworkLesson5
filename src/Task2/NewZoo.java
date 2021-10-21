package Task2;
//Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
import java.util.ArrayList;

public class NewZoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Monkey");
        animals.add("Elephant");
        animals.add("Horse");
        animals.add("Rhino");
        animals.add("Seal");
        animals.add("Camel");
        animals.add("Tiger");
        animals.add("Lion");
        System.out.println("Old zoo size: "+animals.size());
        System.out.println("Old zoo: "+ animals.toString());
        animals.remove(6);
        animals.remove(4);
        animals.remove(2);
        System.out.println("New zoo size: "+ animals.size());
        System.out.println("New zoo: " + animals.toString());


    }
}
