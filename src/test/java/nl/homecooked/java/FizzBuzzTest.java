package nl.homecooked.java;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FizzBuzzTest
{

    @Test
    public void shouldAnswerWithOne() {
        FizzBuzz Fizzbuzz = new FizzBuzz(1);
        assertTrue(Fizzbuzz.getResult().equals("1"));
    }

    @Test
    public void shouldAnswerWithFizz() {
        FizzBuzz Fizzbuzz = new FizzBuzz(3);
        assertTrue(Fizzbuzz.getResult().equals("Fizz"));
    }

    @Test
    public void shouldAnswerWithBuzz() {
        FizzBuzz Fizzbuzz = new FizzBuzz(5);
        assertTrue((Fizzbuzz.getResult().equals("Buzz")));
    }

    @Test
    public void shouldAnswerWithFizzBuzz() {
        FizzBuzz Fizzbuzz = new FizzBuzz(15);
        assertTrue(Fizzbuzz.getResult().equals("FizzBuzz"));
    }
}
