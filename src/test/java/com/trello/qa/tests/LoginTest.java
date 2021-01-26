package com.trello.qa.tests;

import com.trello.qa.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void testAtlassianUserLogin() throws InterruptedException {
        app.user().initLogin();
        app.user().fillLoginForm(new User()
                .withEmail(app.setEmail())          //cmex3431608881578643@gmail.com
                .withPassword(app.setPassword()));  //Demo2015!
        app.user().confirmLogin();

        //Assert.assertTrue(app.user().isAvatarPresent());
    }


}
