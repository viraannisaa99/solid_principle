/**
 * Contoh tanpa penerapan LSP
 * semua method yang ada di superclass harus ada di subclass walaupun tidak diperlukan
 */

package no_lsp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

abstract class Product {
		abstract String productName();
		abstract Date expiredDate(String date);

		public void getProductInfo() {
				System.out.println("Product Name: " + productName());
				System.out.println("Expired Date: " + expiredDate("2021-06-25"));
		}
}

class Snack extends Product {

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

class Computer extends Product {

		@Override
		String productName() {
				return "ASUS ROG Zephyrus G15";
		}

		// seharusnya, method ini tidak ada karena computer tidak memiliki kadaluarsa
		// namun tetap dibuat karena harus mewarisi seluruh method superclass, kalau tidak akan error

		@Override
		Date expiredDate(String date) {
				return new Date();
		}
}