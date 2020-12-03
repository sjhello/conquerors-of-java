package com.sjhello.chapter16;

import jdk.internal.util.xml.impl.Input;

public class InputBox {
    public InputBox() { }       // 다른 생성자가 없는데 왜 이렇게 쓴거지?
    // public InputBox(int a) {}     // 기본 생성자 외에 다른 생성자가 존재하니 기본 생성자를 명시적으로 써줘야한다

    KeyEventListener listener;
    public static final int KEY_DOWN = 2;
    public static final int KEY_UP= 4;

    public void setListener(KeyEventListener listener) {
        this.listener = listener;
    }

    public void listenerCalled(int eventType) {
        if (eventType == KEY_DOWN) {
            listener.onKeyDown();
        } else if (eventType == KEY_UP) {
            listener.onKeyUp();
        }
    }

}
