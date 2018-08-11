package com.shireesha.orderprocessing;

import com.shireesha.orderprocessing.Items.Book;
import com.shireesha.orderprocessing.Items.Video;

class ItemFactory {
  static ItemInterface createItem(String item) {
    if (item.equals("Book")) {
      return new Book();
    }
    if (item.equals("Video")) {
      return new Video();
    }
    return null;
  }
}