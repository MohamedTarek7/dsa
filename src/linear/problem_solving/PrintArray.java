package linear.problem_solving;

public class PrintArray {

    public static void printArray(String[] Arr) {
        int length = Arr.length;
        System.out.print("{");
        for (int i = 0; i < length; i++) {
            System.out.print(Arr[i] + (i != (length - 1) ? ", " : ""));
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printArray(int[] Arr) {
        int length = Arr.length;
        System.out.print("{");
        for (int i = 0; i < length; i++) {
            System.out.print(Arr[i] + (i != (length - 1) ? ", " : ""));
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printArray(double[] Arr) {
        int length = Arr.length;
        System.out.print("{");
        for (int i = 0; i < length; i++) {
            System.out.print(Arr[i] + (i != (length - 1) ? ", " : ""));
        }
        System.out.print("}");
        System.out.println();
    }

    public static void printArray(char[] Arr) {
        int length = Arr.length;
        System.out.print("{");
        for (int i = 0; i < length; i++) {
            System.out.print(Arr[i] + (i != (length - 1) ? ", " : ""));
        }
        System.out.print("}");
        System.out.println();
    }
}
