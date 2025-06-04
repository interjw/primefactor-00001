import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {

    static PrimeFactor primefactor;

    @BeforeAll
    static void setUp() throws Exception{
        primefactor = new PrimeFactor();
    }

    @Test
    void factor() {
       assertEquals(1,1);
    }

    @Test
    void testPrimefactorOf1() {
       assertEquals(Arrays.asList(),primefactor.of(1));
    }

    @Test
    void testPrimefactorOf2() {
       assertEquals(Arrays.asList(2),primefactor.of(2));
    }

    @Test
    void testPrimefactorOf3() {
        assertEquals(Arrays.asList(3),primefactor.of(3));
    }
}