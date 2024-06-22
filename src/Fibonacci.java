import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static int findSequence(int n) {
        if (n < 2) {
            return n;
        }
        return findSequence(n - 1) + findSequence(n - 2);
    }

    public static int findSequenceMemo(int n){
        Map<Integer, Integer> memo = new HashMap<>(Map.of(0,0, 1,1));
        if(!memo.containsKey(n)){
            memo.put(n, findSequenceMemo(n -1) + findSequenceMemo( n -2));
        }
        return memo.get(n);
    }
}
