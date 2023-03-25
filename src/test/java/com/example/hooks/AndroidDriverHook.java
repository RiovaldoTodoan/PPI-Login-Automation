package com.example.hooks;

import com.example.app.drivers.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class AndroidDriverHook {

  @Before()
  public void beforeScenario() {
    AndroidDriverInit.initialize();}

  @After()
  public void afterScenario(Scenario scenario) {
    AndroidDriverInit.quit();
  }



}
