package com.shireesha.orderprocessing;

import java.util.List;

import com.shireesha.orderprocessing.Validators.InputValidator;

public class UpgradeMembershipValidator implements InputValidator {
  public boolean isValid(List<String> inputs) {
    if (inputs.contains("Upgrade-MembershipRequest")) {
      if (!inputs.contains("MembershipRequest")) {
        return false;
      }
      if (inputs.indexOf("MembershipRequest") > inputs.indexOf("Upgrade-MembershipRequest")) {
        return false;
      }
      long countOfMembershipRequests = inputs.stream().filter(x -> x.equals("Upgrade-MembershipRequest")).count();
      return countOfMembershipRequests <= 1;
    }
    return true;
  }

  @Override
  public String getInValidMessage() {
    return "Upgrade MembershipRequest errored";
  }
}
