package com.olbati.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_input_if_input_is_not_divisible_by_3_and_5() {
        assertThat(fizzBuzz.processNew(1)).isEqualTo("1");
        assertThat(fizzBuzz.processNew(2)).isEqualTo("2");
        assertThat(fizzBuzz.processNew(4)).isEqualTo("4");
    }

    @Test
    public void should_return_fizz_if_input_is_divisible_by_3() {
        assertThat(fizzBuzz.processNew(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.processNew(6)).isEqualTo("Fizz");
        assertThat(fizzBuzz.processNew(9)).isEqualTo("Fizz");
        assertThat(fizzBuzz.processNew(21)).isEqualTo("FizzFazz");
    }

    @Test
    public void should_return_buzz_if_input_is_divisible_by_5() {
        assertThat(fizzBuzz.processNew(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.processNew(10)).isEqualTo("Buzz");
        assertThat(fizzBuzz.processNew(20)).isEqualTo("Buzz");
        assertThat(fizzBuzz.processNew(25)).isEqualTo("Buzz");
        assertThat(fizzBuzz.processNew(21)).isEqualTo("FizzFazz");
        assertThat(fizzBuzz.processNew(105)).isEqualTo("FizzBuzzFazz");
    }

    @Test
    public void should_return_fizzbuzz_if_input_is_divisible_by_3_and_5() {
        assertThat(fizzBuzz.processNew(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.processNew(30)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.processNew(45)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.processNew(60)).isEqualTo("FizzBuzz");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_input_is_lower_than_1() {
        fizzBuzz.process(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_input_is_greater_than_100() {
        fizzBuzz.process(101);
    }
}
