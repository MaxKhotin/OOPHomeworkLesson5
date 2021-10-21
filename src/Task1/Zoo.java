package Task1;

import java.util.ArrayList;
//Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index, element).
//        Вывести список в консоль.

public class Zoo {
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
        System.out.println(animals.toString());
    }
}
