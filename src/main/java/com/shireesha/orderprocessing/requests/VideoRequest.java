package com.shireesha.orderprocessing.requests;

import java.util.List;

import com.shireesha.orderprocessing.Request;
import static java.util.Arrays.asList;
import lombok.Value;

@Value
public class VideoRequest implements Request {
  @Override
  public List<String> getActions() {
    return asList("generate packing slip",
        "generate video certificate");
  }

  @Override
  public String getDisplayName() {
    return "VideoRequest";
  }

  @Override
  public void process() {
    System.out.println("generate packing slip, " +
        "generate video certificate");
  }
}
