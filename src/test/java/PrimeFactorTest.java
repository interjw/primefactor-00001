import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {

    @Test
    void factor() {
        PrimeFactor pf = new PrimeFactor();
        assertEquals(1,1);
    }

    @Test
    void testPrimefactorOf1() {
        PrimeFactor primefactor = new PrimeFactor();
        assertEquals(Arrays.asList(),primefactor.of(1));
    }
}