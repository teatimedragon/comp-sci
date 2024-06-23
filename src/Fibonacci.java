import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    static  Map<Integer, Integer> memo = new HashMap<>(Map.of(0,0, 1,1));
    public static int findSequence(int n) {
        if (n < 2) {
            return n;
        }
        System.out.printf("called %d \n", n);
        return findSequence(n - 1) + findSequence(n - 2);
    }

    public static int findSequenceMemo(int n){
        if(!memo.containsKey(n)){
            System.out.printf("key added %d \n", n);
            memo.put(n, findSequenceMemo(n -1) + findSequenceMemo( n -2));
        }
        return memo.get(n);
    }

    public static int findSequenceIterative(int n){
        int start = 0;
        int current = 1;
        for (int i = 1; i < n; i++){
            int temp = start;
            start = current;
            current = temp + current;
            System.out.printf("start: %d = current: %d \n", start, current);
        }
        return current;
    }
}
