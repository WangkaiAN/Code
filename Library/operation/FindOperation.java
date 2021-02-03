package Library.operation;

import Library.BookList;

import java.util.Scanner;

public class  FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {

        System.out.println("查找书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名");
        String bname=scanner.next();
        int i=0;
        for(;i<bookList.getSize();++i){
            if(bookList.getBook(i).getName().contains(bname)){
                System.out.println(bookList.getBook(i));
                break;
            }
        }
        if(i==bookList.getSize())
            System.out.println("没有找到");
    }
}
