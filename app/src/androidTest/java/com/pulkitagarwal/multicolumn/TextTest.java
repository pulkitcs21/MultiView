package com.pulkitagarwal.multicolumn;

import org.junit.Test;


public class TextTest {


    @Test
    public void testCheck(){
        onView(withId(R.id.list1)).check(matches(isDisplayed()));
    }
}
