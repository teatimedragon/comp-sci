import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void findSequence() {
        final var test = Fibonacci.findSequence(4);
        assertEquals(3, test);
    }

    @Test
    public void findSequenceMemo() {
        final var test = Fibonacci.findSequenceMemo(8);
        assertEquals(21, test);
    }
}