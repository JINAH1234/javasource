package Condition;

import java.util.Scanner;

// 특정 조건을 만족하면 문장 실행
// if(조건문){}

//특정조건을 만족하면 구문1 실행 만족하지 않을 시 구문2 실행
//if(조건문){구문1}else{구문2}



public class IfTest4 {
    public static void main(String[] args) {
      
       // score 점수를 입력받아     
       //score가 >= 90 크면  등급은 A입니다. if
       //score가 >= 80 크면  등급은 B입니다. else if
       //score가 >= 70 크면  등급은 C입니다. else if
       //score가 >= 60 크면  등급은 D입니다. else if
       //score가 < 60 크면  등급은 F입니다.  else
       

       Scanner scanner = new Scanner(System.in);
       System.out.println("점수입력");

       String input = scanner.nextLine();

       int score = Integer.parseInt(input);

       if (score >= 90) {
        System.out.println("등급 A");

       } else if(score>= 80) {
        System.out.println("등급 B");
  
       } else if(score>= 70) {
        System.out.println("등급 C");

       }else if(score>= 60) {
        System.out.println("등급 D");

       }else {
         System.out.println("등급 F");
       }

       scanner. close();
    }
}
