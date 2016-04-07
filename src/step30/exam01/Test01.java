// 주제: SQL 맵퍼인 mybatis 적용하기
package step30.exam01;

public class Test01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}

/*
# mybatis 사용 절차
1) 라이브러리 다운로드 및 classpath에 적용
  => mvnrepository.com에서 mybatis 검색한다.
  => build.gradle 파일의 의존 라이브러리 블록에 mybatis 정보를 등록한다.
  => 콘솔창에서 "gradle eclipse" 명령을 실행하여 이클립스 설정 파일을 개정한다.

2) mybatis 설정 파일을 준비한다.
  => mybatis.org 사이트에서 설정파일 설명 페이지로 간다.
  => 설정 파일 예제 코드를 복사한다.
  => 패키지에 mybatis 설정파일(mybatis-config.xml)을 생성하고 
     복사한 내용을 붙여 넣는다.
  => DBMS 정보를 현재 환경에 맞게끔 변경한다.
  
3) SQL 맵퍼 파일을 준비한다.
  => mybatis.org 사이트의 SQL 맵퍼 파일 설명 페이지로 간다.
  => SQL 맵퍼의 예제 코드를 복사한다.
  => 패키지에 SQL 맵퍼파일(MemberMapper.xml)을 생성하고
     복사한 내용을 붙여 넣는다.
  => 회원목록을 질의하는 SQL을 작성한다.
  
4) SQL 문을 실행할 mybatis 객체를 준비하라.
  =>  


















*/