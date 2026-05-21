import java.util.Scanner;
class Triangle {
	int width;
	int height;
	
	public double getArea() {
		return (double)width * height / 2;
	}
}
public class TriApp {

	public static void main(String[] args) {
		Triangle A = new Triangle();
		Scanner scanner = new Scanner(System.in);
		
		A.width = scanner.nextInt();
		A.height = scanner.nextInt();

		System.out.println("삼각형의 면적은 " + A.getArea());
		scanner.close();
	}

}
