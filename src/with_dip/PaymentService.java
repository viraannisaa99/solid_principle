package with_dip;

/**
 * Class PaymentService adalah high-level module,
 * yang berisi fungsionalitas / business logic dari pembayaran
 */

public class PaymentService {
		private Database database;

		public PaymentService(Database database) {
				this.database = database;
		}

		void paymentIsValid() {
				// Implementation code
		}

		void openDatabase() {
				// Implementation code
		}

		void addNewPayment() {
				// Implementation code
		}

		void removePaymentByID() {
				// Implementation code
		}

		void updatePaymentByID() {
				// Implementation code
		}
}

/**
 * Untuk menerapkan DIP, PaymentService tidak boleh bergantung langsung 
 * dengan MySQLDatabase, dan MongoDatabase, melainkan harus 
 * bergantung dengan abstract Database
 */

abstract class Database {
		abstract void insert();
		abstract void update();
		abstract void delete();
}

/**
 * Class MySQLDatabae dan Mongo adalah low-level module,
 * yang berisi kode yang lebih detail
 */

class MySQLDatabase extends Database {

		@Override
		void insert() {
				// Implementation code
		}
		@Override
		void update() {
				// Implementation code
		}
		@Override
		void delete() {
				// Implementation code
		}
}

class MongoDatabase extends Database {
		@Override
		void insert() {
				// Implementation code
		}
		@Override
		void update() {
				// Implementation code
		}
		@Override
		void delete() {
				// Implementation code
		}
}