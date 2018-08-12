package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.Items.Book;
import com.shireesha.orderprocessing.Items.Video;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrderTest {

  @Test
  public void shouldContainListOfItems(){
    Request book = new Book();
    Request video = new Video();

    Order order = new Order(asList(book, video));
    assertEquals(book, order.getRequests().get(0));
    assertEquals(video, order.getRequests().get(1));
  }

}