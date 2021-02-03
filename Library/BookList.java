package Library;


public class BookList {
    private Book[] books = new Book[100];
    private int size = 0;

    public BookList() {
        books[0] = new Book("三国演义", "罗贯中", 100, "古典小说");
        books[1] = new Book("西游记", "吴承恩", 100, "古典小说");
        books[2] = new Book("红楼梦", "曹雪芹", 110, "古典小说");
        size = 3;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Book getBook(int n) {
        return books[n];
    }

    public void setBook(int index,Book book) {
        books[index] = book;
    }
}
