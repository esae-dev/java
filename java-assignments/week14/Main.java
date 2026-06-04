import java.util.Scanner;

public class Main {
    //메인
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("[ 본인 소개와 친구정보목록_계산기프레임_성적관리 ]");
            System.out.println();
            System.out.println("1. 자기 소개");
            System.out.println("2. 파일의 목록 추가");
            System.out.println("3. 파일의 목록 출력");
            System.out.println("4. 파일의 목록 삭제");
            System.out.println("5. 파일의 목록 검색");
            System.out.println("6. 계산기 프레임");
            System.out.println("7. 학생 성적관리");
            System.out.println("8. 끝내기");
            int x = scanner.nextInt();
            System.out.println();

            
            if(x == 1) {
                Introduce introduce = new Introduce();
                introduce.printIntro();
            }
            if(x == 2) {
                
            }
            if(x == 8) {
                break;
            }

            System.out.println();
        }
        
    }   
}
