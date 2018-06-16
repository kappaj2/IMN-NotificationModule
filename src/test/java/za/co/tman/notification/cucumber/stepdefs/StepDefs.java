package za.co.tman.notification.cucumber.stepdefs;

import za.co.tman.notification.NotificationmoduleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = NotificationmoduleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
