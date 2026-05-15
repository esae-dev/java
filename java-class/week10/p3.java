import java.util.Scanner;
public class p3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int answer = 0;
		
		while(number>0) {
			answer += number % 100;
			number /= 100;
		}

		System.out.println(answer);
	}

}
