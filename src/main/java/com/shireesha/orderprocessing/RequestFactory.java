package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.items.Book;
import com.shireesha.orderprocessing.items.Membership;
import com.shireesha.orderprocessing.items.Video;
import com.shireesha.orderprocessing.requests.BookRequest;
import com.shireesha.orderprocessing.requests.MembershipRequest;
import com.shireesha.orderprocessing.requests.VideoRequest;

class RequestFactory {
  static Request createRequest(String request) {
    if (request.contains("Book")) {
      String name = request.split("-")[1];
      String type = request.split("-")[2];
      return new BookRequest(new Book(name, type));
    }
    if (request.contains("Video")) {
      String name = request.split("-")[1];
      String duration = request.split("-")[2];
      return new VideoRequest(new Video(name, duration));
    }
    if (request.contains("Membership")) {
      String name = request.split("-")[1];
      String type = request.split("-")[2];
      String duration = request.split("-")[3];
      return new MembershipRequest(new Membership(name, type, duration));
    }
    return null;
  }
}
