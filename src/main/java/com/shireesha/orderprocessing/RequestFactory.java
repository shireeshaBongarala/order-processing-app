package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.Items.Book;
import com.shireesha.orderprocessing.Items.Membership;
import com.shireesha.orderprocessing.Items.Video;

class RequestFactory {
  static Request createRequest(String request) {
    if (request.equals("Book")) {
      return new Book();
    }
    if (request.equals("Video")) {
      return new Video();
    }
    if (request.equals("Membership")) {
      return new Membership();
    }
    return null;
  }
}
