package uts_a112113524;

public class MahasiswaLulus extends Mahasiswa{

    int thnWisuda;
    float ipk;

    public MahasiswaLulus(String nim, String nama, int semester, int usia, String[] krs, int thnWisuda, float ipk) {
        super(nim, nama, semester, usia, krs);
        this.thnWisuda = thnWisuda;
        this.ipk = ipk;
    }

    boolean ikutWisuda(){
        return true;
    }

    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda : "+thnWisuda);
        System.out.println("IPK : "+ipk);
    }
}
