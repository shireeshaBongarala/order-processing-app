package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.Items.Video;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VideoTest {

  @Test
  public void shouldReturnItsActions() {
    Video video = new Video();
    assertEquals(
        asList("generate packing slip",
            "generate video certificate"),
        video.getActions());
  }
}
