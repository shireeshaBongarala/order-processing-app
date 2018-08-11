package com.shireesha.orderprocessing.Items;

import java.util.List;

import com.shireesha.orderprocessing.Item;
import static java.util.Arrays.asList;
import lombok.Value;

@Value
public class Book implements Item {
  @Override
  public List<String> getActions() {
    return asList("generate packing slip",
        "generate commission payment to the agent");
  }

  @Override
  public String getDisplayName() {
    return "Book";
  }
}
