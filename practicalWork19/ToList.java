package practicalWork19;

import java.util.ArrayList;
import java.util.Collections;

public class ToList<E> {
    private final ArrayList<E> list = new ArrayList<>();
    public ToList(E[] array) {
        Collections.addAll(list, array);
    }

    public ArrayList<E> getList() {
        return list;
    }
}
