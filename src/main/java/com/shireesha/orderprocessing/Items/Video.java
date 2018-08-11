package com.shireesha.orderprocessing.Items;

import java.util.List;

import com.shireesha.orderprocessing.ItemInterface;
import static java.util.Arrays.asList;
import lombok.Value;

@Value
public class Video implements ItemInterface {
  @Override
  public List<String> getActions() {
    return asList("generate packing slip",
        "generate video certificate");
  }
}
