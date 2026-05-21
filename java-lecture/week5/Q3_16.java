
public class Q3_16 {

	public static void main(String[] args) {
		int[] A = new int[5];
		A[0] = 0;
		try {
			for (int i=0; i<5; i++) {
				A[i+1] = i+i + A[i];
				System.out.println("A[" +i+ "]" + "=" + A[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}
