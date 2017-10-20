public class CheckerBoard5 {
	public static void main (String[] args) {
		for (int row = 1; row <= 7; row++) {
			for (int column = 1; column <=7; column++) {
				if (column == 1 || column ==7) {
					System.out.print("# ");
				}
				else if (row == 1 || row == 7) {
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