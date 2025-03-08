package linear.problem_solving;

public class SecondMax {
    
    public static int secondMax(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int max = arr[0];
        int second_max = Integer.MIN_VALUE;

        for (int num : arr) {
            if(num > max) {
                second_max = max;
                max = num;
            } else if (num > second_max && num != max) {
                second_max = num;
            }
        }

        if (second_max == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("All elements in the array are the same.");
        }

        return second_max;
    }
}
