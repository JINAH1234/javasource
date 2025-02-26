package Condition;

import java.util.Scanner;

// 특정 조건을 만족하면 문장 실행
// if(조건문){}

//특정조건을 만족하면 구문1 실행 만족하지 않을 시 구문2 실행
//if(조건문){구문1}else{구문2}



public class IfTest5 {
    public static void main(String[] args) {
      //주사위 1~6
      //실행할때마다 랜던값
      //0.0 <= Math.random() < 1.0
      System.out.println(Math.random());

      //(Math.random() * 6) : 0~5 + 1
      int num = (int)(Math.random() * 6) + 1;

      //num 이 1이면 주사위 1번이 나왔습니다.

      if (num == 1) {
      System.out.println("주사위 1번");
      } else if(num ==2){
        System.out.println("주사위 2번");
        
      }else if(num ==3){
          System.out.println("주사위 3번");

      } else if(num ==4){
      System.out.println("주사위 4번");

     }else if(num == 5){
      System.out.println("주사위 5번");
  } else{
    System.out.println("주사위 6번");
  } 



    }
}
