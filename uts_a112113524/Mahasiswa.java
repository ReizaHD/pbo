package uts_a112113524;

public class Mahasiswa{
    String nim;
    String nama;
    int semester;
    int usia;
    String[] krs;

    public Mahasiswa(String nim, String nama, int semester, int usia, String[] krs) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
    }

    public float hitungRataNilai(int[] nilai){
        int size = nilai.length;
        int total = 0;
        for(int i=0;i < size;i++){
            total += nilai[i];
        }
        return total/size;
    }

    public void infoMahasiswa(){
        System.out.println("NIM : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Semester : "+semester);
        System.out.println("Usia : "+usia+" Tahun");
    }

    public void infoKrsMahasiswa(){
        int size = krs.length;
        System.out.println("List KRS "+nama);
        for(int i=0;i < size;i++){
            System.out.println((i+1)+". "+krs[i]);
        }
    }
}