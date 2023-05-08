package uts_a112113524;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaAksi {
    public static void main(String[] args){
        String nim,nama,asalUniv,asalSekolah;
        int semester,usia,thnWisuda = 0;
        float ipk = 0;
        String[] krs;

        ArrayList<MahasiswaBaru> mhsBaru = new ArrayList<>();
        ArrayList<MahasiswaAktif> mhsAktif = new ArrayList<>();
        ArrayList<MahasiswaTransfer> mhsTransfer = new ArrayList<>();
        ArrayList<MahasiswaLulus> mhsLulus = new ArrayList<>();
        Scanner inp = new Scanner(System.in);

        char repeat;
        int size = 0;

        for(int i=1;i<5;i++) {
            repeat = 'Y';
            while (repeat == 'Y' || repeat == 'y') {
                System.out.print("Masukkan informasi mahasiswa ");
                switch (i){
                    case 1:
                        System.out.println("baru");
                        break;
                    case 2:
                        System.out.println("aktif");
                        break;
                    case 3:
                        System.out.println("transfer");
                        break;
                    case 4:
                        System.out.println("lulus");
                        break;
                }

                System.out.print("NIM : ");
                nim = inp.nextLine();
				
                System.out.print("Nama : ");
                nama = inp.nextLine();
				
                System.out.print("Semester : ");
                semester = inp.nextInt();
				
                System.out.print("Umur : ");
                usia = inp.nextInt();
				
                System.out.print("Jumlah KRS : ");
                size = inp.nextInt();
				
                krs = new String[size];
                inp.nextLine();

                for (int j = 0; j < size; j++) {
                    System.out.print("KRS Ke-" + (j + 1) + " : ");
                    krs[j] = inp.nextLine();
                }

                switch (i){
                    case 1:
                        System.out.print("Asal Sekolah : ");
                        asalSekolah = inp.nextLine();
                        mhsBaru.add(new MahasiswaBaru(nim, nama, semester, usia, krs, asalSekolah));
                        break;
                    case 2:
                        mhsAktif.add(new MahasiswaAktif(nim,nama,semester,usia,krs));
                        break;
                    case 3:
                        System.out.print("Asal Sekolah : ");
                        asalSekolah = inp.nextLine();
                        System.out.print("Asal Universitas : ");
                        asalUniv = inp.nextLine();
                        mhsTransfer.add(new MahasiswaTransfer(nim, nama, semester, usia, krs, asalSekolah, asalUniv));
                        break;
                    case 4:
                        System.out.print("Tahun Wisuda : ");
                        thnWisuda = inp.nextInt();
                        System.out.print("IPK : ");
                        ipk = inp.nextFloat();
                        mhsLulus.add(new MahasiswaLulus(nim, nama, semester, usia, krs, thnWisuda,ipk));
                        break;
                }

                krs = null;

                System.out.println("Mau tambah mahasiswa lagi? Y/N");
                repeat = inp.next().charAt(0);
                inp.nextLine();
            }
        }
        for(int i = 1; i<5 ; i++) {
            switch (i){
                case 1:
                    System.out.println("--- List Mahasiswa Baru ---");
                    for(int j = 0; j < mhsBaru.size();j++){
						if(j>0)
							System.out.println("-----");
                        mhsBaru.get(j).infoMahasiswa();
                        mhsBaru.get(j).infoKrsMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("--- List Mahasiswa Aktif ---");
                    for(int j = 0; j < mhsAktif.size();j++){
						if(j>0)
							System.out.println("-----");
                        mhsAktif.get(j).infoMahasiswa();
                        mhsAktif.get(j).infoKrsMahasiswa();
                    }
                    break;
                case 3:
                    System.out.println("--- List Mahasiswa Transfer ---");
                    for(int j = 0; j < mhsTransfer.size();j++){
						if(j>0)
							System.out.println("-----");
                        mhsTransfer.get(j).infoMahasiswa();
                        mhsTransfer.get(j).infoKrsMahasiswa();
                    }
                    break;
                case 4:
                    System.out.println("--- List Mahasiswa Lulus ---");
                    for(int j = 0; j < mhsLulus.size();j++){
						if(j>0)
							System.out.println("-----");
                        mhsLulus.get(j).infoMahasiswa();
                        mhsLulus.get(j).infoKrsMahasiswa();
                    }
                    break;
            }
        }
    }
}
