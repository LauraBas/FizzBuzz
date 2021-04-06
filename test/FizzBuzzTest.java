import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void shouldReturnFizzBuzzIfMultiple5And3() {
        FizzBuzz f = new FizzBuzz();
        Assertions.assertEquals("FizzBuzz", f.fizzbuzz(15));
        Assertions.assertEquals("FizzBuzz", f.fizzbuzz(30));

    }

    @Test
    void shouldReturnFizzIfMultiple3() {
        FizzBuzz f = new FizzBuzz();
        Assertions.assertEquals("Fizz", f.fizzbuzz(9));
        Assertions.assertEquals("Fizz", f.fizzbuzz(18));

    }

    @Test
    void shouldReturnBuzzIfMultiple5() {
        FizzBuzz f = new FizzBuzz();
        Assertions.assertEquals("Buzz", f.fizzbuzz(55));
        Assertions.assertEquals("Buzz", f.fizzbuzz(10));

    }

    @Test
    void shouldReturnNumberToStringIfNotMultipleOf3AndOr5() {
        FizzBuzz f = new FizzBuzz();
        Assertions.assertEquals("7", f.fizzbuzz(7));
        Assertions.assertEquals("8", f.fizzbuzz(8));    }
    }

}