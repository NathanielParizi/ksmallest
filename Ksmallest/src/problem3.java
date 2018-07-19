import java.util.Random;

public class problem3 {

	Random rand = new Random();
	MyBinaryHeap<Integer> mbh;
	Integer number[];

	public problem3() {
	}

	// find K'th smallest
	public Integer findKthLargest(int k, int n) {
		// account for natural numbers
		k = k + 1;
		// load random values of N size
		number = new Integer[n];
		for (int i = 0; i < number.length; i++) {
			number[i] = rand.nextInt(100);

		}
		// populate heap in bulk
		mbh = new MyBinaryHeap<Integer>();
		mbh.addAll(number);
		System.out.println(mbh + "\nK: " + k + "\n");
		int temp = 0;
		// find K'th smallest
		for (int i = 0; i <= k; i++) {
			temp = mbh.deleteMin();
			i++;
		}
		System.out.println("****************************\n" + mbh + "\n********************************\n");
		return temp;
	}

}
