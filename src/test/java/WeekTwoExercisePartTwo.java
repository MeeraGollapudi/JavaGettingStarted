import org.junit.jupiter.api.Disabled;
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
    // TODO: remove @Disabled attribute, make the test run green, and then move on to the next test
    // TODO: remember to refactor after you have a green test (never refactor when you have a failing test)

    // TODO Response: Why would you never refactor if you had a failing test?

    @Test
    //@Disabled
    public void sendingOneShouldReturnStringOne(){
        // In our assertEquals statement, the expected is a String object, hence the actual has to be a string object returned by FizzBuzz.execute method.
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test
        FizzBuzz fb = new FizzBuzz();
        String expected = "1";

        String actual = fb.execute(1);

        assertEquals(expected, actual);
    }

    @Test
    //@Disabled
    public void sendingTwoShouldReturnStringTwo(){
        // In our assertEquals statement, the expected is a String object, hence the actual has to be a string object returned by FizzBuzz.execute method.
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "2";

        String actual = fb.execute(2);

        assertEquals(expected, actual);
    }

    @Test
    //@Disabled
    public void sendingThreeShouldReturnStringFizz() {
        // In our assertEquals statement, the expected is a String object "Fizz", if the number is 3.
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "Fizz";

        String actual = fb.execute(3);

        assertEquals(expected, actual);
    }

    @Test
    //@Disabled
    public void sendingAnyMultipleOfThreeShouldReturnStringFizz() {
        // In our assertEquals statement, the expected is a String object "Fizz", if the number is 9.
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "Fizz";

        String actual = fb.execute(9);

        assertEquals(expected, actual);
    }

    @Test
    //@Disabled
    public void sendingAnyMultipleOfFiveOfThreeShouldReturnStringBuzz() {
        // In our assertEquals statement, the expected is a String object "Buzz", if the number is 25.
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "Buzz";

        String actual = fb.execute(25);

        assertEquals(expected, actual);
    }

    @Test
    //@Disabled
    public void sendingAnyMultipleOfThreeAndFiveOfThreeShouldReturnStringFizzBuzz() {
        // In our assertEquals statement, the expected is a String object "FizzBuzz", if the number is 45.
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test

        FizzBuzz fb = new FizzBuzz();
        String expected = "FizzBuzz";

        String actual = fb.execute(45);

        assertEquals(expected, actual);
    }
}
