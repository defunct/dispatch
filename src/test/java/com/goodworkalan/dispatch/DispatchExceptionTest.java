package com.goodworkalan.dispatch;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class DispatchExceptionTest
{
    @Test
    public void constructor()
    {
        DispatchException e = new DispatchException(101);
        assertEquals(e.getCode(), 101);
    }
}
