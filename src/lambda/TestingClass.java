package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestingClass {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, "Chisinau"));
        people.add(new Person("Anna", 40, "Cluj"));
        people.add(new Person("Ion", 30, "Bucuresti"));
        people.add(new Person("Alina", 20, "Iasi"));
        people.add(new Person("Maria", 35, "Chisinau"));
        people.add(new Person("Dan", 30, "Cluj"));

        List<Person> peopleInCHisinau = people.stream().filter(person -> person.getCity().equals("Chisinau")).toList();
        System.out.println(peopleInCHisinau);

        List<Person> sortedListByName = people.stream().sorted(Comparator.comparing(person -> person.getName())).toList();
        System.out.println(sortedListByName);

        List<String> names = people.stream().map(person -> person.getName()).toList();
        System.out.println(names);

        List<String> names2=people.stream().filter(person -> person.getCity().equals("Chisinau"))
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .map(person -> person.getName())
                .toList();

        Map<String, List<Person>> groupedPersons = people.stream().collect(Collectors.groupingBy(person -> person.getCity()));
        System.out.println(groupedPersons);

    }
}
