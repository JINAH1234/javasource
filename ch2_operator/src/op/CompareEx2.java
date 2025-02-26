public class CompareEx2 {
        public static void main(String[] args) {
    float f1 = 0.1f;
    double d1 = 0.1;
    double d2 = (double)f1;
            //%19.17f : 19자리로 표현하되,소수점 17자리까지나오게

            //자바에선 더블이 기본임 그래야 실수가 오차없이 근접하게 저장이 됨.
            //그래서 더블로 처리하는것이 안전 소수점같은거 할때 더블로하자!

       System.out.printf("10.0 == 10.0f %b\n", 10.0 ==10.f);
       System.out.printf("0.1 == 0.1f %b\n", 0.1 == 0.1f);
       System.out.printf("f1 = %19.17f\n", f1);
       System.out.printf("d1 = %19.17f\n", d1);
       System.out.printf("d2 = %19.17f\n", d2);
       System.out.printf("f1 == d1 %b\n", f1 == d1);
       System.out.printf("d1 == d2 %b\n", d1 == d2);
       System.out.printf("d2 == f1 %b\n", d2 == f1);
       System.out.printf("(Flot)d1 == f1 %b\n",d2 == f1, (float)d1 == f1);
       
}
    
}
