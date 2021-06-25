/**
 * Contoh dengan penerapan ISP
 * 
 * Interface dipecah menjadi 3, dengan 2 pilihan service dan 1 service umum (yang harus di implementasikan). 
 * 
 */

package with_isp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

interface RegularService{
		void codFeature(boolean isCOD); // pengiriman tipe reguler 
}

interface InstantService{
		void deliveryTime(boolean isMorning); // pengiriman tipe instant (same day)
}

interface ExpedisiService{
		void expedisiName();
		void amount();
		void arrivalDate();
}

class Gojek implements InstantService, ExpedisiService{

		@Override
		public void expedisiName() {
				System.out.println("Pengiriman dengan Gojek");
		}

		@Override
		public void amount() {
				System.out.println("Ongkir: 30000");
		}

		@Override
		public void arrivalDate() {
				System.out.println(java.time.LocalDate.now());
		}

		@Override
		public void deliveryTime(boolean isMorning) {
				if(isMorning == true) {
						System.out.println("Paket akan diantar pagi hari");
				}else {
						System.out.println("Paket akan diantar sore hari");
				}
		}
}

class JNT implements RegularService, ExpedisiService{

		@Override
		public void expedisiName() {
				System.out.println("Pengiriman dengan JNT");
		}

		@Override
		public void amount() {
				System.out.println("Ongkir: 7000");
		}

		@Override
		public void arrivalDate() {
				System.out.println(java.time.LocalDate.now().plusDays(3).toString());
		}

		@Override
		public void codFeature(boolean isCOD ) {
				// TODO Auto-generated method stub
				if(isCOD == true) {
						System.out.println("Pembayaran dengan COD");
				}else {
						System.out.println("Pilih Metode Pembayaran");
				}

		}

}
