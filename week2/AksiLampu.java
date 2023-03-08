package week2;

public class AksiLampu {
	public static void main(String[] args) {
		Lampu ledLampu = new Lampu();
		
		ledLampu.nyalakanLampu();
		boolean nyala = ledLampu.nyala;
		System.out.println("Apakah lampu menyala? "+ledLampu.nyala);
	}
}
