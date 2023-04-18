package latihan2;

public class KaryawanDemo {
    public static void main(String[] args){
        KaryawanTetap kt = new KaryawanTetap("Abdul","10-10-1990",1500000,3000000);
        KaryawanKontrak kk = new KaryawanKontrak("Adi","12-12-1992",1000000,250000);

        System.out.println("Karyawan Tetap");
        System.out.println("Nama : "+kt.nama);
        System.out.println("Tgl Lahir : "+kt.tglLahir);
        System.out.println("Tunjangan Anak : "+kt.tunjanganAnak);
        System.out.println("Gaji : "+kt.hitungGaji());
        System.out.println("Karyawan Kontrak");
        System.out.println("Nama : "+kk.nama);
        System.out.println("Tgl Lahir : "+kk.tglLahir);
        System.out.println("Tunjangan Anak : "+kk.tunjanganAnak);
        System.out.println("Total Upah 10 hari : "+kk.totalUpah(10));

    }
}
