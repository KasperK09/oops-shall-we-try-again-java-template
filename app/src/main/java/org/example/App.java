package org.example;

public class App {

  public static void main(String[] args) {

    Oops oops = new Oops();

    int value = oops.getInput(
        0,
        100,
        "Please enter a value",
        "Your value is invalid"
    );

    System.out.println("The value chosen by the user is " + value);
  }
}

/*Please enter a value
500
 
Your value is invalid
Please enter a value
-100
 
Your value is invalid
Please enter a value
45
 
The value chosen by the user is 45 */
