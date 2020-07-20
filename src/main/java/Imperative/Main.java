package Imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Jhon",Gender.MALE),
            new Person("Dadan",Gender.MALE),
            new Person("Tarkiman",Gender.MALE),
            new Person("Yona",Gender.FEMALE)
        );

        //Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }
        //End Imperative approach

        //Declarative approach
        System.out.println("Declarative approuch");
        people.stream().filter(person -> Gender.MALE.equals(person.gender)).collect(Collectors.toList())
                .forEach(System.out::println);
        //OR
        System.out.println("Declarative approuch 2");
        List<Person> females2 = people.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
