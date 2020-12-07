import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int start) {
        int index = start; 
        int smallest = array[index]; 
        for (int i = start; i < array.length; i++) { 
            if (array[i] < smallest) { 
                smallest = array[i]; 
                index = i; 
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int number = array[index1];
        array[index1] = array[index2];
        array[index2] = number;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}
