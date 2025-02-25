package op;

// 증감 연산자 : 간단하게 처리 
// ++ -- :변수앞 (전위), 변수 뒤 (후위)
// 전위던 후위던 단독으로 코드를 쓴경우 결과 동일
// 다른수식 포함된 경우,메서드의 매개변수에 사용되는경우 (단독사용되지않는경우)
//=> 결과가 다르다  
//
public class IncDecOperEx1 {
    public static void main(String[] args) {
    int num = 10;

    //num = num + 1;
    //num++;
    ++num;
    System.out.println("num = "+num);

    //num = num - 1;
   // num--;
   --num;
    System.out.println("num = "+num);

    int num2 = 20;
    //++num2
    //① num2+1 을 먼저 한 후 대입 사용
    //---------------------------------
    //num2++
    //②num2 사용
    //num2 + 1 을 함
    System.out.println("num2 = " + (++num2));
    }
}
