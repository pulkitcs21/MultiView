package com.pulkitagarwal.multicolumn;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.startsWith;


public class TextTest {

    @Test
    public void testCheck(){
        onData(hasToString(startsWith("Pizza")))
                .inAdapterView(withId(R.id.listView))
                .perform(click());
    }
}
