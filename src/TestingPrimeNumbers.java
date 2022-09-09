
public class TestingPrimeNumbers {

	public static void main(String[] args) {

		int min = 1, max = 100;
		while (min < max) {
		boolean count = false;
		for(int i = 2; i <= min/2; ++i) {
		// condition for nonprime number
		if(min % i == 0) {
		count = true;
		break;
		}
		}
		if (!count)
		System.out.print(min + " ");
		++min;
		}
		}
}



