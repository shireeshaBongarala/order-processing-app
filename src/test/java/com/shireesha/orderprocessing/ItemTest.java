package com.shireesha.orderprocessing;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ItemTest {

  @Test
  public void shouldGetTheNameOfTheItem(){
    Item item = new Item("Book");
    assertEquals("Book", item.getName());
  }

  @Test
  public void bookItemShouldHaveGivenSetOfActions() {
    Item item = new Item("Book");
    assertEquals(
        asList("generate packing slip",
            "generate commission payment to the agent"),
        item.getActions());
  }
}