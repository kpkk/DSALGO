package com.company;

import org.junit.Assert;
import org.junit.Test;

public class addition {

    @Test
    public void testcase1(){
        int a=10;
        int b=20;
        int c=30;
        int add = add(a, b);
        Assert.assertEquals(c,add);
    }
    @Test
    public void testcase2(){
        int a=-10;
        int b=20;
        int c=10;
        int add = add(a, b);
        Assert.assertEquals(c,add);
    }
    @Test //junit
    public void testcase3(){
        int a=10;
        int b=-20;
        int c=-10;
        int add = add(a, b);
        Assert.assertEquals(c,add);
    }
    //TDD
    public int add(int a, int b){
         int c=a+b;
        return c;
    }
}
