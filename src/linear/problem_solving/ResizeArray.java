package linear.problem_solving;

public class ResizeArray {
    public static int[] resize(int[] arr, int capacity) {

        if (arr.length == capacity || capacity < 1) {
            throw new IllegalArgumentException("Invalid resize: New size must be different and at least 1.");
        }

        int[] temp_arr = new int[capacity];
        int length = capacity < arr.length ? capacity : arr.length;

        for (int i = 0; i < length; i++) {
            temp_arr[i] = arr[i];
        }
        return temp_arr;
    }
}
