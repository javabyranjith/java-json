package jbr.json.dao;

import java.util.List;

import lombok.Data;

@Data
public class Book {
  private Title title;
  private List<String> author;
  private String year;
  private String price;
  private String category;
}
