package Condition;

import java.util.Scanner;

// 특정 조건을 만족하면 문장 실행
// if(조건문){}

//특정조건을 만족하면 구문1 실행 만족하지 않을 시 구문2 실행
//if(조건문){구문1}else{구문2}



public class IfTest3 {
    public static void main(String[] args) {
      
       // score 점수를 입력받아     
       //score가 90보다 크면 점수가 90점 이상입니다. 등급은 A입니다. 출력
       //score가 90보다 작으면 점수가 90점 미만입니다. 등급은 B입니다. 출력

       Scanner scanner = new Scanner(System.in);
       System.out.println("점수입력");

       String input = scanner.nextLine();

       int score = Integer.parseInt(input);

       if (score > 90) {
        System.out.println("점수 90점 이상");
        System.out.println("등급 A");
       } else {
        System.out.println("점수 90점 미만");
        System.out.println("등급 B");
  
    }
       scanner. close();
    }
}
