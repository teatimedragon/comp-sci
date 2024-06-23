import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void findSequence() {
        final var test = Fibonacci.findSequence(6);
        assertEquals(8, test);
    }

    @Test
    public void findSequenceMemo() {
        final var test = Fibonacci.findSequenceMemo(6);
        assertEquals(8, test);
    }

    @Test
    public void findSequenceIterative() {
        final var test = Fibonacci.findSequenceIterative(6);
        assertEquals(8, test);
    }
}