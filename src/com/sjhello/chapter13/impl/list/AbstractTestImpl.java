package com.sjhello.chapter13.impl.list;

public class AbstractTestImpl extends AbstractTest {

    @Override
    public void test() {
        System.out.println("AbstractTestImpl test()");
    }

    public static void main(String[] args) {
        AbstractTest abstractTest = new AbstractTestImpl();
        abstractTest.test();
    }

    @Override
    public boolean addMember() {
        return false;
    }

    @Override
    public boolean removeMember() {
        return false;
    }
}
