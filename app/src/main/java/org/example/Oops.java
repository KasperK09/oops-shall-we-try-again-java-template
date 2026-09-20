package org.example;

import java.util.Scanner;

public class Oops {

  public int getInput(int lowerBound, int upperBound, String prompt, String errorMessage) {

    Scanner scanner = new Scanner(System.in);

    System.out.println(prompt);
    int value = scanner.nextInt();

    while (value < lowerBound || value > upperBound) {
      System.out.println(errorMessage);
      System.out.println(prompt);
      value = scanner.nextInt();
    }

    scanner .close();

    return value;
  }
}