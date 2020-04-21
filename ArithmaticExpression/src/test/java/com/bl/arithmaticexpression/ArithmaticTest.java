package com.bl.arithmaticexpression;

import org.junit.Assert;
import org.junit.Test;

public class ArithmaticTest {
    Arithmatic arithmatic=new Arithmatic();
    @Test
    public void givenTwoInput_WhenAdd_ShouldReturnSum()
    {
        Assert.assertEquals(5,arithmatic.add(2,3));
    }
    @Test
    public void givenTwoInput_WhenSubstract_ShouldReturnDifference()
    {
        Assert.assertEquals(1,arithmatic.sub(3,2));
    }

}
