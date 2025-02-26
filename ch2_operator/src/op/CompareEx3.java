public class CompareEx3
 {
        public static void main(String[] args) {
    // 문자와 문자열은 다름 문자열은 "" >> "a" "abc"
    //변수선언 : 기본 타입
    //문자열 : 기본 타입 x 객체타입으로 선언

    String str1 = "abc";//허용 str1과 str3 저장공간이 다름
    String str2 = "abc";
    String str3 = new String("abc"); //기본

    // 같은 공간안에서 저장된 문자열 비교시 == 을 사용 (값을 비교)하면 true
    //다른 공간에서 저장된 문자열 비교시 == 을 사용 (주소비교)
    //new sting  하면 heap이라는 저장공간 사용

       System.out.printf("str1 == str2 = %b\n",(str1 == str2)); // true 같은 공간 안에서 값만 비교한거라 true
       System.out.printf("str1 == str3 = %b\n",(str1 == str3)); // false 저장공간이 다름 주소비교가 되어버림 false
       System.out.printf("str1 .equals(str3) = %b\n",(str1.equals(str3))); 
       System.out.printf("str1 .equals(ABC) = %b\n",(str1.equals("ABC"))); 
       System.out.printf("str1 .equalsIgnoreCases(atr3) = %b\n",(str1.equalsIgnoreCase(str3))); 
       System.out.printf("str1 .equalsIgnoreCases(ABC) = %b\n",(str1.equalsIgnoreCase("ABC"))); 
}
    
}
