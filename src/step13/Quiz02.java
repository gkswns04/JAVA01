/* 문제2) 두 수 사이에 있는 수 중에서 짝수 값을 출력하시오.
> java -cp bin step13.Quiz02 4 12
> 4, 6, 8, 10, 12
*/
package step13;

public class Quiz02 {
  public static void main(String[] args) {
    if (Integer.parseInt(args[0]) < Integer.parseInt(args[1])) {
      for (int i = Integer.parseInt(args[0]); i <= Integer.parseInt(args[1]); i++) {
        if(i % 2 == 0) {
          System.out.println(i);
        }
      }
    } else {
      for (int i = Integer.parseInt(args[1]); i <= Integer.parseInt(args[0]); i++) {
        if(i % 2 == 0) {
          System.out.println(i);
        }
      }
    }
  }
}
