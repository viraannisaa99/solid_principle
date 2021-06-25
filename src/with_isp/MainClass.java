package with_isp;

public class MainClass {

		public static void main(String[] args) {
				Gojek gojek = new Gojek();

				gojek.expedisiName();
				gojek.amount();
				gojek.arrivalDate();
				gojek.deliveryTime(true);

				System.out.println();

				JNT jnt = new JNT();
				jnt.expedisiName();
				jnt.amount();
				jnt.arrivalDate();
				jnt.codFeature(true);
		}
}
