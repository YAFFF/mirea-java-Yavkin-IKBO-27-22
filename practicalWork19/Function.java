package practicalWork19;

import java.util.ArrayList;
import java.util.Collections;

public class Function<E> {
    public  void function(E[] array, ArrayList<E> list){
        Collections.addAll(list, array);
        if (list.size() >= 5){
            for (int i = 0; i < 5; i++)
                System.out.println(list.get(i));
        } else {
            for (var i : list)
                System.out.println(i);
        }
    }
}
