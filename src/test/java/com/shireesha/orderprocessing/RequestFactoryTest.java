package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.Items.Book;
import com.shireesha.orderprocessing.Items.Membership;
import com.shireesha.orderprocessing.Items.Video;
import static org.junit.Assert.*;
import org.junit.Test;

public class RequestFactoryTest {

  @Test
  public void shouldCreateABookItem() {
    assertEquals(new Book(), RequestFactory.createRequest("Book"));
  }

  @Test
  public void shouldCreateAVideoItem() {
    assertEquals(new Video(), RequestFactory.createRequest("Video"));
  }

  @Test
  public void shouldCreateAMembershipItem() {
    assertEquals(new Membership(), RequestFactory.createRequest("Membership"));
  }

}