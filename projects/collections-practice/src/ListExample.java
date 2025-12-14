import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("Spring");
        names.add("Microservices");

        names.forEach(System.out::println);
    }
}
