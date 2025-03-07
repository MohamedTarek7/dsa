public class App {
    public static void main(String[] args) throws Exception {
        
    }

    public static int sum_1(int n) {
        return n * (n + 1) / 2;
    }

    public static int sum_2(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
