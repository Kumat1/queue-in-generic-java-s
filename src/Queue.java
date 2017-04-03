import java.lang.reflect.Array;

/**
 * Created by Rhama Permadi on 3/27/2017.
 */
public class Queue <T> {
    public T[] array;
    public int pointer, x;

    public Queue(Class<?>classname){
        array = (T[]) Array.newInstance(classname,10); //mengembalikan nilai array untuk di casting ke array T
        pointer = -1;     //minus 1 karena array nya masi kosong
        x = 0;
    }

    public static void main(String[]args){
        Queue<Integer> s = new Queue<Integer> (Integer.class); //mengambil objek dari sebuah objeck

        s.enQueue(12);
        s.enQueue(15);
        s.enQueue(17);

        System.out.println("Output (sesuai konsep FIFO) : ");
        System.out.println(s.deQueue()); //mencetak objek pertama
        System.out.println(s.deQueue()); //mencetak objek kedua
        System.out.println(s.deQueue()); //mencetak objek ketiga
    }

    public void enQueue(T item){

        array[++pointer] = item;
    }

    public T deQueue(){

        return array[x++];    //memanggil objek yang pertama
    }
}
