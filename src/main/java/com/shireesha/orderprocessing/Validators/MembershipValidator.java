package com.shireesha.orderprocessing.Validators;

import java.util.List;

public class MembershipValidator implements InputValidator {
  public boolean isValid(List<String> inputs) {
    long countOfMembershipRequests = inputs.stream().filter(x -> x.equals("MembershipRequest")).count();
    if(countOfMembershipRequests > 1) return false;
    return true;
  }

  @Override
  public String getInValidMessage() {
    return "Cannot have more than one membership request per order";
  }
}
