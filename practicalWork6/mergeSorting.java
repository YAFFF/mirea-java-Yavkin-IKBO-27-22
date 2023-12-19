package practicalWork6;

import java.util.Arrays;

public class mergeSorting {
    public static Student[] mergeSort(Student[] sortArr) {
        Student[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        Student[] buffer2 = new Student[sortArr.length];
        return mergeSortInner(buffer1, buffer2, 0, sortArr.length);
    }

    public static Student[] mergeSortInner(Student[] buffer1, Student[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        Student[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        Student[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        Student[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1].getId() < sorted2[index2].getId()
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static void main(String[] args) {
        Student[] array1 = {
                new Student("Ivan", 18, 54231, 89),
                new Student("Sergey", 18, 27513, 97),
                new Student("Vladimir", 19, 24415, 78)
        };
        Student[] array2 = {
                new Student("Marina", 17, 35671, 85),
                new Student("Alena", 19, 43123, 67),
                new Student("Dmitriy", 16, 94325, 79)
        };
        Student[] array3 = new Student[array1.length + array2.length];
        int j = 0;
        for (Student student : array1) {
            array3[j] = student;
            j++;
        }
        for (Student student : array2) {
            array3[j] = student;
            j++;
        }
        Student[] result = mergeSort(array3);
        for (var i : result)
            System.out.println(i);
    }
}
