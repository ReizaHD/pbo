package uts_a112113524;

public class MahasiswaBaru extends Mahasiswa{

    String asalSekolah;

    public MahasiswaBaru(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah) {
        super(nim, nama, semester, usia, krs);
        this.asalSekolah = asalSekolah;
    }

    public boolean ikutOspek(){
        return false;
    }

//    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Sekolah : "+asalSekolah);
    }
}
