package com.shireesha.orderprocessing;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrderCreatorTest {

  @Test
  public void shouldCreateAnOrderFromTheInput() {
    OrderCreator orderCreator = new OrderCreator();
    List<String> stringList = Arrays.asList(
        "Book",
        "Video",
        "Membership"
    );
    Order actualOrder = orderCreator.createOrder(stringList);

    List<Item> items = Arrays.asList(
        new Item("Book"),
        new Item("Video"),
        new Item("Membership")
    );
    Order expectedOrder = new Order(items);

    assertEquals(expectedOrder, actualOrder);
  }
}
