package com.amnesty.panicbutton;

import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class SettingsActivityTest {
    @Test
    public void shouldHaveHelloWorld(){
        String appName = new SettingsActivity().getResources().getString(R.string.app_name);
        assertThat(appName, equalTo("PanicButton"));
    }
}