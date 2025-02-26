package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car{ //전기차
	
	private int batteryCapacity; // 배터리 용량
	
	public Tesla() {}
	
	//매개변수 생성자 + 상속 받은것도 포함
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel); // 슈퍼 매개 변수
		this.batteryCapacity = batteryCapacity;
	}// 매개 변수 생성자

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " / " + batteryCapacity;
	}
	
}
