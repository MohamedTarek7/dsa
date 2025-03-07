package linear.problem_solving;

public class SecondMax {
    
    public static int secondMax(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        if (arr.length == 1) {
            return arr[0];
        }

        int max = arr[0];
        for (int num : arr) {
            if(num > max) {
                max = num;
            }
        }

        int second_max = 0;
        for (int num : arr) {
            if (num > second_max && num < max) {
                second_max = num;
            }
        }

        return second_max;
    }
}
