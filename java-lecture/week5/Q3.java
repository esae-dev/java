import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		do{
			System.out.print("양의 정수 입력>>");
			x = scanner.nextInt();
		} while(x <= 0);
		for(int i=x; i>=0; i--) {
			for(int j = i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
