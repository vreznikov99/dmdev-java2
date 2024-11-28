import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        String str = "1,Шарф";
        System.out.println(str.split(","));
//        Stream.of(str).map(str -> str.split(","))
//                .map(Collectors.toMap(
//                        arr -> arr[0],
//                        arr -> arr[1]
//                        ));
    }
}
