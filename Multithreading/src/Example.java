import java.util.ArrayList;
import java.util.List;


/**
 * Example with Read-only fpr multithreading
 */
public class Example {
    private List<Integer> list;

    public Example(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
//        return list; // allows to change the object that was got
        return new ArrayList<>(list);
    }
}
