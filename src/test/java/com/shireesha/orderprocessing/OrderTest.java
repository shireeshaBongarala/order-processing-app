package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.Items.Book;
import com.shireesha.orderprocessing.Items.Video;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrderTest {

  @Test
  public void shouldContainListOfItems(){
    Item book = new Book();
    Item video = new Video();

    Order order = new Order(asList(book, video));
    assertEquals(book, order.getItems().get(0));
    assertEquals(video, order.getItems().get(1));
  }

}