package loop;

// 반복문 -  for , while, do-while
// 반복적으로 실행해야 하는 코드 

// 안녕하세요 10번 출력하고 싶다! System.out.println("안녕하세요!"); x 10
//간단하게 처리할 방법은 방법문을 활용

public class ForEx3 {
    public static void main(String[] args) {
    
        //1~10까지의 합을 구하기

        int sum = 0;

        for (int i = 1; i < 11; i++) {
            sum +=i;
        }
        System.out.println("1~10 까지의 합"+sum);

        //1~100 까지 수 중에서 3의 배수 출력
        for (int i = 1; i < 101; i++) {
            if(i % 3 == 0){
                System.out.println(i + "\t");
            }
        }
       
       
    }
}