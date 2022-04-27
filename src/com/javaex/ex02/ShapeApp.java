package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
	}

}
/*출력결과
생성자 Shape(2) 실행
================
생성자 Shape(0) 실행 //부모생성자 먼저 실행
생성자 Triangle(0) 실행
================
생성자 Shape(2) 실행 //super("검정", "검정");로 부모 생성자 먼저 실행
생성자 Triangle(2) 실행 //parameter 2개인 Triangle 생성자 실행
================
생성자 Shape(2) 실행 //super(fillColor, lineColor);로 부모 생성자 먼저 실행
생성자 Triangle(4) 실행 //parameter 4개인 Triangle 생성자 실행
================


자식 클래스를 만들면서 부모의 생성자를 먼저 호출하고 부모 클래스를 만든 뒤 자식클래스가 만들어진다.
*/