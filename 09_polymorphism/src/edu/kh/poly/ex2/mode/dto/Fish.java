package edu.kh.poly.ex2.mode.dto;

public class Fish extends Animal{
	@Override
	public String getType() {
		return super.getType();
	}
	
	// 상속 받은 추상 메서드 오버라이딩 구문 자동 완성 단축키
	// alt + shfit  + s -> Override / imp/ Impements method .. -> ok
	
	@Override
	public void eat() {
		System.out.println("입을 버끔거리며 먹는다");
	}

	@Override
	public void breath() {
		System.out.println("아가미 호흡을 한다");
	}

	@Override
	public void move() {
		System.out.println("꼬리로 헤엄치며 움직인다");
	}
@Override
public String toString() {

	return "Fish : " + super.toString();
}
}
