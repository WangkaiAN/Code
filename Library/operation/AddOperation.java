package Library.operation;

import Library.Book;
import Library.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("增加一本书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入新的书籍的名称: ");
        String name = scanner.next();
        System.out.println("请输入新的书籍的作者: ");
        String author = scanner.next();
        System.out.println("请输入新的书籍的价格: ");
        double price = scanner.nextDouble();
        System.out.println("请输入新的书籍的类别: ");
        String type = scanner.next();
        Book book=new Book(name,author,price,type);
        int Bsize=bookList.getSize();
        bookList.setSize(Bsize+1);
        bookList.setBook(Bsize,book);
        System.out.println("增加书籍成功");
    }
}
