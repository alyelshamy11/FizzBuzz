public class Reduce {
    public static void main(String[] args) {
        Reducer(25);
    }

    public static int Reducer(int n) {
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n--;
            }
        }
        System.out.println(n);
        return n;
    }
}
