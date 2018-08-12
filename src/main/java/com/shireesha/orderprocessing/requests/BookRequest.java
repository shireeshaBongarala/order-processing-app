package com.shireesha.orderprocessing.requests;

import java.util.List;

import com.shireesha.orderprocessing.Request;
import static java.util.Arrays.asList;
import lombok.Value;

@Value
public class BookRequest implements Request {
  @Override
  public List<String> getActions() {
    return asList("generate packing slip",
        "generate commission payment to the agent");
  }

  @Override
  public String getDisplayName() {
    return "BookRequest";
  }

  @Override
  public void process() {
    System.out.println("Generate packing slip," +
        " generate commission payment to the agent");
  }
}
