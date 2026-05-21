import java.util.Scanner;
public class p2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int angle1 = scanner.nextInt();
		int angle2 = scanner.nextInt();
		
		int sum_angle = (angle1 + angle2)%360;
		System.out.println(sum_angle);

	}

}
