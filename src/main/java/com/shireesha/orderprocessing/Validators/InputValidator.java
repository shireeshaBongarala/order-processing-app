package com.shireesha.orderprocessing.Validators;

import java.util.List;

public interface InputValidator {
  boolean isValid(List<String> strings);
  String getInValidMessage();

}
