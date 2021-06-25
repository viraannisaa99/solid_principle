/**
 * Contoh dengan penerapan OCP
 * batasi kebutuhan untuk mengubah kode yang telah ditulis dengan menggunakan interface. 
 * Jadi kita suatu saat akan menambahkan jenis baru (misalnya trapesium),
 * cukup buat satu class yang mengimplement interface BangunDatar dan tidak perlu mengubah kode
 * yang ada di class LuasBangun.
 * 
 */

package with_ocp;

public interface BangunDatar{
		public double hitungLuas();
}

class PersegiPanjang implements BangunDatar{

		private final double lebar;
		private final double panjang;

		public PersegiPanjang(double lebar, double panjang){
				this.lebar = lebar;
				this.panjang = panjang;
		}

		@Override
		public double hitungLuas(){
				return this.lebar * this.panjang;
		}
}

class Persegi implements BangunDatar{

		private final double sisi;

		public Persegi(double sisi){
				this.sisi = sisi;
		}

		@Override
		public double hitungLuas(){
				return this.sisi * this.sisi;
		}
}

class Lingkaran implements BangunDatar{

		public static final double PI = 3.1416;
		private final double radius;

		public Lingkaran(double radius){
				this.radius = radius;
		}

		@Override
		public double hitungLuas(){
				return (Lingkaran.PI * (this.radius * this.radius));
		}
}

class LuasBangun {

		public double hitungLuas(BangunDatar bangunDatar){
				return bangunDatar.hitungLuas();
		}    
}

