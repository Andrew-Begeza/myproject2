import com.mypack.myArrayList;
public class Main {
    public static void main(String[] args) {
        myArrayList arr = new myArrayList(3);
        arr.printArr();
        arr.add(5);
        arr.add(6);
        arr.add(11);
        arr.add(100);
        arr.printArr();
        arr.remove(1);
        arr.printArr();
        arr.remove(2);
        arr.printArr();
        arr.changeTo(0,150);
        arr.printArr();
    }
}