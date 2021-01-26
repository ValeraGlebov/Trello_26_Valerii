package com.trello.qa.tests;
import com.trello.qa.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class TestBase {
    protected ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws IOException {
        app.start();
    }

    @AfterMethod()
    public void tearDown(){
        app.stop();
    }
}
