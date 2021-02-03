package Library.operation;

import Library.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除一本书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删的书名：");
        String bname=scanner.next();
        int i=0;
        for(;i<bookList.getSize();++i){
            if(bookList.getBook(i).getName().equals(bname)){
                System.out.println("有这本书可以删");
                break;
            }
        }
        if(i==bookList.getSize()){
            System.out.println("没有此书，删不了");
            return;
        }
        if(i<bookList.getSize()){
            //在末尾的情况
            if(i==bookList.getSize()-1) {
                bookList.setSize(bookList.getSize() - 1);
            }
            //不在末尾的情况
            if(i<bookList.getSize()-1) {
                bookList.setBook(i, bookList.getBook(bookList.getSize() - 1));
                bookList.setSize(bookList.getSize()-1);
            }
            System.out.println("删除成功");
        }
    }
}
