package com.shireesha.orderprocessing.requests;

import java.util.List;

import com.shireesha.orderprocessing.Request;
import static java.util.Arrays.asList;
import lombok.Value;

@Value
public class MembershipRequest implements Request {
  @Override
  public List<String> getActions() {
    return asList("create membership");
  }

  @Override
  public String getDisplayName() {
    return "MembershipRequest";
  }

  @Override
  public void process() {
    System.out.println("create membership");
  }
}
