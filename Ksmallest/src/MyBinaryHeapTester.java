import java.util.Scanner;

public class MyBinaryHeapTester<E> {

	public static void main(String[] args) {
		MyBinaryHeap<Integer> mbh = new MyBinaryHeap<>();

//		System.out.println(mbh);
//		mbh.insert(5);
//		System.out.println(mbh);
//		mbh.insert(7);
//		System.out.println(mbh);
//		mbh.insert(31);
//		mbh.insert(25);
//		mbh.insert(11);
//		mbh.insert(3);
//		mbh.insert(1);
//		System.out.println(mbh);
//		mbh.insert(4);
//		System.out.println(mbh.deleteMin());
//		System.out.println(mbh);
//		System.out.println(mbh.deleteMin());
//		System.out.println(mbh);
//		System.out.println(mbh.deleteMin());
//		System.out.println(mbh);
//		
		Scanner scan = new Scanner(System.in);
		problem3 a = new problem3();
		System.out.println("Enter K for k'th smallest");
		int k = scan.nextInt();
		System.out.println("Enter N for numbers");
		int n = scan.nextInt();

		System.out.println(a.findKthSmallest(k, n));

	}

}
