package Task3;

import java.util.ArrayList;
import java.util.ListIterator;

//Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить
//        значения на 1;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 11; i++) {
            numbers.add(i);
        }
        System.out.println("Old list: "+numbers.toString());
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            int element = listIterator.next();
            listIterator.set(element+1);
        }
        System.out.println("New list: "+numbers.toString());


    }
}
