package mx.abrahamNtd.poc.rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.*;
import static org.junit.Assert.*;

public class MathServiceTest {
    private MathService math = new MathService();

    @Tag("fast")
    @Test
    public void factorial() {
        assertTrue(math.factorial(0) == 1);
        assertTrue(math.factorial(1) == 1);
        assertTrue(math.factorial(5) == 120);
    }

    @Tag("fast")
    @Test
    public void factorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            math.factorial(-1);
        });
    }

    @Ignore
    @Test
    public void todo() {
        assertTrue(math.plus(1, 1) == 2);
    }
}