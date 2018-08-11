package com.shireesha.orderprocessing;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MembershipValidatorTest {

  @Test
  public void shouldNotAcceptMoreThanOneMemberShipRequestPerOrder() {
    List<String> inputs = new ArrayList<>();
    inputs.add("Membership");
    inputs.add("Membership");
    MembershipValidator membershipValidator = new MembershipValidator();
    assertFalse(membershipValidator.isValid(inputs));
  }

  @Test
  public void shouldAcceptOneMembershipRequestPerOrder() {
    List<String> inputs = new ArrayList<>();
    inputs.add("Membership");
    inputs.add("Book");
    MembershipValidator membershipValidator = new MembershipValidator();
    assertTrue(membershipValidator.isValid(inputs));
  }

}
