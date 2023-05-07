import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("N Sayısı : ");
		int n = input.nextInt();
		System.out.print("Çıktısı : ");
		createPattern(n, n, -1);
	}

	private static void createPattern(int n, int m, int i) {
		if (i == -1) {
			if (m > 0) {
				System.out.print(m + " ");
				createPattern(n, m - 5, -1);
			}
			else createPattern(n, m, 1);
		}
		else {
			if (m <= n) {
				System.out.print(m + " ");
				createPattern(n, m + 5, 1);
			}
		}
	}


}
