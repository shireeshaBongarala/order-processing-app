package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.items.Book;
import com.shireesha.orderprocessing.items.Video;
import com.shireesha.orderprocessing.requests.BookRequest;
import com.shireesha.orderprocessing.requests.VideoRequest;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrderTest {

  @Test
  public void shouldContainListOfItems(){
    Request bookRequest = new BookRequest(new Book("A", "B"));
    Request videoRequest = new VideoRequest(new Video("A", "B"));

    Order order = new Order(asList(bookRequest, videoRequest));
    assertEquals(bookRequest, order.getRequests().get(0));
    assertEquals(videoRequest, order.getRequests().get(1));
  }

}