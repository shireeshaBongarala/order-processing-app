package com.shireesha.orderprocessing;

import java.util.Arrays;
import java.util.List;

import com.shireesha.orderprocessing.requests.BookRequest;
import com.shireesha.orderprocessing.requests.VideoRequest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrderCreatorTest {

  @Test
  public void shouldCreateAnOrderFromTheInput() {
    OrderCreator orderCreator = new OrderCreator();
    List<String> stringList = Arrays.asList(
        "BookRequest",
        "VideoRequest"
    );
    Order actualOrder = orderCreator.createOrder(stringList);

    List<Request> requests = Arrays.asList(
       new BookRequest(), new VideoRequest()
    );
    Order expectedOrder = new Order(requests);

    assertEquals(expectedOrder, actualOrder);
  }
}
