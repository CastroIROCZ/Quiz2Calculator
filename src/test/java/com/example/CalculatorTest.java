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
  public void testSubtract1() {
    int expected = -10;
    int actual = calculator.subtract(0, 10);
    assertEquals(expected, actual);
  }

  @Test
  public void testSubtract2() {
    int expected = 2;
    int actual = calculator.subtract(5, 3);
    assertEquals(expected, actual);
  }

  @Test
  public void testmultiply() {
    int expected = -1;
    int actual = calculator.multiply(1, -1);
    assertEquals(expected, actual);
  }

  @Test
  public void testmultiply2() {
    int expected = 0;
    int actual = calculator.multiply(100,0);
    assertEquals(expected, actual);
  }

  @Test
  public void testdivide1() {
    int expected = 1;
    int actual = calculator.divide(100,100);
    assertEquals(expected, actual);
  }

  @Test
  public void testdivide2() {
    int expected = 0;
    int actual = calculator.divide(0, 2000);
    assertEquals(expected, actual);
  }

  @Test
  public void testdivide3() {
    assertThrows(ArithmeticException.class, () -> calculator.divide(10,0));
  }

  @Test
  public void testisEven1() {
    boolean expected = true;
    boolean actual = calculator.isEven(4);
    assertEquals(expected, actual);
  }
  
}
