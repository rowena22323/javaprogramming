package kcci.array_A;

public class enhanced_For {
	public static void main(String[]args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		/* ���� �� 1 */
		for (int inx=0;inx < arr.length;inx++) {
			System.out.println(arr[inx]);
		}
		System.out.println();
		
		/* ���� �� 2 */
		for(int a : arr) {
			System.out.println(a);
		}
		System.out.println();
		
		/* String array */
		String[] strs= {"�̼���","ȫ�浿","������"}; // (FIFO)
		for (String nm:strs) {
			System.out.println(nm);
		}
	}
}
