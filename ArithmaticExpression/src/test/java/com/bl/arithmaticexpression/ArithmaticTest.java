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
    @Test
    public void givenTwoInput_WhenMultiply_ShouldReturnMultiplication()
    {
        Assert.assertEquals(6,arithmatic.mul(3,2));
    }
    @Test
    public void givenTwoInput_WhenDivide_ShouldReturnDivision()
    {
        Assert.assertEquals(1,arithmatic.div(3,2));
    }

}
