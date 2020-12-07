package com.sjhello.chapter16;

public class MyPage {
    // static InputBox input;
    InputBox input;
    int aa;
    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUI();
        myPage.pressKey();
    }

    public void setUI() {
        input = new InputBox();

        KeyEventListener listener = new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        };
        input.setListener(listener);
    }

    public void pressKey() {
        //input.listenerCalled(2);
        //input.listenerCalled(4);
        input.listenerCalled(InputBox.KEY_UP);
        input.listenerCalled(InputBox.KEY_DOWN);
    }
}
