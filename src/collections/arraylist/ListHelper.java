package collections.arraylist;

import test.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListHelper {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Avocado");
        fruits.add("Peach");
        fruits.add("Cherry");
        fruits.add("Apple");

        Collections.addAll(fruits, "Pear", "Orange", "Banana");

/*        ArrayList<String> fruitsCopy = new ArrayList<>();
        fruitsCopy.add("aa");
        fruitsCopy.add("aa");
        fruitsCopy.add("aa");
        fruitsCopy.add("aa");
        fruitsCopy.add("aa");
        fruitsCopy.add("aa");
        fruitsCopy.add("aa");
        fruitsCopy.add("aa");
        Collections.copy(fruitsCopy, fruits);*/
        System.out.println(fruits);

//        Collections.reverse(fruits);
//        Collections.shuffle(fruits);
/*        Collections.sort(fruits);
        System.out.println(fruits);*/


        List<Person> persons = new ArrayList<>();
        Person person = new Person("M", 25);
        persons.add(person);
        persons.add(new Person("F", 35));
        persons.add(new Person("M", 23));
        persons.add(new Person("F", 24));
        persons.add(new Person("M", 15));
        /*System.out.println(persons);
        Collections.sort(persons);*/

//        Collections.min(persons);
        Person person1 = new Person("N", 50);
        System.out.println(persons);
//        Collections.replaceAll(fruits, "Apple", "Kiwi");

        Collections.replaceAll(persons, person, person1);
        System.out.println(persons);
//        System.out.println(fruits);



    }
}
