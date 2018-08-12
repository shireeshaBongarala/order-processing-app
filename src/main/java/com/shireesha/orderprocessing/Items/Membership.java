package com.shireesha.orderprocessing.Items;

import java.util.List;

import com.shireesha.orderprocessing.Request;
import static java.util.Arrays.asList;
import lombok.Value;

@Value
public class Membership implements Request {
  @Override
  public List<String> getActions() {
    return asList("create membership");
  }

  @Override
  public String getDisplayName() {
    return "Membership";
  }
}
