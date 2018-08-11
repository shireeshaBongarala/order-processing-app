package com.shireesha.orderprocessing;

import java.util.List;

class UpgradeMembershipValidator {
  boolean isValid(List<String> inputs) {
    if (inputs.contains("Upgrade-Membership")) {
      if (!inputs.contains("Membership")) {
        return false;
      }
      if (inputs.indexOf("Membership") > inputs.indexOf("Upgrade-Membership")) {
        return false;
      }
      long countOfMembershipRequests = inputs.stream().filter(x -> x.equals("Upgrade-Membership")).count();
      return countOfMembershipRequests <= 1;
    }
    return true;
  }
}
