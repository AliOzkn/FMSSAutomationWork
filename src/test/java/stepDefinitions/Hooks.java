package stepDefinitions;

import io.cucumber.java.*;
import utility.Driver;

public class Hooks {

    @Before
    public void setUp() {
        Driver.newSession();
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}


