package com.shireesha.orderprocessing.requests;

import java.util.List;

import com.shireesha.orderprocessing.Request;
import com.shireesha.orderprocessing.items.Book;
import static java.util.Arrays.asList;
import lombok.Value;

@Value
public class BookRequest implements Request {
  Book book;

  @Override
  public void process() {
    System.out.println("Generate packing slip," +
        " generate commission payment to the agent");
  }
}
