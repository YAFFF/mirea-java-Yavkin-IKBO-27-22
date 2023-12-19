package practicalWork14;

public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        try {
            if (content.size() + 1 <= capacity)
                super.add(element);
            else
                throw new StackOverflowError();
        } catch (StackOverflowError e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
