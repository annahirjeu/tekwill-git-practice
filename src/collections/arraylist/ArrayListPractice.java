package collections.arraylist;

import test.Person;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        String name = new String("Maria");
        String name2 = "Alex";
        listOfStrings.add("Ion");
        listOfStrings.add(name);
        listOfStrings.add(name2);
        listOfStrings.add("Ion");

        listOfStrings.add(2, "Serghei");

        System.out.println("Before delete");
        for (String element : listOfStrings) {
            System.out.println(element);
        }
        List<String> elementsToRemove = new ArrayList<>();
        elementsToRemove.add("Ion");
        listOfStrings.removeAll(elementsToRemove);

        System.out.println("After delete");
        for (String element : listOfStrings) {
            System.out.println(element);
        }
        System.out.println("With enhanced for");
        for (String element : listOfStrings) {
            element = element.concat(" Bors");
            System.out.println(element);
        }

        System.out.println("With classic for");
        for (int i = 0; i < listOfStrings.size(); i++) {
            System.out.println(listOfStrings.get(i));
        }

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("M", 25));
        persons.add(new Person("F", 35));
        persons.add(new Person("M", 23));
        persons.add(new Person("F", 24));
        persons.add(new Person("M", 15));
        System.out.println("\n Before changes \n");

        for (Person p : persons) {
            System.out.println(p);
        }
        for (Person person : persons) {
            person.setAge(person.getAge() + 1);
        }
        System.out.println("\n After changes");
        for (Person p : persons) {
            System.out.println(p);
        }
        Person person = persons.get(0);
        person.setGender("F");
        System.out.println("\n After changes for index 0");


        persons.remove(person);
        System.out.println("\n After remove Object");

        for (Person p : persons) {
            System.out.println(p);
        }

        persons.remove(0);
        System.out.println("\n After remove by index");

        for (Person p : persons) {
            System.out.println(p);
        }

        persons.remove(0);
        System.out.println("\n After remove by index");

        for (Person p : persons) {
            System.out.println(p);
        }

    }
}
