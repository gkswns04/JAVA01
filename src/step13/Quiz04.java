/* 문제4) 주어진 수를 오름차순으로 정렬하시오.
    프로그램 아규먼트의 개수는 정해져 있지 않다.
> java -cp bin step13.Quiz03 64 5 2 74 13 98
> 2 5 13 64 74 98
*/
package step13;

public class Quiz04 {
  public static void main(String[] args) {
    String tmp;
    for (int i = 0; i < args.length - 1; i++) {
      for (int j = i + 1; j < args.length; j++) {
        if (Integer.parseInt(args[i]) > Integer.parseInt(args[j])) {
          tmp = args[i];
          args[i] = args[j];
          args[j] = tmp;
        }
      }
    }
    for (String value : args) {
      System.out.println(value);
    }
  }
}
