package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OopsTest {

  //test for 45
  @Test
  void testValidInput() {
    String input = "45\n";
    System.setIn(new ByteArrayInputStream(input.getBytes()));

    Oops oops = new Oops();

    int result = oops.getInput(
        0,
        100,
        "Please enter a value",
        "Your value is invalid"
    );

    assertEquals(45, result);
  }

  //test for 
  @Test
  void testInvalidInput() {
    String input = "500\n45\n";
    System.setIn(new ByteArrayInputStream(input.getBytes()));

    Oops oops = new Oops();

    int result = oops.getInput(
        0,
        100,
        "Please enter a value",
        "Your value is invalid"
    );

    assertEquals(45, result);
  }

  @Test
  void testLowerBoundary() {
    String input = "0\n";
    System.setIn(new ByteArrayInputStream(input.getBytes()));

    Oops oops = new Oops();

    int result = oops.getInput(
        0,
        100,
        "Please enter a value",
        "Your value is invalid"
    );

    assertEquals(0, result);
  }

  @Test
  void testUpperBoundary() {
    String input = "100\n";
    System.setIn(new ByteArrayInputStream(input.getBytes()));

    Oops oops = new Oops();

    int result = oops.getInput(
        0,
        100,
        "Please enter a value",
        "Your value is invalid"
    );

    assertEquals(100, result);
  }
}