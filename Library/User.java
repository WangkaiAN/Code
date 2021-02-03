package Library;

import Library.operation.IOperation;


abstract public class User {
    protected String name;
    protected IOperation[] operations;

    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
//        IOperation operation = this.operations[choice - 1];
//        operation.work(bookList);
        this.operations[choice-1].work(bookList);
    }
}
