package week2;

import week2.Sepeda;

public class AksiSepeda {
	public static void main(String[] args) {
		Sepeda sepedaBayi = new Sepeda(2,"x","y");
		
		int gearSpd = sepedaBayi.gear;
		System.out.println(gearSpd); 
		sepedaBayi.ngerem();
		
	}

}
