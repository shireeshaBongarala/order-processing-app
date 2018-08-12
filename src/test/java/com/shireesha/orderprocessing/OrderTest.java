package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.requests.BookRequest;
import com.shireesha.orderprocessing.requests.VideoRequest;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrderTest {

  @Test
  public void shouldContainListOfItems(){
    Request book = new BookRequest();
    Request video = new VideoRequest();

    Order order = new Order(asList(book, video));
    assertEquals(book, order.getRequests().get(0));
    assertEquals(video, order.getRequests().get(1));
  }

}