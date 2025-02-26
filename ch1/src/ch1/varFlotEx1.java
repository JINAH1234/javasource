package ch1;

public class varFlotEx1 {public static void main(String[] args) {
    //실수형 :  Flot, double
    //소수점 형태의 숫자를 사용하면 double 로 인식
    //float(4byte 사용) = double (8byte 사용) => 안돼 
    //float 은 f,F 를 붙임
    float score1 = 90.14f;
     // double 타입도 d,D를 붙임
    double score2 = 98.5d;
    System.out.println("score1 = " +score1);
    System.out.println("score2 = " +score2);
    //소수점 2째자리까지 표현
    System.out.printf("score2 = %f\n",score2);

}
    
}
