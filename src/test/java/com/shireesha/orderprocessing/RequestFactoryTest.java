package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.items.Book;
import com.shireesha.orderprocessing.items.Membership;
import com.shireesha.orderprocessing.items.Video;
import com.shireesha.orderprocessing.requests.BookRequest;
import com.shireesha.orderprocessing.requests.MembershipRequest;
import com.shireesha.orderprocessing.requests.VideoRequest;
import static org.junit.Assert.*;
import org.junit.Test;

public class RequestFactoryTest {

  @Test
  public void shouldCreateABookItem() {
    assertEquals(new BookRequest(new Book("Harry", "Hard Bound")),
        RequestFactory.createRequest("Book-Harry-Hard Bound"));
  }

  @Test
  public void shouldCreateAVideoItem() {
    assertEquals(new VideoRequest(new Video("Potter","15mins")),
        RequestFactory.createRequest("Video-Potter-15mins"));
  }

  @Test
  public void shouldCreateAMembershipItem() {
    assertEquals(new MembershipRequest(new Membership("PA", "premium", "15days")),
        RequestFactory.createRequest("Membership-PA-premium-15days"));
  }

}