package com.shireesha.orderprocessing;

import java.util.Arrays;
import java.util.List;

import com.shireesha.orderprocessing.Items.Book;
import com.shireesha.orderprocessing.Items.Video;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrderCreatorTest {

  @Test
  public void shouldCreateAnOrderFromTheInput() {
    OrderCreator orderCreator = new OrderCreator();
    List<String> stringList = Arrays.asList(
        "Book",
        "Video"
    );
    Order actualOrder = orderCreator.createOrder(stringList);

    List<ItemInterface> items = Arrays.asList(
       new Book(), new Video()
    );
    Order expectedOrder = new Order(items);

    assertEquals(expectedOrder, actualOrder);
  }
}
