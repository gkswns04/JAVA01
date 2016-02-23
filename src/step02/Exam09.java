/* 주제: 다차원 배열 */
package step02;

public class Exam08 {
  public static void main(String[] args) {
    int[][][] scores = {
      { // 3학년 1반
        {100, 90, 90},
        {90, 80, 80},
        {80, 100, 90}
      },
      {
        {60, 70, 90},
        {50, 80, 60},
      },
      {
        {50, 50, 50},
        {10, 10, 30},
        {40, 40, 40},
        {30, 60, 70}
      }
    };
    System.out.printf("%d %d %d\n", scores[1][1][0],
                                    scores[1][1][1],
                                    scores[1][1][2]);

  }
}
