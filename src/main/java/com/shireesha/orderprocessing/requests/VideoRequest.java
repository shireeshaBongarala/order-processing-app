package com.shireesha.orderprocessing.requests;

import java.util.List;

import com.shireesha.orderprocessing.Request;
import com.shireesha.orderprocessing.items.Video;
import static java.util.Arrays.asList;
import lombok.Value;

@Value
public class VideoRequest implements Request {

  Video video;

  @Override
  public void process() {
    System.out.println("generate packing slip, " +
        "generate video certificate");
  }
}
