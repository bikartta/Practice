package com.manage.contacts.junitTest;

public class Example {

    public int calculation(int val1,int val2){
        return val1+val2;
    }

    public static void main(String[] args) {

       Example ex=new Example();
       System.out.println(ex.calculation(10,20));

    }
}
