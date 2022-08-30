package sample;

public class DiamondPattern {
	public static void main(String[] args) {
		int i = 1;
		int j;
		int n = 3;
		while (i <= n) {
			j = 1;
			while (j++ <= n - i)

			{
				System.out.print(" ");

			}
			j = 1;
			while (j++ <= i * 2 - 1)

			{
				System.out.print("*");

			}

			System.out.println();
			i++;
		}
		i = n - 1;
		while (i > 0) {
			j = 1;
			while (j++ <= n - i)

			{
				System.out.print(" ");

			}
			j = 1;
			while (j++ <= i * 2 - 1)

			{
				System.out.print("*");

			}

			System.out.println();
			i--;
		}

	}
}
