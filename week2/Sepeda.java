package week2;

public class Sepeda {
	//ini adalah tempat atribut
	int gear = 5;
	
	public Sepeda(int jumlahRoda, String jenis, String merk){
		 System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda); 
	}


	//ini adalah tempat method
	void ngerem() {
	 System.out.println("Sepeda direm");
	 } 
}
