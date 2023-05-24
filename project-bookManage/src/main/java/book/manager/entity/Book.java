package book.manager.entity;

import lombok.Data;

@Data
public class Book {
    int bid;
    String title;
    String desc;
    double price;
}
