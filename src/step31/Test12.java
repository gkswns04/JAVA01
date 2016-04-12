package step31;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test12 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    // (?=검색패턴)대상패턴
    //Pattern pattern = Pattern.compile("(?=abc)abcok");
    //Pattern pattern = Pattern.compile("(?=\\d)");
    //Pattern pattern = Pattern.compile("(?=\\d)\\d");
    //Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@?])[a-zA-Z0-9!@?]{}");
    Matcher matcher = null;
    Pattern pattern;
    String input = null;
    String regex = null;
    while (true) {
      System.out.print("입력: ");
      input = keyScan.nextLine();
      if (input.equals("quit"))
        break;
      regex = String.format(
          "(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@?])[a-zA-Z0-9!@?]{%d}", input.length());
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(input); // 2) 입력 문자열을 정규식에 따라 분석할 객체를 얻는다.
      while (matcher.find()) { // 3) 분석 시작
        System.out.println(matcher.group()); // 찾은 값을 리턴
      }
    }
    
    keyScan.close();
  }

}










