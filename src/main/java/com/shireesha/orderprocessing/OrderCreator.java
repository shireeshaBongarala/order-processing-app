package com.shireesha.orderprocessing;

import java.util.List;

import static java.util.stream.Collectors.toList;

class OrderCreator {
  Order createOrder(List<String> stringList) {
    List<Item> items = stringList.stream().map(ItemFactory::createItem).collect(toList());
    return new Order(items);
  }
}
