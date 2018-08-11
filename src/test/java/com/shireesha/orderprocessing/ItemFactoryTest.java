package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.Items.Book;
import com.shireesha.orderprocessing.Items.Video;
import static org.junit.Assert.*;
import org.junit.Test;

public class ItemFactoryTest {

  @Test
  public void shouldCreateABookItem() {
    assertEquals(new Book(), ItemFactory.createItem("Book"));
  }

  @Test
  public void shouldCreateAVideoItem() {
    assertEquals(new Video(), ItemFactory.createItem("Video"));
  }

}