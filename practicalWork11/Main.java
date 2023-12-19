package practicalWork11;

public class Main {
    public static void insertionSort(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            int swap = array[i];
            for (j = i; j > 0 && swap < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }
            array[j] = swap;
        }
    }

    public static void main(String[] args) {

        Student[] array = {
                new Student("Ivan", 18, 54231, 89),
                new Student("Sergey", 18, 27513, 97),
                new Student("Vladimir", 19, 24415, 78),
                new Student("Marina", 17, 35671, 85),
                new Student("Alena", 19, 43123, 67),
                new Student("Dmitriy", 16, 94325, 79)
        };
        int[] idNumbers = new int[array.length];
        for (int i = 0; i < array.length; i++){
            idNumbers[i] = array[i].getId();
        }
        insertionSort(idNumbers);
        for (var i : idNumbers)
            System.out.println(i);
    }
}
