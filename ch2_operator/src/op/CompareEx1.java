public class CompareEx1 {
        public static void main(String[] args) {
    //비교 연산자 : 결과가 true or false
    //대소비교 : <, > , <=, >=
    //등가비교 : ==(같다), != (다름)
    // \t 는 (tab)한번 눌러
    //%b 는 불린 값 출력하기위한 출력문
    // 두변수의 타입이 다른경우 타입을 맞춘후 비교

    System.out.printf("10 == 10.0f \t %b\n", (10==10.0f));
    System.out.printf("'0' == 0 \t %b\n", ('0' == 0 ));//문자 0 = 48 그래서 48이랑 0이랑 같냐고 물어
    System.out.printf("'A' == 65 \t %b\n", ('A' == 65));//65 == 65
    System.out.printf("'A' > 'B' \t %b\n", ('A' > 'B')); //65 > 66
    System.out.printf("'A'+1 != 'B' \t %b\n", ('A'+1 != 'B'));//65+1 1= 66
}
    
}
