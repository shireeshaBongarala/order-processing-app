package com.shireesha.orderprocessing;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class OrderCreator {
  Order createOrder(List<String> stringList) {
    List<ItemInterface> items = stringList.stream().map(ItemFactory::createItem).collect(toList());
    return new Order(items);
  }
}
