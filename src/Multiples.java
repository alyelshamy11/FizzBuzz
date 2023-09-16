public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int result = 0;
        while (i < 1000) {
            i++;
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {
                result++;

            } else if (divisibleBy3) {
                result++;

            } else if (divisibleBy5) {
                result++;
            }
        }
        System.out.println(result);
    }
}
