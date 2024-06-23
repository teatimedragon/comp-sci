import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    final static int FIBONACCI_INDEX = 6;
    final static int FIBONACCI_EXPECTED_VALUE = 8;

    @Test
    public void findSequence() {
        final var test = Fibonacci.findSequence(FIBONACCI_INDEX);
        assertEquals(FIBONACCI_EXPECTED_VALUE, test);
    }

    @Test
    public void findSequenceMemo() {
        final var test = Fibonacci.findSequenceMemo(FIBONACCI_INDEX);
        assertEquals(FIBONACCI_EXPECTED_VALUE, test);
    }

    @Test
    public void findSequenceIterative() {
        final var test = Fibonacci.findSequenceIterative(FIBONACCI_INDEX);
        assertEquals(FIBONACCI_EXPECTED_VALUE, test);
    }

    @Test
    public void findSequenceStream() {
        final var test = Fibonacci.findSequenceStream(FIBONACCI_INDEX);
        assertEquals(FIBONACCI_EXPECTED_VALUE, test);
    }
}