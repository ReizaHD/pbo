package uts_a112113524;

public class MahasiswaTransfer extends MahasiswaBaru{

    String asalUniv;

    public MahasiswaTransfer(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah, String asalUniv) {
        super(nim, nama, semester, usia, krs, asalSekolah);
        this.asalUniv = asalUniv;
    }

    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Universitas : "+asalUniv);
    }
}
