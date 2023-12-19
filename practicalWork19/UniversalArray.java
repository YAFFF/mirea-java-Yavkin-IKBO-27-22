package practicalWork19;

public class UniversalArray<E> {
    private final E[] array;

    public UniversalArray(E[] array) {
        this.array = array;
    }

    public E get(int i){
        return array[i];
    }

    public E[] getArray() {
        return array;
    }
}
