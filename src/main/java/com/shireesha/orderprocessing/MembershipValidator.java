package com.shireesha.orderprocessing;

import java.util.List;

class MembershipValidator {
  boolean isValid(List<String> inputs) {
    long countOfMembershipRequests = inputs.stream().filter(x -> x.equals("Membership")).count();
    if(countOfMembershipRequests > 1) return false;
    return true;
  }
}
