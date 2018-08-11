package com.shireesha.orderprocessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter no. of items: ");
    int input = scanner.nextInt();
    List<String> inputList = new ArrayList<>();
    while (input > 0) {
      inputList.add(scanner.next());
      input--;
    }

    MembershipValidator membershipValidator = new MembershipValidator();
    if (!membershipValidator.isValid(inputList)) {
      System.out.println("Cannot have more than one membership request per order");
    }


  }
}
