import java.util.Random;

public class problem3 {

	Random rand = new Random();
	MyBinaryHeap<Integer> mbh;
	Integer number[];

	public problem3() {
	}

	// find K'th smallest
	public Integer findKthSmallest(int k, int n) {
		// load random values of N size
		number = new Integer[n];
		for (int i = 0; i < number.length; i++) {
			number[i] = rand.nextInt(100);

		}
		// populate heap in bulk
		mbh = new MyBinaryHeap<Integer>(number);
		mbh.addAll(number);
		System.out.println(mbh + "\nK: " + k + "\n");
		int temp = 0;
		// find K'th smallest
		int i = 0;
		while(i <= k) {
			temp = mbh.deleteMin();
			i++;
		}
		System.out.println(mbh + "\n");
		return temp;
	}

}
