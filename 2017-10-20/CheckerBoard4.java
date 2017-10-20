public class CheckerBoard4 {
	public static void main (String[] args) {
		for (int row = 1; row <= 8; row++) {
			for (int column = 8; column > row; column--) {
					System.out.print("  ");
			}
			for (int column2 = 1; column2 <= row; column2++) {
					System.out.print("# ");
			}
			System.out.print("\n");
		}
	}
}