package com.shireesha.orderprocessing.Items;

import java.util.List;

import com.shireesha.orderprocessing.Request;
import static java.util.Arrays.asList;
import lombok.Value;

@Value
public class Book implements Request {
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
