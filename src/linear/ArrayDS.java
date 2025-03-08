package linear;

import linear.problem_solving.PrintArray;

public class ArrayDS {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 4, 12 };
        PrintArray.printArray(MoveZero.moveZero(nums));
    }
}
