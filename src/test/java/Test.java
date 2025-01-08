import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        // Số dương
        assertEquals(5, calculator.add(2, 3));
        // Số âm
        assertEquals(-1, calculator.add(-2, 1));
        // Số 0
        assertEquals(0, calculator.add(0, 0));
        // Giá trị biên
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE + 1, calculator.add(Integer.MIN_VALUE, 1));
    }

    @Test
    void testSubtract() {
        // Số dương
        assertEquals(1, calculator.subtract(3, 2));
        // Số âm
        assertEquals(-3, calculator.subtract(-2, 1));
        // Số 0
        assertEquals(0, calculator.subtract(0, 0));
        // Giá trị biên
        assertEquals(Integer.MAX_VALUE, calculator.subtract(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, calculator.subtract(Integer.MIN_VALUE, 0));
    }

    @Test
    void testMultiply() {
        // Số dương
        assertEquals(6, calculator.multiply(2, 3));
        // Số 0
        assertEquals(0, calculator.multiply(0, 5));
        // Số âm
        assertEquals(-6, calculator.multiply(-2, 3));
        // Giá trị biên
        assertEquals(0, calculator.multiply(Integer.MAX_VALUE, 0));
        assertThrows(ArithmeticException.class, () -> calculator.multiply(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void testDivide() {
        // Số dương
        assertEquals(2, calculator.divide(6, 3));
        // Số âm
        assertEquals(-2, calculator.divide(4, -2));
        // Số 0 (trừ chia cho 0)
        assertEquals(0, calculator.divide(0, 5));
        // Ngoại lệ: chia cho 0
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
        // Giá trị biên
        assertEquals(1, calculator.divide(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE, calculator.divide(Integer.MIN_VALUE, 1));
    }
}
