package com.shireesha.orderprocessing;

import java.util.List;
import java.util.stream.Collectors;

class OrderProcessor {

  List<String> process(Order order) {
    return order.getItems().stream().map(Item::getName).collect(Collectors.toList());
  }
}
