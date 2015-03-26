import java.util.Scanner;

public class  satu {
	public static void main(String[] args) {
		Scanner masukan = new Scanner (System.in);
		System.out.println("Masukkan Tinggi Badan :");
		int angka = masukan.nextInt ();

		if (angka < 100) 
			System.out.println("Tidak Memenuhi Syarat");
		else {
			System.out.println("Memenuhi Syarat");
		}	
	}
	
}