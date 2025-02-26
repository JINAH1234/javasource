package op;

public class ArthmetixEx3 {
    public static void main(String[] args) {
      char c1 = 'a';
      char c2 = c1;
      char c3 = ' ';
     // char 도 연산수행시 연산의 결과가 int형으로 변경 됨
     // c3 = c1 +1;

      //해결책 1 타입 맞추기 

      int result = c1 +1;

      // 해결책 2 캐릭터로 맞춰요
      c3 = (char)(c1+1);

      // c2 = c2+1;

      System.out.println("c1 = " +c1);
      System.out.println("result = " +result); //98 a=97이니까 1 더해서 98 = b
      System.out.println("c3 = " +c3);

      System.out.println(c3++);
      System.out.println(c2++);
      System.out.println(c2++);

  }
    
}
