package loop;

public class ForEx5 {
    public static void main(String[] args) {
        // 1~100 수중에서
        // 1) 3의 배수의 합 출력
        int sum = 0;

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
               sum += i;
            }
        }
        System.out.println("1~100 사이의 3배수의 총합"+sum);

        // 2) 3의 배수 더하고 9의 배수는 뺀 합 출력

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 9 != 0) {
                sum += i;
            }
        }
        System.out.println("1~100 사이의 3배수에서 9의 배수 제외한 총합"+sum);

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 || i % 5 != 0) {
                sum += i;
            }
        }
        System.out.println("1~100 사이의 3배수 + 5배수 총합 : "+sum);





    }
}
