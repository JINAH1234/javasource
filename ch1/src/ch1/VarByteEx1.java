package ch1;


// byte=8비트 : 정수형이 여러개로 나뉜이유는 공간차지비율이 다르기 때문
//숫자 표현 : 8비트 => 2의8 => 256, 음수부터 표현 256/2 => -128~127까지 표현가능

public class VarByteEx1 {
    public static void main(String[] args) {
        //변수
        //기본타입 : 정수형,문자형,실수형,불린형
        //정수형: byte(1), short(2),int(4), long(8)
        //문자형:char(2)
        //실수형:flot(4), double(8)
        //불린형:boolean(1)

        // 상수 : 값을 한번만 저장
        // 타입 상수명 : 값; final int MAX_VALUE = 100;


        //변수선언 : 타입 변수명 = 값;
        //변수명: 단어 2개 조합이 되는 경우 뒷 단어의 시작은 대문자로 시작
        //max-speed : 데이터 베이스 필드명
        //shift + art + 화살표아래 = 복사
        //ln이 있어야 값이 제대로 나옴 (엔터라는뜻)

        byte age = 15, maxSpeed = 100;
        //byte max = 256;

        // System.out.println(age);
        // System.out.println(maxSpeed);
        // + = 산술연산이지만 문자랑 붙을땐 연결의 의미로 사용 되기도 함

        System.out.println("나이 : "+age + ", 최고속도 :" + maxSpeed);
        System.out.printf(skdl : %d, 최고속도  : %d\n",age,maxspeed);
        
        System.out.println(age + maxSpeed);

    }
}
