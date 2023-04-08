package transportasi;
public class Mobil{
	public Mobil(String brand, int cc, int kapasitas){
		System.out.println("----Mobil----");
		System.out.println("Brand = "+brand);
		System.out.println(cc+" CC");
		System.out.println("Kapasitas = "+kapasitas);
		System.out.println("-------------");
	}
	
	public void bukaJendela(){
		System.out.println("Mobil : Jendela dibuka");
	}
}
