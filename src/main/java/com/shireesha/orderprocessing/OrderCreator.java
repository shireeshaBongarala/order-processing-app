package com.shireesha.orderprocessing;

import java.util.List;

import static java.util.stream.Collectors.toList;

class OrderCreator {
  Order createOrder(List<String> stringList) {
    List<Request> requests = stringList.stream().map(RequestFactory::createRequest).collect(toList());
    return new Order(requests);
  }
}
