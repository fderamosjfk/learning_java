package bookpackext;
import bookpack.Book;

// Use Book class from bookpack.
class UseBook {
  public static void main(String[] args) {
    Book[] books = new Book[5];
    books[0] = new Book("title0", "author0", 2010);
    books[1] = new Book("title1", "author1", 2011);
    books[2] = new Book("title2", "author2", 2012);
    books[3] = new Book("title3", "author3", 2013);
    books[4] = new Book("title4", "author4", 2014);

   for (int i = 0; i < books.length; i++) books[i].show();
  }
}
