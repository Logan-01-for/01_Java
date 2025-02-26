package edu.kh.poly.ex1.model.dto;

public class Spark extends Car{// 경차
	
	private double discountOffer; // 할인 혜택
	
	public Spark() {}
	
	// 매개 변수 변경
	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}


	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}

}
