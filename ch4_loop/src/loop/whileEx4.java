package loop;

public class whileEx4 {
    public static void main(String[] args) {
        //구구단 출력
        for (int i = 1; i < 10; i++) {
            System.out.printf("7 * %d = %d = %d\n",i,(7 * i));
        }

        int i = 1;
        while (i < 10) {
            
            System.out.printf("7 * %d = %d = %d\n",i,7 * i);
            i++;
        }
    }
}
