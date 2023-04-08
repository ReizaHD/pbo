import transportasi.*;
public class TransportasiDemo{
	public static void main(String[] args){
		Mobil m = new Mobil("Honda",500,6);
		m.bukaJendela();
		Sepeda s = new Sepeda("United",7);
		s.bel();
	}
}