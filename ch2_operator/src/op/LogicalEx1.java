public class LogicalEx1 {
    public static void main(String[] args) {
        // 논리 연산자 : 비교 연산자 여러개 연결 => true ,false
        // x가 4보다 작거나 10보다 크다
        //  &&(and), ||(or), !(not)

        //x는 10보다 크고 20보다 작다. (and)
        //x > 10 && x < 20

        //y는 2의 배수 또는 3의 배수이다.(or)
        //y % 2 ==0 || y % 3 == 0


        //Y는 2의 배수 또는 3의 배수이지만, 6의 배수는 아니다.
        // (y % 2 ==0 || y % 3 == 0) && y % 6 != 0
        // 가로를 쳐주지 않으면 &&가 먼저 해석 될 수 있다.
        //가로를 쳐서 우선순위를 주어야 한다.

        int x =0;
        char ch = ' ';

        x = 15;
        //x는 10보다 크고 20보다 작다. (and)
        System.out.printf("x=%2d, 10 < x && x <20 = %b\n", x, 10 < x && x < 20);

        x = 6;
        //Y는 2의 배수 또는 3의 배수이지만, 6의 배수는 아니다.
        System.out.printf("x=%2d, %% 2==0 || x%%3==0 && x%%6!=0 = %b\n", x, (x % 2==0 || x%3==0) && x%6!=0);

        ch = '1';
        //'0'~'9' 사이 숫자인지 확인
        System.out.printf("ch=%c, '0' <= ch && ch <= '9' = %b\n", ch, '0' <= ch && ch <= '9');

        ch = 'a';
        //소문자인지 확인
        System.out.printf("ch=%c, 'a' <= ch && ch <= 'z' = %b\n", ch, 'a' <= ch && ch <= 'z');

        ch = 'A';
        //대문자인지 확인
        System.out.printf("ch=%c, 'A' <= ch && ch <= 'Z' = %b\n", ch, 'A' <= ch && ch <= 'Z');

        ch = 'q';
        //소문자 q 이거나 혹은 대문자 Q 인지 확인
        System.out.printf("ch=%c, ch=='q' || ch == 'Q' = %b\n", ch,  ch=='q' || ch == 'Q');

        System.out.printf("ch=%c, !(ch=='q' || ch == 'Q') = %b\n", ch,  !(ch=='q' || ch == 'Q'));


    }
    
}
