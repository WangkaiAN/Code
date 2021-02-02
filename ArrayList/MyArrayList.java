package ArrayList;



public class MyArrayList {
    private String[] array=null;
    private int size=0;
    private int capacity=100;

    public MyArrayList() {
        array = new String[capacity];
    }

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
        String[] arr=new String[capacity];
        for(int i=0;i<array.length;i++){
            arr[i]=array[i];
        }
        array=arr;
    }

    //add
    public void add(String s){
      if(size>=capacity){
          realloc();
      }
      array[size]=s;
      size++;
    }
    //add(int index,String s)
    public void add(int index,String s){
        if(index<0||index>size){
            return;
        }
        if(size>=capacity){
            realloc();
        }
        for(int i=size-1;i>=index;i--){
            array[i+1]=array[i];
        }
        array[index]=s;
        size++;
    }
    //remove
    public String  remove(int index){
        if(index<0||index>size){
            return null;
        }
        String result= array[index];
        for (int i=index;i<size-1;i++){
            array[i]=array[i+1];
        }
        size--;
        return result;
    }
    //boolean remove
    public boolean remove(String e){
        int i=0;
        for(;i<size;i++){
            if(array[i].equals(e)){
                break;
            }
        }
        if(i>=size){
            return false;
        }
        for (int j=i;j<size-1;j++){
            array[i]=array[i+1];
        }
        size--;
        return true;
    }
    //get
    public String get(int index){
        if(index<0||index>size){
            return null;
        }
        return array[index];
    }
    //set
    public void set(int index,String e){
        if(index<0||index>size){
            return ;
        }
        array[index]=e;
    }
    //contains
    public boolean contains(String e){
        for (int i=0;i<size;i++){
            if(array[i].equals(e))
                return true;
        }
        return false;
    }

    //indexof
    public int indexof(String e){
        for (int i=0;i<size;i++){
            if(array[i].equals(e))
                return i;
        }
        return -1;
    }
    //Lastindexof
    public int LastIndexof(String e){
        for(int i=size-1;i>=0;i--){
            if(array[i].equals(e))
                return i;
        }
        return -1;
    }
    //clear
    public void clear(){
        size=0;
    }
    //size

    public int getSize() {
        return size;
    }
    //isEmpty
    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }
}
