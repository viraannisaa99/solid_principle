/**
 * Contoh tanpa OCP
 * Setiap ada penambahan shipping baru, harus langsung diubah 
 * di dalam ShippingService menggunakan logika percabangan
 */

package no_ocp;

public class Product {
		int price;
		int weight;

		public Product(int price, int weight) {
				this.price = price;
				this.weight = weight;
		}
}

class ShippingService {
		public void checkout(Product product, ShippingType type) {
				int ship_rate = 0;
				int amount = (ship_rate * product.weight) + product.price;

				switch (type) {
				case JNE:
						ship_rate = 25000;
						System.out.println(amount);
						break;

				case JNT:
						ship_rate = 25000;
						System.out.println(amount);
						break;

				default:
						throw new IllegalArgumentException("Unsupported shipping type");
				}
		}
}

enum ShippingType {
		JNE, JNT
}