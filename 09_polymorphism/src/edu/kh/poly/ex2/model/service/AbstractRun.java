package edu.kh.poly.ex2.model.service;

public class AbstractRun {

	public static void main(String[] args) {
		// new AbstractService().ex1();
		
		Calculator cal = new CHMCalculator();
		
		System.out.println("합 : "+ cal.plus(20, 30));
		
		// 인터페이스 == 미완성 설계도 == 객체 생성 불가능
		//-> 참조 변수로는 사용 가능
		
		// 코드의 큰 수정 없이 
		// 객체 생성 코드만 바꾸면 새로운 클래스 코드를 수행할 수 있다.
		
		// 인터페이스 특징
		// 1) 인터페이스를 부모 참조 변수로 사용하면
		// 다형성 중 업캐스팅이 적용되서
		// 상속받은 모든 클래스를 자식 객체로 참조할 숭 있다.
		// -> 이를 이용하여 중요한 메인 코드의 수정을 최소화 할 수 있다.
		
		// 2) 자식 클래스에 공통된 메서드를 강제 구현하라고 하기 때문에
		// 모든 자식 클래스가 동일한 형태를 띄게 된다.
		//->이를 이용하여 공동 작업(팀프로젝트)에 필요한
		// 개발 환경 조성이 용이하다!
		
		
		
}
