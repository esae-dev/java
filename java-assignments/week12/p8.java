public class p8 {

    public static String solution(String nickname) {
        // 1. 소문자 l -> 대문자 I
        nickname = nickname.replace("l", "I");

        // 2. 소문자 w -> vv
        nickname = nickname.replace("w", "vv");

        // 3. 대문자 W -> VV
        nickname = nickname.replace("W", "VV");

        // 4. 대문자 O -> 숫자 0
        nickname = nickname.replace("O", "0");

        // 5. 길이가 4 미만이면 o를 붙여서 4까지 맞추기
        while (nickname.length() < 4) {
            nickname += "o";
        }

        // 6. 길이가 8 초과면 8글자까지만 사용
        if (nickname.length() > 8) {
            nickname = nickname.substring(0, 8);
        }

        return nickname;
    }

    public static void main(String[] args) {
        System.out.println(solution("WORLDworld")); // VV0RLDvv
        System.out.println(solution("GO"));         // G0oo
    }
}