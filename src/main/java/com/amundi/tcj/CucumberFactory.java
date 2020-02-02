package com.amundi.tcj;

import com.amundi.stp.regression.StepDefinitions;

public class CucumberFactory {

    public static void main(String[] args) {
        logMessage("Starting StepDefinitions \n");

        StepDefinitions stepDefinitions = new StepDefinitions();

        stepDefinitions.given_i_am_logged_as_user();

    }

    static void logMessage(String message){
        System.out.println(message);
    }

}
