package week1;

public class Latihan2 {
	public static void main(String[] args) {
		float phi = 3.14f;
		float d = 10f;
		float r = 0.5f*d;
		float kll_lkr = phi * r * r;
		System.out.println("Keliling lingkaran dengan diameter 10 adalah "+kll_lkr);
		int a = 6;
		int t = 8;
		float l_segitiga = a * t * 0.5f;
		System.out.println("Luas segitiga siku-siku dengan diketahui alas = 6, tinggi = 8 adalah "+l_segitiga);
		float d_tabung = 5f;
		float t_tabung = 10f;
		float r_tabung = 0.5f*d_tabung;
		float v = phi* r_tabung * r_tabung *t_tabung;
		System.out.println("Volume tabung dengan diketahui diameter = 5, tinggi = 10 adalah "+v);
		
	}
}