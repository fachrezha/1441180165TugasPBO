class testMobil {
	public static void main(String[] args) {
		mobil rezha = new mobil();

		System.out.println("merk		=" +rezha.getmerk());
		System.out.println("platNomor	=" +rezha.getplatNomor());
		System.out.println("warna 		=" +rezha.getwarna());
		System.out.println("mesin		=" +rezha.getmesin() +"cc");
		System.out.println("kecepatan	=" +rezha.getkecepatan() +"km");
		rezha.maju();
		System.out.println(" ");	

	 mobil akbar = new mobil("Chevrolet","M4558AR");

		System.out.println("merk		=" +akbar.getmerk());
		System.out.println("platNomor	=" +akbar.getplatNomor());
		akbar.mundur();
		System.out.println(" ");


	mobil ardy = new mobil("LykanSport","M4554RD","Merah");

		System.out.println("merk		=" +ardy.getmerk());
		System.out.println("platNomor 	=" +ardy.getplatNomor());
		System.out.println("warna  		=" +ardy.getwarna());
		ardy.berhenti();
		System.out.println(" ");


	mobil hasan = new mobil("MiniChoper","H45AN","Hitam",1200);

		System.out.println("merk		=" +hasan.getmerk());
		System.out.println("platNomor 	=" +hasan.getplatNomor());
		System.out.println("warna  		=" +hasan.getwarna());
		System.out.println("mesin   	=" +hasan.getmesin() +"cc");
		hasan.belok();
		System.out.println(" ");

	mobil dan = new mobil("Gallardo","D4N","Biru",2000,135);

		System.out.println("merk		=" +dan.getmerk());
		System.out.println("platNomor 	=" +dan.getplatNomor());
		System.out.println("warna  		=" +dan.getwarna());
		System.out.println("mesin   	=" +dan.getmesin() +"cc");
		System.out.println("kecepatan	=" +dan.getkecepatan() +"km"); 
		dan.ngebut();
		System.out.println(" ");
	

	
}
}