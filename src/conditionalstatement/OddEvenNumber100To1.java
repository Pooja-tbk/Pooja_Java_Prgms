package conditionalstatement;

public class OddEvenNumber100To1 {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("even number " + i);
			} else {
				System.out.println("odd number " + i);
			}
		}
	}
}
