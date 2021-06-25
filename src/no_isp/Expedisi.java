package no_isp;

interface Expedisi{
		void expedisiName();
		void amount();
		void arrivalDate();
		void codFeature(boolean isCOD);
		void deliveryTime(String time);
}

class Gojek implements Expedisi{

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
		public void deliveryTime(String time) {
				if(time == "Pagi") {
						System.out.println("Paket akan diantar pagi hari");
				}else {
						System.out.println("Paket akan diantar sore hari");
				}
		}

		@Override
		public void codFeature(boolean isCOD) {
				// gojek adalah pengriman instant
				// seharusnya method ini tidak perlu, karena gojek tidak dapat COD
		}
}

class JNT implements Expedisi{

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
		public void codFeature(boolean isCOD) {
				// TODO Auto-generated method stub
				if(isCOD == true) {
						System.out.println("Pembayaran dengan COD");
				}else {
						System.out.println("Pilih Metode Pembayaran");
				}

		}

		@Override
		public void deliveryTime(String time) {
				// JNT masuk ke tipe pengiriman reguler
				// seharusnya method ini tidak perlu, karena service reguler tidak dapat memilih waktu pengiriman
		}

}