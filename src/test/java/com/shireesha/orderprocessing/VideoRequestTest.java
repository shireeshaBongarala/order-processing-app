package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.requests.VideoRequest;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VideoRequestTest {

  @Test
  public void shouldReturnItsActions() {
    VideoRequest videoRequest = new VideoRequest();
    assertEquals(
        asList("generate packing slip",
            "generate videoRequest certificate"),
        videoRequest.getActions());
  }
}
