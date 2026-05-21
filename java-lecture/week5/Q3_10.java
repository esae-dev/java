
public class Q3_10 {

	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2} };
		double Sum = 0;
		for(int year = 0; year<score.length; year++)
			for(int term=0; term<score[year].length; term++)
				Sum += score[year][term];
		int n = score.length;
		int m = score[0].length;
		System.out.println("4년 전체 평점 평균은 " + Sum/(n*m));

	}

}
