import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest
{
    FizzBuzz fizzBuzz;

    @Before
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testThree(){
        // Given
        String expected = "Fizz";

        //When
        String actual = fizzBuzz.fizzBuzzChecker(3);

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testFive(){
        // Given - setup

        String actual = fizzBuzz.fizzBuzzChecker(5);

        String expected = "Buzz";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThreeFive() {
        // Given - setup

        String actual = fizzBuzz.fizzBuzzChecker(15);

        String expected = "FizzBuzz";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNeither() {
        // Given - setup

        String actual = fizzBuzz.fizzBuzzChecker(2);

        String expected = "2";
        Assert.assertEquals(expected, actual);
    }


}
