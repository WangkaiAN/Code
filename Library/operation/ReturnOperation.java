package Library.operation;

import Library.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入要还的书籍");
        String bname=scanner.next();
        int i=0;
        for(;i<bookList.getSize();++i){
            if(bookList.getBook(i).getName().equals(bname)&&
            bookList.getBook(i).isBorrowed()){
                System.out.println("可以归还");
                break;
            }
        }
        if(i==bookList.getSize()){
            System.out.println("无法归还");
            return;
        }
        if(i<bookList.getSize()){
            bookList.getBook(i).setBorrowed(false);
            System.out.println("归还成功");
            return;
        }
    }
}
