package proyectoJava.proyecto1.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    public Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        // assertEquals: Asserts that two values are equal.
        assertEquals(5, calculator.add(2, 3), "Addition should be correct.");
    }

    @Test
    void testIsPositive() {
        // assertTrue: Asserts that a condition is true.
        assertTrue(calculator.isPositive(10), "10 should be positive.");
    }

    @Test
    void testIsNotPositive() {
        // assertFalse: Asserts that a condition is false.
        assertFalse(calculator.isPositive(-5), "-5 should not be positive.");
    }

    @Test
    void testGetGreeting() {
        // assertNotNull: Asserts that an object is not null.
        assertNotNull(calculator.getGreeting(), "Greeting should not be null.");

        // assertNull: Asserts that an object is null. (Example of what not to do here)
        // assertNull(calculator.getGreeting(), "Greeting should be null."); // This would fail
    }

    @Test
    void testGetNumbers() {
        // assertArrayEquals: Asserts that two arrays are equal.
        int[] expectedArray = {1, 2, 3};
        assertArrayEquals(expectedArray, calculator.getNumbers(), "Arrays should be equal.");
    }

    @Test
    void testSameObject() {
        // assertSame: Asserts that two object references point to the same object.
        String str1 = new String("test");
        String str2 = str1;
        assertSame(str1, str2, "References should be to the same object.");

        // assertNotSame: Asserts that two object references do not point to the same object.
        String str3 = new String("test");
        assertNotSame(str1, str3, "References should be to different objects.");
    }
}