package com.javaex.ex06;

public class MyBase extends Base{

    //코드작성
	public void service(String state) {

        if (state.equals("낮")) {
            day();
        } else if(state.equals("밤")){
            night();
        } else {
        	afternoon();
        }
    }
	
	public void afternoon() {
		System.out.println("오후에도 낮과 마찬가지로 공부해야 합니다.");
	}

}
