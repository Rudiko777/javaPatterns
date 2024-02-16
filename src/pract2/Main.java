package pract2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Human> humanComparator = (Human obj1, Human obj2) -> obj1.getAge() - obj2.getAge();
        Human man = new Human(19, "Rudolf", "Chakryan", LocalDate.of(2004, 10, 12), 75);
        Human women = new Human(18, "Evgen", "Ivanova", LocalDate.of(2004, 7, 1), 53);
        Human daughter = new Human(10, "Olesa", "Lichka", LocalDate.of(2009, 9, 10), 80);
        Human brother = new Human(13, "Kayle", "O'Nucks", LocalDate.of(2007, 1, 2), 72);


        List<Human> listOfHumans = new ArrayList<>();
        listOfHumans.add(man);
        listOfHumans.add(women);
        listOfHumans.add(daughter);
        listOfHumans.add(brother);

        Stream<Human> stream = listOfHumans.stream();
        String concatenatedNames = stream.sorted(humanComparator)
                .filter(human -> human.getAge() < 20)
                .filter(human -> human.getName().contains("e"))
                .map(human -> human.getName().charAt(0))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(concatenatedNames);
//        List<Human> sortedByAge = stream.sorted(humanComparator).toList();
//        System.out.println(sortedByAge);
    }
}
