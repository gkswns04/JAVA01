/* 퀴즈 : 다음 값을 저장하고 지시에 따라 내용을 출력하시오!
- 저장할 데이터
이름,   국어, 영어, 수학
홍길동  100   90    80
임꺽정   90   80    90
유관순   70  100   100

- 출력
이름: 국어, 영어, 수학, 합계, 평균
*/
package step02;

public class Quiz04{
  public static void main(String[] args){
    String[] name = {"홍길동", "임꺽정", "유관순"};
    int[][] scores = {
      {100, 90, 80},
      {90, 80, 90},
      {70, 100, 100}
    };
    int[] sum = new int[3];
    sum[0] = scores[0][0] + scores[0][1] + scores[0][2];
    sum[1] = scores[1][0] + scores[1][1] + scores[1][2];
    sum[2] = scores[2][0] + scores[2][1] + scores[2][2];

    float[] avers = new float[3];
    avers[0] = sum[0] / 3;
    avers[1] = sum[1] / 3;
    avers[2] = sum[2] / 3;

    System.out.printf("%s: %d, %d, %d, %d, %f\n", name[0], scores[0][0], scores[0][1], scores[0][2],
                                                sum[0], avers[0]);
    System.out.printf("%s: %d, %d, %d, %d, %f\n", name[1], scores[1][0], scores[1][1], scores[1][2],
                                                sum[1], avers[1]);
    System.out.printf("%s: %d, %d, %d, %d, %f\n", name[2], scores[2][0], scores[2][1], scores[2][2],
                                                sum[2], avers[2]);
  }
}
