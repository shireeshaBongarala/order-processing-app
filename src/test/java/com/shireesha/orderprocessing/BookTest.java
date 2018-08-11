package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.Items.Book;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import org.junit.Test;

public class BookTest {

  @Test
  public void shouldReturnItsActions() {
    Book book = new Book();
    assertEquals(
        asList("generate packing slip",
            "generate commission payment to the agent"),
        book.getActions());
  }

}