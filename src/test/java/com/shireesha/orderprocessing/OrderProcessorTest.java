package com.shireesha.orderprocessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrderProcessorTest {
  @Test
  public void shouldTakeAnOrderForProcessing() {
    Order order = new Order(Arrays.asList(new Item("Book")));
    OrderProcessor orderProcessor = new OrderProcessor();
    List<String> orderItems = orderProcessor.process(order);
    assertEquals("Book", orderItems.get(0));
  }
}
