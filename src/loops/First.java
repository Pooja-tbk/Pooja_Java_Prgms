package loops;

public class First {
	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " : is even number");
			} else {

				System.out.println(i + " : is odd number");
			}

		}
	}
}