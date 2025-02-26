package op;

public class ArthmetixEx2 {
    public static void main(String[] args) {
       //변수 선언 - int a(10),b(4)
       byte a=10, b=4;
       // byte ,short 연산수행시 연산의 결과가 int로 변경됨

      //byte c = a + b;

      // 해결책1 인트로 변환하면 됨
      // int c = a + b;
      //해결책2  127 안 넘을 때 사용가능
      byte c =(byte)(a +b);


  }
    
}
