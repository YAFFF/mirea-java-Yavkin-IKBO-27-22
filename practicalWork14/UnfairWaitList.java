package practicalWork14;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {}

    public void remove(E element) {
        if (content.toArray()[0] != element)
            content.remove(element);
    }

    public void moveToBack(E element){
        content.remove(element);
        content.add(element);
    }
}
