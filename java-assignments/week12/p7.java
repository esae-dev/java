public class p7 {

    public static int solution(int seat, String[][] passengers) {
        int current = 0;

        for (int i = 0; i < passengers.length; i++) {
            for (int j = 0; j < passengers[i].length; j++) {
                if (passengers[i][j].equals("On")) {
                    current++;
                } else if (passengers[i][j].equals("Off")) {
                    current--;
                }
            }
        }

        return seat - current;
    }

    public static void main(String[] args) {
        int seat = 5;
        String[][] passengers = {
                {"On", "On", "On"},
                {"Off", "On", "-"},
                {"Off", "-", "-"}
        };

        int result = solution(seat, passengers);
        System.out.println(result);   // 3
    }
}
