package linear.problem_solving;

public class RemoveEven {

    public static int[] removeEeven(int[] arr) {

        int length = arr.length;
        int oddCounter = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 != 0) {
                oddCounter++;
            }
        }

        int[] result = new int[oddCounter];
        int result_idx = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 != 0) {
                result[result_idx] = arr[i];
                result_idx++;
            }
        }

        return result;
    }
}
