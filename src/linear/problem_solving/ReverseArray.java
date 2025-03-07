package linear.problem_solving;

public class ReverseArray {
    public static int[] reverse_new(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return arr;
        }
        
        int length = arr.length;
        int[] result = new int[length];
        int result_idx = 0;

        for (int i = length - 1; i >= 0; i--) {
            result[result_idx] = arr[i];
            result_idx++;
        }

        return result;
    }

    public static int[] reverse_current(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int length = arr.length;
        int temp = 0;

        for (int i = 0; i < length / 2 ; i++) {
            temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;    
        }

        return arr;
    }

}
