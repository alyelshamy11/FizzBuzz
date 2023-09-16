public class Multiples {
    public static int main(Integer n, Integer a, Integer b) {
        int i = 0;
        int result = 0;
        while (i < n) {
            i++;
            // Find out which numbers divide i.
            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;

            // Print our appropriate result.
            if (divisibleBya && divisibleByb) {
                result++;

            } else if (divisibleBya) {
                result++;

            } else if (divisibleByb) {
                result++;
            }
        }
        return result;
    }
}
