package com.shireesha.orderprocessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.shireesha.orderprocessing.Items.Book;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrderProcessorTest {
  @Test
  public void shouldTakeAnOrderForProcessing() {
    Order order = new Order(Arrays.asList(new Book()));
    OrderProcessor orderProcessor = new OrderProcessor();
    List<String> orderItems = orderProcessor.process(order);
    assertEquals("Book", orderItems.get(0));
  }
}
