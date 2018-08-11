package com.shireesha.orderprocessing;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class OrderCreator {
  Order createOrder(List<String> stringList) {
    List<Item> items = stringList.stream().map(Item::new).collect(toList());
    return new Order(items);
  }
}
