import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        
        // toString - строковое представление массива
        System.out.println(Arrays.toString(arr)); // [5, 3, 1, 4, 2]
        
        // sort - сортировка массива
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
        
        // binarySearch - поиск в отсортированном массиве
        int index = Arrays.binarySearch(arr, 3);
        System.out.println(index); // 2 (индекс элемента 3)
        
        // equals - сравнение массивов
        int[] arr2 = {1, 2, 3, 4, 5};
        boolean isEqual = Arrays.equals(arr, arr2);
        System.out.println(isEqual); // true
        
        // compare - лексикографическое сравнение
        int result = Arrays.compare(arr, arr2);
        System.out.println(result); // 0 (массивы равны)
    }
}