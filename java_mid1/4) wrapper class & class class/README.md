# 📖 Chapter Summary - Wrapper class & Class class

## 핵심 내용

- 기본형 타입은 객체가 아니기 때문에 객체 지향 프로그래밍의 장점을 살리기 어려움.(컬랙션 프레임워크 사용X, null값 가질 수 없음)
- 기본형은 항상 값이 있어야 함. -> null 값을 반환해야하는 경우 참조형을 이용하면 해결됨. 
- 자바에서는 기본형에 대응하는 래퍼 클래스를 기본으로 제공함. {
  byte -> Byte
  short -> Short
  int -> Integer
  long -> Long
  float -> Float
  double -> Double
  char -> Character
  boolean -> Boolean
}
- 기본형을 래퍼 클래스로 변경하는 것을 박싱이라고 함.(intValue() 메서드로 값을 다시 꺼내는 건 언박싱)
- 래퍼 vs 기본형 -> 유지보수 vs 최적화 라고 볼수있음.(개발 단계에서 알맞게 판단)

- Class 클래스의 주요 기능: 타입 정보 얻기, 리플렉션, 동적 로딩과 생성, 애노테이션 처리
- class 클래스를 이용해서 동적으로 객체를 만들기도 가능.

- System class -> 시스템과 관련된 기본 기능들을 제공.(출력, 시간 등등)
- Random class -> 랜덤은 내부에서 씨드 값을 사용해 랜덤 값을 구함. 근데 씨드 값이 같으면 동일한 값이 나옴.