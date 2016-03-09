/*
5명의 회원 정보를 입력받아서 보관하라!
> java -cp bin step17.Quiz
이름? 홍길동
이메일? hong@test.com
암호? 1111
전화? 111-1111
정말 저장하시겠습니까?(y/n) y
저장했습니다.

이름? 임꺽정
이메일? leem@test.com
암호? 1111
전화? 111-1111
정말 저장하시겠습니까?(y/n) y
저장했습니다.

이름? 임꺽정2
이메일? leem2@test.com
암호? 1111
전화? 111-1111
정말 저장하시겠습니까?(y/n) y
저장했습니다.

이름? 임꺽정3
이메일? leem3@test.com
암호? 1111
전화? 111-1111
정말 저장하시겠습니까?(y/n) y
저장했습니다.

이름? 오호라
이메일? ohora@test.com
암호? 1111
전화? 111-1111
정말 저장하시겠습니까?(y/n) n
저장 취소했습니다.

이름? 임꺽정4
이메일? leem4@test.com
암호? 1111
전화? 111-1111
정말 저장하시겠습니까?(y/n) y
저장했습니다.

지금까지 입력한 회원 정보는 다음과 같습니다.
--------------------------------------------
홍길동,hong@test.com,1111,111-1111
임꺽정,leem@test.com,1111,111-2222
임꺽정2,leem2@test.com,1111,111-2222
임꺽정3,leem3@test.com,1111,111-2222
임꺽정4,leem4@test.com,1111,111-2222
>
*/

package step17;

import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) {
    Member[] m = new Member[5];
    Scanner keyScan = new Scanner(System.in);
    String[] str = new String[5];

    for (int i = 0; i < 5; i++) {
      m[i] = new Member();
      System.out.print("이름?");
      str[0] = keyScan.nextLine();
      System.out.print("이메일?");
      str[1] = keyScan.nextLine();
      System.out.print("암호?");
      str[2] = keyScan.nextLine();
      System.out.print("전화?");
      str[3] = keyScan.nextLine();

      while(true) {
        System.out.print("정말 저장하시겠습니까?(y/n)");
        str[4] = keyScan.nextLine();
        if (str[4].equals("y") || str[4].equals("Y")) {
          m[i].setName(str[0]);
          m[i].setEmail(str[1]);
          m[i].setPassword(str[2]);
          m[i].setTel(str[3]);
          System.out.print("\n");
          break;
        } else if (str[4].equals("n") || str[4].equals("N")){
          System.out.print("\n");
          break;
        }
      }
    }
    System.out.println("지금까지 입력한 회원 정보는 다음과 같습니다.");
    System.out.println("----------------------------------------------");

    for (int i = 0; i < 5; i++) {
      System.out.printf("%s,%s,%s,%s\n",
          m[i].getName(), m[i].getEmail(), m[i].getPassword(), m[i].getTel());
    }
  }
}
