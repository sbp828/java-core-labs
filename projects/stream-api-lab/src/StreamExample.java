import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}
// minor improvement 2
// minor improvement 4
// minor improvement 16
// minor improvement 21
// minor improvement 27
// minor improvement 32
// minor improvement 38
// minor improvement 44
// minor improvement 48
// minor improvement 51
// minor improvement 52
// minor improvement 60
// minor improvement 63
// minor improvement 84
// minor improvement 86
// minor improvement 93
// minor improvement 94
// minor improvement 99
