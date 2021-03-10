package Stack;
//因为Stack 继承于顺序表，这里就使用顺序表来进行实现


public class MyStack {
    private int[] array = new int[100];
    private int size = 0;
    private int capacity=100;

    @Override
    public String toString() {
        StringBuffer s1=new StringBuffer();
        for (int i=0;i<size;i++){
            s1.append(" "+array[i]);
        }
        return String.valueOf(s1);
    }

    //realloc
    private void realloc(){
        capacity*=2;
        int[] arr=new int[capacity];
        for(int i=0;i<array.length;i++){
            arr[i]=array[i];
        }
        array=arr;
    }

    //入栈(尾插)
    public void push(int val){
        if(size==capacity){
            realloc();
        }
        array[size] = val;
        size++;
    }
    //出栈
    public Integer pop(){
        if(size == 0){
            return null;
        }
        int ret = array[size-1];
        size--;
        return ret;
    }
    //取栈顶元素
    public Integer peek(){
        if(size == 0){
            return null;
        }
        return array[size-1];
    }
}
