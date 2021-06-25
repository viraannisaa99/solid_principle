/**
 * Contoh kedua dengan penerapan OCP
 * 
 * batasi kebutuhan untuk mengubah kode yang telah ditulis dengan menggunakan interface. 
 * Jadi kita suatu saat akan menambahkan shipping service baru (misalnya ID Express),
 * cukup buat satu class yang mengimplement interface Shipping dan tidak perlu mengubah kode
 * yang ada di class Shipping Service.
 * 
 */

package with_ocp;

public class Product {
		int price;
		int weight;

		public Product(int price, int weight) {
				this.price = price;
				this.weight = weight;
		}
}

class ShippingService {
		public void checkout(Product product, Shipping shipping) {
				int costShipping = shipping.calculate(product);
				System.out.println("Total Payment = " + costShipping);
		}
}

abstract class Shipping {
		abstract public int calculate(Product product);
}

class JNE extends Shipping {
		private final int SHIP_RATE = 25000;
		@Override
		public int calculate(Product product) {
				return (SHIP_RATE * product.weight) + product.price;
		}
}

class TIKI extends Shipping {
		private final int SHIP_RATE = 22000;
		@Override
		public int calculate(Product product) {
				return (SHIP_RATE * product.weight) + product.price;
		}
}

class JNT extends Shipping {
		private final int SHIP_RATE = 23000;
		@Override
		public int calculate(Product product) {
				return (SHIP_RATE * product.weight) + product.price;
		}
}

class NinjaExpress extends Shipping {
		private final int SHIP_RATE = 26000;
		@Override
		public int calculate(Product product) {
				return (SHIP_RATE * product.weight) + product.price;
		}
}