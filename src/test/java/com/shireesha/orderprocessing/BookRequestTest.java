package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.requests.BookRequest;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import org.junit.Test;

public class BookRequestTest {

  @Test
  public void shouldReturnItsActions() {
    BookRequest bookRequest = new BookRequest();
    assertEquals(
        asList("generate packing slip",
            "generate commission payment to the agent"),
        bookRequest.getActions());
  }

}