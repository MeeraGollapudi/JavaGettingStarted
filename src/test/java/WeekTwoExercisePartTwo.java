import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Implement each of the tests below in order within the src/main/java/FizzBuzz class
 * Make a Git commit after implementing each test. Add only the minimum amount of code required
 * for each test case to make that test pass. This may innclude just putting in a literal value...
 * do not add any additional code.
 *
 * Hint:  If you complete implementing a test and the next test passes w/o any changes to FizzBuzz.java,
 *        you did too much and should start over from the previous test.
*/

public class WeekTwoExercisePartTwo {
    @Test
    // TODO Comment: replace this comment with a brief description of why you made the change you did in FizzBuzz.java
    public void sendingOneShouldReturnStringOne(){
        FizzBuzz fb = new FizzBuzz();
        String expected = "1";

        String actual = fb.execute(1);

        assertEquals(expected, actual);
    }

    @Test
    // TODO Comment: replace this comment with a brief description of why you made the change you did in FizzBuzz.java
    public void sendingTwoShouldReturnStringTwo(){
        FizzBuzz fb = new FizzBuzz();
        String expected = "2";

        String actual = fb.execute(2);

        assertEquals(expected, actual);
    }

    @Test
    // TODO Comment: replace this comment with a brief description of why you made the change you did in FizzBuzz.java
    public void sendingThreeShouldReturnStringFizz() {
        FizzBuzz fb = new FizzBuzz();
        String expected = "Fizz";

        String actual = fb.execute(3);

        assertEquals(expected, actual);
    }

    @Test
    // TODO Comment: replace this comment with a brief description of why you made the change you did in FizzBuzz.java
    public void sendingAnyMultipleOfThreeShouldReturnStringFizz() {
        FizzBuzz fb = new FizzBuzz();
        String expected = "Fizz";

        String actual = fb.execute(9);

        assertEquals(expected, actual);
    }

    @Test
    // TODO Comment: replace this comment with a brief description of why you made the change you did in FizzBuzz.java
    public void sendingAnyMultipleOfFiveOfThreeShouldReturnStringBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String expected = "Buzz";

        String actual = fb.execute(25);

        assertEquals(expected, actual);
    }

    @Test
    // TODO Comment: replace this comment with a brief description of why you made the change you did in FizzBuzz.java
    public void sendingAnyMultipleOfThreeAndFiveOfThreeShouldReturnStringFizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String expected = "FizzBuzz";

        String actual = fb.execute(45);

        assertEquals(expected, actual);
    }
}