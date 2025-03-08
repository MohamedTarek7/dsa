package linear;

public class MoveZero {

    public static int[] moveZero(int[] arr) {

        int length = arr.length;
        int j = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] != 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }
}
