package with_ocp;

public class MainClassBangun {

		public static void main(String[] args) {
				LuasBangun luas = new LuasBangun();
				Persegi Persegi = new Persegi(3.15);
				PersegiPanjang PersegiPanjang = new PersegiPanjang(7.85, 10.85);
				Lingkaran Lingkaran = new Lingkaran(7.98);

				System.out.println("Luas Persegi: " + luas.hitungLuas(Persegi));
				System.out.println("Luas Persegi Panjang: " + luas.hitungLuas(PersegiPanjang));
				System.out.println("Luas Lingkaran:" + luas.hitungLuas(Lingkaran));
		}

}
