class laptop {

	 String warna;
	 String merk;
	 String wifi;
	 int baterai;

	 public laptop(){

	  warna		="Hitam";
	  merk		="Toshiba";
	  wifi		="Terhubung";
	  baterai	=50;
	  	
	 }
	 public laptop(String merkInput, String warnaInput){
	 	merk 	=merkInput;
	 	warna   =warnaInput;
	 } 
	 public laptop(String merkInput, String warnaInput, String wifiInput){
	 	merk 	=merkInput;
	 	warna   =warnaInput;
	 	wifi 	=wifiInput;
	 	
	 } 
	 public laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput){
		merk 	=merkInput;
	 	warna   =warnaInput;
	 	wifi 	=wifiInput;
	 	baterai =bateraiInput;

	 }


	public void menyala(){

		System.out.println("Welcome to laptop");
	}
	public void mati(){

		System.out.println("Thankyou have a nice day");
	}
	public void indikatorBaterai(){

		System.out.println("Baterai tinggal : " + baterai + "%");
	}
	public void indikatorwifi()	{
		System.out.println("wifinya : "+wifi);			
	}

	public String getmerk(){
		return merk;
	}
	public String getwarna(){
		return warna;
	}
	public String getwifi(){
		return wifi;
	}
	public int getbaterai(){
		return baterai;
	}
	
}