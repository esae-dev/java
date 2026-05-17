import java.util.Scanner;
public class b6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 0;
		int count = 0;
		
		for(int i=1; i<=9; i++) {
			int number = scanner.nextInt();
			
			max = max > number ? max : number;
			count = i;
		}
		
		System.out.println(max);
		System.out.println(count);
	}
}
