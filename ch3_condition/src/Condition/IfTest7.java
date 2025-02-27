package Condition;

import java.util.Scanner;


// if(조건문){}
//중첩가능




public class IfTest7 {
    public static void main(String[] args) {
      //num1이라는 변수 선언 후 임의의 값 담기

      // num1 이 짝수, 홀수인지 출력하기

      // 다른 예제 ) 사용자로부터 입력을 받아 num1 이라는 변수에 담고 <아래 코드 사용하면됨>
       // Scanner scanner = new Scanner(System.in);
       // System.out.println("점수 입력");
       // String input = scanner.nextLine();
       // int num1 = Integer.parseInt(input);
        
      int num1 = 25;

      if (num1 % 2 == 0) {
        System.out.println("짝수");
      } else{
        System.out.println("홀수");
      }
    }
  }
