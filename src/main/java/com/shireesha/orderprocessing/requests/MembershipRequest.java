package com.shireesha.orderprocessing.requests;

import java.util.List;

import com.shireesha.orderprocessing.Request;
import com.shireesha.orderprocessing.items.Membership;
import static java.util.Arrays.asList;
import lombok.Value;

@Value
public class MembershipRequest implements Request {
  Membership membership;

  @Override
  public void process() {
    System.out.println("create membership");
  }
}
