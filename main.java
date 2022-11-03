import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int kodeBulan, tanggal;

		System.out.print("Masukan kode bulan \t: ");
		kodeBulan = input.nextInt();
		System.out.print("Masukan tanggal \t: ");
		tanggal = input.nextInt();

		if(tanggal >= 21 && kodeBulan == 3 || tanggal <= 19 && kodeBulan == 4){
			System.out.println("Zodiak Aries");
		} else if(tanggal >= 20 && kodeBulan == 4 || tanggal <= 20 && kodeBulan == 5){
			System.out.println("Zodiak Taurus");
		} else if(tanggal >= 21 && kodeBulan == 5 || tanggal <= 20 && kodeBulan == 6){
			System.out.println("Zodiak Gemini");
		} else if(tanggal >= 21 && kodeBulan == 6 || tanggal <= 22 && kodeBulan == 7){
			System.out.println("Zodiak Cancer");
		} else if(tanggal >= 23 && kodeBulan == 7 || tanggal <= 22 && kodeBulan == 8){
			System.out.println("Zodiak Leo");
		} else if(tanggal >= 23 && kodeBulan == 8 || tanggal <= 22 && kodeBulan == 9){
			System.out.println("Zodiak Virgo");
		} else if(tanggal >= 23 && kodeBulan == 9 || tanggal <= 22 && kodeBulan == 10){
			System.out.println("Zodiak Libra");
		} else if(tanggal >= 23 && kodeBulan == 10 || tanggal <= 21 && kodeBulan == 11){
			System.out.println("Zodiak Scorpio");
		} else if(tanggal >= 22 && kodeBulan == 11 || tanggal <= 21 && kodeBulan == 12){
			System.out.println("Zodiak Sagitarius");
		} else if(tanggal >= 22 && kodeBulan == 12 || tanggal <= 19 && kodeBulan == 1){
			System.out.println("Zodiak Capricorn");
		} else if(tanggal >= 20 && kodeBulan == 1 || tanggal <= 18 && kodeBulan == 2){
			System.out.println("Zodiak Aquarius");
		} else if(tanggal >= 19 && kodeBulan == 2 || tanggal <= 20 && kodeBulan == 3){
			System.out.println("Zodiak Pisces");
		} 

	}
}