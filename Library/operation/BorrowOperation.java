package Library.operation;

import Library.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("借一本书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要借的书名");
        String bname = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); ++i) {
            if (bookList.getBook(i).getName().equals(bname)) {
                System.out.println("有这本书");
                break;
            }
        }
        if (i == bookList.getSize()){
            System.out.println("没有此书");
            return;
        }
        if(i<bookList.getSize()){
            if(bookList.getBook(i).isBorrowed()){
                System.out.println("此书已经被借走");
                return;
            }
            else{
                bookList.getBook(i).setBorrowed(true);
                System.out.println("借到了");
            }
        }
    }
}
