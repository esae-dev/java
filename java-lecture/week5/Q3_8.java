import java.util.Scanner;
public class Q3_8 {

	public static void main(String[] args) {
		int A[] = new int[5];
		int Sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(A.length + "개의 정수를 입력하세요>> ");
		for(int i=0; i<A.length; i++) A[i] = scanner.nextInt();
		for(int i=0; i<A.length; i++) Sum += A[i];
		
		System.out.print("평균은 " + (double)Sum/A.length);
		scanner.close();
	}

}
