package demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void sum() {
        // given
        final var random = new Random();
        var a = random.nextInt();
        var b = random.nextInt();
        var c = new Calculator();

        // when
        var r = c.sum(a, b);

        // then
        assertEquals(a + b, r);
    }
}
