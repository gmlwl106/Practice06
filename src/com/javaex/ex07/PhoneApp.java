package com.javaex.ex07;

public class PhoneApp {

    public static void main(String[] args) {

        Phone phone = new SmartPhone();
        phone.execute("앱"); //SmartPhone->execute()
        phone.execute("음악"); //SmartPhone->playMusic()(오버라이딩)
        phone.execute("통화"); //Phone->execute()
        
        
    }


}
