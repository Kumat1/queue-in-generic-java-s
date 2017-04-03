/**
 * Created by Rhama Permadi on 3/20/2017.
 */
public class Mainan {
    public static int harga;
    public String merk, warna, nama;

    public static void main(String[] args){
        Mainan mainan = new Mainan();
        MobilMobilan
                a = new MobilMobilan("Agya", "Putih", "Toyota", 42.5),
                b = new MobilMobilan();

        System.out.println("Maian 1" +
                           "\nNama : " + mainan.nama +
                           "\nMerk : " + mainan.merk +
                           "\nHarga :" + mainan.harga +
                           "\nWarna :" + mainan.warna);
    }
}
