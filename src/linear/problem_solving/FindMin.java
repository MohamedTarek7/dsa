package linear.problem_solving;

public class FindMin {
    public static int minValue(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        if (arr.length == 1) {
            return arr[0];
        }

        int min = arr[0];

        for (int num : arr) {
            if(num < min) {
                min = num;
            }
        }

        return min;
    }
}
