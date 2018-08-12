package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.requests.BookRequest;
import com.shireesha.orderprocessing.requests.MembershipRequest;
import com.shireesha.orderprocessing.requests.VideoRequest;
import static org.junit.Assert.*;
import org.junit.Test;

public class RequestFactoryTest {

  @Test
  public void shouldCreateABookItem() {
    assertEquals(new BookRequest(), RequestFactory.createRequest("BookRequest"));
  }

  @Test
  public void shouldCreateAVideoItem() {
    assertEquals(new VideoRequest(), RequestFactory.createRequest("VideoRequest"));
  }

  @Test
  public void shouldCreateAMembershipItem() {
    assertEquals(new MembershipRequest(), RequestFactory.createRequest("MembershipRequest"));
  }

}