package com.shireesha.orderprocessing;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UpgradeMembershipValidatorTest {

  @Test
  public void shouldNotContainMoreThanOneUpgradeMembershipRequestPerOrder() {
    List<String> inputs = new ArrayList<>();
    inputs.add("Membership");
    inputs.add("Upgrade-Membership");
    inputs.add("Upgrade-Membership");
    UpgradeMembershipValidator upgradeMembershipValidator = new UpgradeMembershipValidator();
    assertFalse(upgradeMembershipValidator.isValid(inputs));
  }

  @Test
  public void shouldAcceptOneMembershipRequestPerOrder() {
    List<String> inputs = new ArrayList<>();
    inputs.add("Membership");
    inputs.add("Upgrade-Membership");
    UpgradeMembershipValidator upgradeMembershipValidator = new UpgradeMembershipValidator();
    assertTrue(upgradeMembershipValidator.isValid(inputs));
  }

  @Test
  public void shouldNotAcceptUpgradeRequestIfNotAlreadyAMember() {
    List<String> inputs = new ArrayList<>();
    inputs.add("Upgrade-Membership");
    UpgradeMembershipValidator upgradeMembershipValidator = new UpgradeMembershipValidator();
    assertFalse(upgradeMembershipValidator.isValid(inputs));
  }
}
