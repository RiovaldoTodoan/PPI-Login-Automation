package com.example.steps;

import com.example.app.pages.Login_and_Logout_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginandLogout_StepDefs {

    private Login_and_Logout_Page Loginpage = new Login_and_Logout_Page();

    @Given("User open browser")
    public void userOpenMobileBrowser() {
        Loginpage.homepage();}

    @When("User type URL {}")
    public void userTypeURL(String url) {
        Loginpage.inputURl(url);}

    @And("User landing in login page")
    public void userLandingInLoginPage() {
        Loginpage.memberHomePage();}

    @And("User tap enter button")
    public void userTapEnterButton() {
        Loginpage.tapEnter();}

    @And("User enter phone number {}")
    public void userEnterPhoneNumber(String phoneNumber) {
        Loginpage.phoneNumber(phoneNumber);}

    @And("User enter password {}")
    public void userEnterPassword(String Password) {
        Loginpage.password(Password);}

    @And("User tap login")
    public void userTapLogin() {
        Loginpage.loginbbutton();}

    @Then("User successfully login in member partai homepage")
    public void userSuccessfullyLoginInMemberPartaiHomepage() {
        Loginpage.myProfileLanding();
//        Assertions.assertEquals("Kartu Tanda Anggota",TextTitle);
    }



}
