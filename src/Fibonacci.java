import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Fibonacci {
    private static final Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));
    private int last = 0;
    private int next = 1;

    public static int findSequence(int n) {
        if (n < 2) {
            return n;
        }
        System.out.printf("called %d \n", n);
        return findSequence(n - 1) + findSequence(n - 2);
    }

    public static int findSequenceMemo(int n) {
        if (!memo.containsKey(n)) {
            System.out.printf("key added %d \n", n);
            memo.put(n, findSequenceMemo(n - 1) + findSequenceMemo(n - 2));
        }
        return memo.get(n);
    }

    public static int findSequenceIterative(int n) {
        int previous = 0;
        int current = 1;
        for (int i = 1; i < n; i++) {
            int temp = previous;
            previous = current;
            current = temp + current;
            System.out.printf("previous: %d = current: %d \n", previous, current);
        }
        return current;
    }

    public static int findSequenceStream(int n) {
        Fibonacci fib = new Fibonacci();
        final var result = fib.stream().limit(n + 1).max();
        return result.isPresent() ? result.getAsInt() : 0;
    }

    public IntStream stream() {
        return IntStream.generate(() -> {
            int temp = last;
            last = next;
            next = temp + next;
            System.out.println("generated: " + temp);
            return temp;
        });
    }
}
