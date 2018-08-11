package com.shireesha.orderprocessing.Items;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import org.junit.Test;

public class MembershipTest {

  @Test
  public void shouldReturnItsActions() {
    Membership membership = new Membership();
    assertEquals(
        asList("create membership"),
        membership.getActions());
  }

  @Test
  public void shouldReturnTheDisplayName() {
    Membership membership = new Membership();
    assertEquals("Membership", membership.getDisplayName());
  }
}