package com.shireesha.orderprocessing.Items;

import java.util.List;

import com.shireesha.orderprocessing.ItemInterface;
import static java.util.Arrays.asList;

public class Book implements ItemInterface {
  @Override
  public List<String> getActions() {
    return asList("generate packing slip",
        "generate commission payment to the agent");
  }
}
