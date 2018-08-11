package com.shireesha.orderprocessing;

import java.util.List;

import lombok.Value;

@Value
class Order {
  private List<ItemInterface> items;

  Order(List<ItemInterface> items) {
    this.items = items;
  }

  List<ItemInterface> getItems() {
    return items;
  }

}
