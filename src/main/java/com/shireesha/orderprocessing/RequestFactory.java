package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.requests.BookRequest;
import com.shireesha.orderprocessing.requests.MembershipRequest;
import com.shireesha.orderprocessing.requests.VideoRequest;

class RequestFactory {
  static Request createRequest(String request) {
    if (request.equals("BookRequest")) {
      return new BookRequest();
    }
    if (request.equals("VideoRequest")) {
      return new VideoRequest();
    }
    if (request.equals("MembershipRequest")) {
      return new MembershipRequest();
    }
    return null;
  }
}
