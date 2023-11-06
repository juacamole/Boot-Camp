package org.example.JizzBuzzTest;

import org.example.JizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {

@Test
    void fizzbuzzTest_when1_thenReturn1(){

    //given
    int number = 1;

    //when
    int actual = FizzBuzz.fizzbuzz(String.valueOf(number));

    //then

    assertEquals(1, actual);

}


}