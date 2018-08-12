package com.shireesha.orderprocessing;

import java.util.List;

public interface Request {
  List<String> getActions();
  String getDisplayName();
  public void process();
}
