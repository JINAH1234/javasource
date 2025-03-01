package loop;

// 반복문 -  for , while, do-while
// 반복적으로 실행해야 하는 코드 

// 안녕하세요 10번 출력하고 싶다! System.out.println("안녕하세요!"); x 10
//간단하게 처리할 방법은 방법문을 활용

public class ForEx2 {
    public static void main(String[] args) {
        System.out.println();

        // 반복문 중단 : 강제중단 (break) or 조건이 false
        // 1) int i = 0 (초기화 상태라 한번만 실행)
        // 2) 조건검사 i < 5;
        // 3) 루프 안으로 진입 - 안녕하세요 출력
        // 4) 증감연산자 실행 i ++ (i=1)
        // 5) 조건검사
        // 6) loop 안으로 진입 - 안녕하세요 출력
        // 7) 증감연산자 실행 i ++ (i=2)
        // 8) 5) ~ 7) 반복
        // -----증감 연산자 실행 i ++ (i=5)
        // -----조건 검사 5 < 5 루프 중단
        for (int i = 1; i < 11; i++) {
            System.out.println(i + "   ");
        }
        System.out.println();

        // 10 ~1
        for (int i = 10; i > 0; i--) {
            System.out.println(i + "   ");
        }

        //짝수만 출력 1~10
        for (int i = 1; i < 11; i--) {
            //i가 짝수면 출력
            if (i % 2 == 0) {
                System.out.println(i + "   ");
            }
           
        }

        System.out.println();

        for(int i = 2; i <11; i+=2){
            System.out.println(i + "   ");
        }

    }
}