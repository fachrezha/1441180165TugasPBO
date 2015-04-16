class testTabungan {
	public static void main(String[] args) {
		tabungan rezha = new tabungan();

		System.out.println("simpanan 	=" +rezha.setsimpanan());
		System.out.println("pemilikRek 	=" +rezha.setpemilikRek());
		System.out.println("noRek 		=" +rezha.getnoRekening());
		System.out.println("bunga 		=" +rezha.getbunga());
		rezha.menabung();
		System.out.println(" ");




tabungan akbar = new tabungan("AkbarYusrofi","Mandiri");

		System.out.println("simpanan 	=" +akbar.setsimpanan());
		System.out.println("pemilikRek 	=" +akbar.setpemilikRek());
		akbar.mengambil();
		System.out.println(" ");



tabungan dan = new tabungan("Bagaswara","BRI",144118069);
		
		System.out.println("simpanan 	=" +dan.setsimpanan());
		System.out.println("pemilikRek 	=" +dan.setpemilikRek());
		System.out.println("noRek 		=" +dan.getnoRekening());
		dan.transfer();
		System.out.println("");



tabungan adam = new tabungan("Fakhrial","BNI",1441180166,70);

		System.out.println("simpanan 	=" +adam.setsimpanan());
		System.out.println("pemilikRek 	=" +adam.setpemilikRek());
		System.out.println("noRek 		=" +adam.getnoRekening());
		System.out.println("bunga 		=" +adam.getbunga());
		adam.menerimaTransfer();
		System.out.println(" ");
	





	}

}