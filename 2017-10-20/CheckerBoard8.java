public class CheckerBoard8 {
	public static void main (String[] args) {
		for (int row = 1; row <= 7; row++) {
			for (int column = 1; column <=7; column++) {
				if (row == 1 || row == 7) {
					System.out.print("# ");
				}
				else if (column == row) {
					System.out.print("# ");
				}
				else if (column == (8-row)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
}