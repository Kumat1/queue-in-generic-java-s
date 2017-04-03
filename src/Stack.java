import java.lang.reflect.Array;

/**
 * Created by Rhama Permadi on 3/27/2017.
 */
public class Stack <T> {
    public T[] array;
    public int pointer, x;

    public Stack(Class<?>classname){
        array = (T[]) Array.newInstance(classname,17); //mengembalikan nilai array untuk di casting ke array T
        pointer = -1; //minus 1 karena array nya masi kosong
    }

    public static void main(String[]args){
        Stack<Integer> s = new Stack<Integer> (Integer.class); //mengambil objek dari sebuah objeck

        s.push(12);
        s.push(15);
        s.push(17);

        System.out.println("Output : ");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

    public void push(T item){

        array[++pointer] = item;
    }

    public T pop(){

        return array[pointer--];
    }
}
