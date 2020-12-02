package com.sjhello.chapter13.impl.list;

public class Child extends Parent{

    public void printName() {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent parent = new Child();        // 자동 형변환(promotion) -> 객체를 생성할 때 Child 객체의 생성자로 객체를 생성

        Parent parent1 = new Parent();      
        parent1 = new Child();              // Parent 객체를 Child 생성자로 다시 초기화함
        // Child child = new Parent();       자식 클래스를 생성할때 부모클래스의 생성자를 사용하여 만들수는 없다 
        Child child = (Child)parent1;       // 명시적 형변환(casting) 자식 객체에 부모 객체를 사용하여 생성 
        
        parent.printName2();
        child.printName();

    }
}
