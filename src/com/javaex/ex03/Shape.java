package com.javaex.ex03;

public class Shape {
	
	//필드
	/*
	private String fillColor;
	private String lineColor;
	자식클래스에서도 필드변수를 공유하려면 public이나 protected로 접근제한자를 만들어야하는데
	public은 공유범위가 넓어서 캡슐화를 할수없기때문에 protected를 사용함
	*/
	protected String fillColor;
	protected String lineColor;
	
	
	
	//생성자
	//자식클래스에서 자동으로 디폴트 생성자를 호출하기 때문에 부모클래스에서는 디폴트 생성자가 있어야함
	public Shape() {
		
	}
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	
	


	//메소드 gs
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
}

