package op;

public class ArthmetixEx1 {
    public static void main(String[] args) {
       //변수 선언 - int a(10),b(4)
       int a=10, b=4;

       // 나머지값은 처리안하고 몫만

       System.out.printf("%d + %d = %d\n", a, b, a+b);
       System.out.printf("%d - %d = %d\n", a, b, a-b);
       System.out.printf("%d * %d = %d\n", a, b, a*b);
       System.out.printf("%d / %d = %d\n", a, b, a/b);
       //타입이 다른경우 큰쪽으로 변환되어 연산이됨

       System.out.printf("%d / %f = %f\n", a, (float)b, a/(float)b);



  }
    
}
