package ch1;

// 변수의 유효범위
//블럭 안에서 {} 선언 된 변수는 {}벗어난 곳에서 사용 불가

public class ScopeEx1 {
    public static void main(String[] args) {
        
        int a = 100;

        {
            int x = 10;
            System.out.println("x="+x);
        }

            //System.out.println("x="+x);
            System.out.println("a="+a);

        if (a < 200) {
            int sum = 0;
        }  
       // System.out.println(sum);  

        for (int i = 0; i < args.length; i++) {
            sum += i;
            
        } 
        //System.out.println(i);

        System.out.println("1~10까지의 합"+sum);

        //1~100까지 수 중에서 3의 배수 출력

        

    }
}
