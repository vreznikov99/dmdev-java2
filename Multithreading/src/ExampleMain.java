import java.util.ArrayList;
import java.util.List;

/**
 * Example with Read-only fpr multithreading
 */
public class ExampleMain {
    public static void main(String[] args) {

        Example example = new Example(new ArrayList<>());
        List<Integer> list = example.getList();
        list.add(2);

        System.out.println(example.getList());
    }
}
