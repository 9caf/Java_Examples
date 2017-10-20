public class CheckerBoard3 {
	public static void main (String[] args) {
		for (int row = 1; row <= 8; row++) {
			for (int column = 1; column < row; column++) {
					System.out.print("  ");
			}
			for (int column2 = 0; column2 <= (8-row); column2++) {
					System.out.print("# ");
			}
			System.out.print("\n");
		}
	}
}