package com.lavor.jenkins.test1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lei.zeng on 2017/9/6.
 */
public class PrintFuncTest {
    PrintFunc printFunc=new PrintFunc();
    @Test
    public void print1() {
        Assert.assertEquals(1,printFunc.print1());
    }
    @Test
    public void print2() {
        Assert.assertEquals(2,printFunc.print2());
    }
    @Test
    public void print3() {
        Assert.assertEquals(3,printFunc.print3());
    }
    @Test
    public void print4() {
        Assert.assertEquals(4,printFunc.print4());
    }
    @Test
    public void print5() {
        Assert.assertEquals(5,printFunc.print5());
    }
}
