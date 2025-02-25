package ch1;

public class VarCharEx1 {
    
    public static void main(String[] args) {


    //문자: 글자 한개'ㅁ', '웅', 공백도 문자
    //문자열: 글자 한개 ~ 여러개=> "응", "ㅁㅇㄹ","  (공백두개)"

    //기 라는 문자를 ch1에 대입
    char ch1 = '기';

    //ch1의 값을 unicode 변수에 대입
    //int=char

    int unicode = ch1;
    
    System.out.println("ch1 +"+ch1);
    System.out.println("unicode = "+unicode); 

    char ch2 = 'a';
    unicode = ch2;
    System.out.println("ch2 = "+ch2);
    System.out.println("unicode = "+unicode); // 97

    char ch3 = 'A';
    unicode = ch3;
    System.out.println("ch3 = "+ch3);
    System.out.printf("ch3 = %c\n",ch3);
    System.out.println("unicode = "+unicode); // 65
}
    
}
