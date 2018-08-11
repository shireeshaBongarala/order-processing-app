package com.shireesha.orderprocessing;

import java.util.List;

class Order {
  private List<Item> items;

  Order(List<Item> items) {
    this.items = items;
  }

  List<Item> getItems() {
    return items;
  }

}
