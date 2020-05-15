package jbr.json;

import java.io.File;
import java.util.List;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import jbr.json.dao.Book;

public class App {
  public static void main(String[] args) throws Exception {

    DocumentContext docContext = JsonPath.parse(new File("books.json"));
    String category1 = docContext.read("$.books.book[0].category", String.class);
    System.out.println("category1\t: " + category1);
    List<String> categories = docContext.read("$.books.book[*].category", List.class);
    System.out.println("categories\t: " + categories);

    // List<Book> books = docContext.read("$.books.book[*]", List.class);
    List<Book> books = docContext.read("$.books.book[*]");
    System.out.println(books.get(0));

    Book book4 = docContext.read("$.books.book[0]");
    System.out.println(book4);
  }
}
