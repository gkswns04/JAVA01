/* 문제1) 입력 받은 두 수 중 더 큰 수를 출력하시오.
> java -cp bin step13.Quiz01 34 78
> 78
*/
package step13;

public class Quiz01 {
  public static void main(String[] args) {
    if (Integer.parseInt(args[0]) > Integer.parseInt(args[1])) {
      System.out.println(args[0]);
    } else {
      System.out.println(args[1]);
    }
  }
}
