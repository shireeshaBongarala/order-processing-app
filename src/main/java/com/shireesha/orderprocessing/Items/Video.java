package com.shireesha.orderprocessing.Items;

import java.util.List;

import com.shireesha.orderprocessing.Request;
import static java.util.Arrays.asList;
import lombok.Value;

@Value
public class Video implements Request {
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
