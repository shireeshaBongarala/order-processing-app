package com.shireesha.orderprocessing;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import lombok.Value;

@Value
class Item {
  private String name;

  Item(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }

  List<String> getActions() {
    if (this.name.equals("Book")) {
      return asList("generate packing slip",
          "generate commission payment to the agent");
    }
    return Collections.emptyList();
  }
}
