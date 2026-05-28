public class p9 {

    public static void main(String[] args) {
        int[] wallet1 = {30, 15};
        int[] bill1 = {26, 17};

        int[] wallet2 = {50, 50};
        int[] bill2 = {100, 241};

        System.out.println(solution(wallet1, bill1)); // 1
        System.out.println(solution(wallet2, bill2)); // 4
    }

    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while (!canFit(wallet, bill)) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }

            answer++;
        }

        return answer;
    }

    public static boolean canFit(int[] wallet, int[] bill) {
        boolean normal = bill[0] <= wallet[0] && bill[1] <= wallet[1];
        boolean rotated = bill[0] <= wallet[1] && bill[1] <= wallet[0];

        return normal || rotated;
    }
}