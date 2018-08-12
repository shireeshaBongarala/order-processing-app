package com.shireesha.orderprocessing;

import java.util.List;

import lombok.Value;

@Value
class Order {
  private List<Request> requests;

  Order(List<Request> requests) {
    this.requests = requests;
  }

  List<Request> getRequests() {
    return requests;
  }

}
