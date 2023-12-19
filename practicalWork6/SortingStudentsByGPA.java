package practicalWork6;

public class SortingStudentsByGPA {
    public static void quickSort(Student[] array, int low, int high) {
        if (array.length == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        Student border = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i].getGPA() < border.getGPA()) i++;
            while (array[j].getGPA() > border.getGPA()) j--;
            if (i <= j) {
                Student swap = array[i];
                array[i] = array[j];
                array[j] = swap;
                i++;
                j--;
            }
        }
        if (low < j) quickSort(array, low, j);
        if (high > i) quickSort(array, i, high);
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

        quickSort(array, 0, array.length - 1);
        for (var i : array)
            System.out.println(i);
    }
}
