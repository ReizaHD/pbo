package latihan2;

public class KaryawanTetap extends Karyawan{
    int gajiPokok;
    public KaryawanTetap(String nama, String tglLahir,int tunjanganAnak, int gajiPokok) {
        super(nama, tglLahir, tunjanganAnak);
        this.gajiPokok = gajiPokok;
    }

    public int hitungGaji(){
        return tunjanganAnak + gajiPokok;
    }

}
