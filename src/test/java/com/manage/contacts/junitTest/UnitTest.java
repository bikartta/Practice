package com.manage.contacts.junitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTest {
    @Test
    public void division(){
        int val1=20;
        int val2=10;

        Unit unit=new Unit();

        int actResult=2;
        int expResult= unit.division(val1,val2);
        Assertions.assertEquals(actResult,expResult);
    }

}
