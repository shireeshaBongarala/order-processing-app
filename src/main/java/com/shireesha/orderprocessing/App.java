package com.shireesha.orderprocessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.shireesha.orderprocessing.Validators.InputValidator;
import com.shireesha.orderprocessing.Validators.MembershipValidator;

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

    List<InputValidator> inputValidators =
        Arrays.asList(new MembershipValidator(), new UpgradeMembershipValidator());
    for (InputValidator inputValidator : inputValidators) {
      inputValidator.isValid(inputList);
    }

    OrderCreator orderCreator = new OrderCreator();
    Order order = orderCreator.createOrder(inputList);
    for(Item item:order.getItems()){
      System.out.println(item.getActions());
    }

  }
}
