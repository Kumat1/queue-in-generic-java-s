/**
 * Created by Rhama Permadi on 3/20/2017.
 */
public class MobilMobilan extends Mainan{
    //cara menginheritance di java
    public double kmph;

    public MobilMobilan(){
        this.kmph = 10;
    }

    public MobilMobilan(String nama, String warna, String merk, double kmph){
        this.nama = nama;
        this.warna = warna;
        this.merk = merk;
        this.kmph = kmph;
    }
}
