package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<Integer> sourceList = List.of(1,2,3,4,5,6,7,8);
        List<Integer> list = new ArrayList<>(sourceList);

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            if(next == 5 || next == 6){
                iterator.remove();
            }
        }

        System.out.println(list);


    }
}
