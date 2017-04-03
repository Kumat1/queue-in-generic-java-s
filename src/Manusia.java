/**
 * Created by Rhama Permadi on 3/27/2017.
 */
public class Manusia extends MakhlukHidup implements FungsiDasar {

    public static void main(String[]args){
        System.out.println("");
        Manusia a = new Manusia();
        a.makan();
        a.bernafas();
        a.jalan();
    }

    @Override
    public void makan() {
        System.out.println("Makan banggg...");
    }

    @Override
    public void bernafas() {
        System.out.println("fyuhh..");
    }

}

