package with_ocp;

public class MainClassProduct {

		int harga;

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Product product = new Product(300000, 1);
				TIKI shipping = new TIKI();
				ShippingService total = new ShippingService();

				total.checkout(product, shipping);
		}

}
