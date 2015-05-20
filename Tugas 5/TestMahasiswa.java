public class TestMahasiswa{
	public static void main(String[] args) {
		mahasiswa mhs = new mahasiswa("Fachrezha Izzano Kinan", 19);

		mhs.tampilkanBiodata();
		
		System.out.println("");

		mhs.setUmur(25);
		mhs.tampilkanBiodata();
	}
}