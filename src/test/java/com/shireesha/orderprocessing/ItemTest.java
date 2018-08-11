package com.shireesha.orderprocessing;

import static org.junit.Assert.*;
import org.junit.Test;

public class ItemTest {

  @Test
  public void shouldGetTheNameOfTheItem(){
    Item item = new Item("Book");
    assertEquals("Book", item.getName());
  }
}