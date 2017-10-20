public class CheckerBoard2 {
	public static void main (String[] args) {
		for (int row = 8; row >= 0; row--) {
			for (int column = row; column >= 0; column--) {
					System.out.print("# ");
			}
			System.out.print("\n");
		}
	}
}