package com.shireesha.orderprocessing.requests;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import org.junit.Test;

public class MembershipRequestTest {

  @Test
  public void shouldReturnItsActions() {
    MembershipRequest membershipRequest = new MembershipRequest();
    assertEquals(
        asList("create membershipRequest"),
        membershipRequest.getActions());
  }

  @Test
  public void shouldReturnTheDisplayName() {
    MembershipRequest membershipRequest = new MembershipRequest();
    assertEquals("MembershipRequest", membershipRequest.getDisplayName());
  }
}