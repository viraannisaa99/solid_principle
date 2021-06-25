/**
 * Contoh dengan penerapan LSP
 */

package with_lsp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

abstract class Product {
		abstract String productName();

		public void getProductInfo() {
				System.out.println("Product Name: " + productName());
		}
}

/**
 * Buat abstract khusus untuk class produk yang memiliki expired date, 
 */
abstract class ProductWithExpired extends Product{
		abstract Date expiredDate(String date);

		public void getExpiredInfo() {
				System.out.println("Expired Date: " + expiredDate("2021-06-25"));
		}
}

/**
 * Inherit dengan abstract ProductWithExpired,
 * karena snack memiliki tanggal expired 
 */

class Snack extends ProductWithExpired {

		@Override
		String productName() {
				return "Beng-beng Max";
		}

		@Override
		Date expiredDate(String date) {
				Date productDate = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd",  Locale.ENGLISH);

				try {
						productDate = dateFormat.parse(date);
				}catch(ParseException e){
						e.printStackTrace();
				}
				return productDate;
		}
}

/**
 * Inherit dengan abstract Product saja,
 * karena computer tidak memiliki tanggal expired 
 */

class Computer extends Product {
		@Override
		String productName() {
				return "ASUS ROG Zephyrus G15";
		}
}