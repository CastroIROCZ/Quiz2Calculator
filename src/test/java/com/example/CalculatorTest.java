package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

  Calculator calculator = new Calculator();

  @Test 
  public void testSum() {
    int expected = -1;
    int actual = calculator.sum(-3, 2);
    assertEquals(expected, actual);
  }

  @Test
  public void testSubtraction() {
    int expected = 2;
    int actual = 1;
    assertEquals(expected, actual);
  }

}
