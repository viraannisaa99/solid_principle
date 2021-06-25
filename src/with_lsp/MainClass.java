package with_lsp;

public class MainClass {

		public static void main(String[] args) {
				Snack snack = new Snack();
				Computer computer = new Computer();

				snack.getProductInfo();
				snack.getExpiredInfo();

				computer.getProductInfo();
		}

}
