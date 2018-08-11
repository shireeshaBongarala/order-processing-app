package com.shireesha.orderprocessing.Items;

import java.util.List;

import com.shireesha.orderprocessing.Item;
import static java.util.Arrays.asList;
import lombok.Value;

@Value
public class Video implements Item {
  @Override
  public List<String> getActions() {
    return asList("generate packing slip",
        "generate video certificate");
  }

  @Override
  public String getDisplayName() {
    return "Video";
  }
}
