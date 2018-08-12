package com.shireesha.orderprocessing;

import java.util.Arrays;
import java.util.List;

import com.shireesha.orderprocessing.requests.BookRequest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrderProcessorTest {
  @Test
  public void shouldTakeAnOrderForProcessing() {
    Order order = new Order(Arrays.asList(new BookRequest()));
    OrderProcessor orderProcessor = new OrderProcessor();
    List<String> orderItems = orderProcessor.process(order);
    assertEquals("BookRequest", orderItems.get(0));
  }
}
