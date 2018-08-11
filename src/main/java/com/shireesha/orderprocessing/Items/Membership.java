package com.shireesha.orderprocessing.Items;

import java.util.List;

import com.shireesha.orderprocessing.Item;
import static java.util.Arrays.asList;

public class Membership implements Item {
  @Override
  public List<String> getActions() {
    return asList("create membership");
  }

  @Override
  public String getDisplayName() {
    return "Membership";
  }
}
