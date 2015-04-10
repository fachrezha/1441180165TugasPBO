class testcircle{
	public static void main(String[] args) {
		//instansiasi objek
		//namaClass namaObjek=namaKonstuktor
		circle cahya = new circle();
		circle ardi = new circle(30,"BLUE");
		circle rio = new circle(30,"AbangGalau");

		System.out.println("Radius="+cahya.getRadius+"color="+cahya.getColor+"Luas="+cahya.getArea()); 
		System.out.println("Radius="+ardi.getRadius+"color="+ardi.getColor+"Luas="+ardi.getArea());
		System.out.println("Radius="+rio.getRadius+"color="+rio.getColor+"Luas="+rio.getArea());
	}
}