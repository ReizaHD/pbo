package latihan2;

public class KaryawanKontrak extends Karyawan{
    int upahHarian;

    public KaryawanKontrak(String nama, String tglLahir, int tunjanganAnak, int upahHarian) {
        super(nama, tglLahir, tunjanganAnak);
        this.upahHarian = upahHarian;
    }

    public int totalUpah(int hariMasuk){
        return (hariMasuk*upahHarian)+tunjanganAnak;
    }
}
