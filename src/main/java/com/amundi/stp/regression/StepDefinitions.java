package com.amundi.stp.regression;

import com.amundi.stp.regression.model.OpenAML;
import com.amundi.stp.regression.model.User;
import com.amundi.tcj.Context;
import com.amundi.tcj.ContextAware;
import com.amundi.tcj.CucumberContext;

import java.util.HashMap;

public class StepDefinitions implements ContextAware {

    /**
     * Define the steps:
     * add implementation to the steps
     * add values and reuse context
     */

    private Context context = new CucumberContext(new HashMap<String, Object>());
    public User user = new User();
    public OpenAML message = new OpenAML();


    public void given_i_am_logged_as_user(){

        user.setUser("mitina");
        message.setMessage("<String>");

        setContext();

        logMessage("user.getUser(): " + user.getUser());
        logMessage("context.getAsString(\"user\"): " + context.getAsString("user") + "\n");

        logMessage("message.getMessage(): " + message.getMessage());
        logMessage("context.getAsObject(\"message\"): " + context.getAsObject("message") + "\n");

        logMessage("Clear context");

        context.clear();
        logMessage("After clear the message value is: " + context.getAsObject("message") + "\n");



    }

    void logMessage(String message){
        System.out.println(message);
    }

    public void setContext() {
        context.put("user", this.user.getUser());
        context.put("message", this.message.getMessage());
    }

}
