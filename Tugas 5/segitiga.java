public class segitiga{
	//attributes
	int tinggiSegitiga;
	int alasSegitiga;
	int smSegitiga;
	int luasSegitiga;
	int kelilingSegitiga;

	//constructor
	public segitiga(int tinggiSegitigaIn, int alasSegitigaIn, int smSegitigaIn){
		tinggiSegitiga = tinggiSegitigaIn;
		alasSegitiga = alasSegitigaIn;
		smSegitiga = smSegitigaIn;
	}

	//methods
	public void tampilkanProperty(){
		System.out.println("Tinggi 		: " +tinggiSegitiga);
		System.out.println("Alas 		: " +alasSegitiga);
		System.out.println("Sisi miring 	: " +smSegitiga);
	}

	public int luassegitiga(){
		luasSegitiga = (alasSegitiga * tinggiSegitiga) / 2;
		return luasSegitiga;
	}

	public int kelilingsegitiga(){
		kelilingSegitiga = alasSegitiga + tinggiSegitiga + smSegitiga;
		return kelilingSegitiga;
	}		
}