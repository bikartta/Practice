package com.manage.contacts.junitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void calculationTest(){

        int val1=10;
        int val2=20;

        Example example=new Example();

        int actResult=20;
        int expResult=example.calculation(val1,val2);

        Assertions.assertEquals(actResult,expResult);

    }

}
