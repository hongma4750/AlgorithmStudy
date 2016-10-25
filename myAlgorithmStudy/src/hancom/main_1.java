package hancom;

public class main_1 {
 

	public static void main(String args[]) {
		int lineNumber = 6;


		for (int i = 1; i <= lineNumber; i++) {


			for (int j = 1; j <= lineNumber - i; j++) {
				System.out.print(" ");
			}


			if (i == lineNumber) {
				System.out.print((i * 2) - 3);
				for (int y = 0; y < (i * 2) - 3; y++) {
					System.out.print(y);
				}
				System.out.print((i * 2) - 3);
			} else {
				if (i == 1)
					System.out.println("0");
				else {
					System.out.print((i * 2) - 3);
					for (int y = 0; y < (i * 2) - 3; y++) {
						System.out.print(" ");
					}
					System.out.println((i * 2) - 2);
				}
			}
		}
	}
}
