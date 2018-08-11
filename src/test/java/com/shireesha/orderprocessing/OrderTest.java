package com.shireesha.orderprocessing;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrderTest {

  @Test
  public void shouldContainListOfItems(){
    Item book = new Item("Book");
    Item video = new Item("Video");

    Order order = new Order(asList(book, video));
    assertEquals(book, order.getItems().get(0));
    assertEquals(video, order.getItems().get(1));
  }

}