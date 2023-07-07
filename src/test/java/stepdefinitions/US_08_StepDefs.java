package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Background;
import pages.LessonMngPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_08_StepDefs {
    LoginPage loginPage = new LoginPage();
    LessonMngPage lessonMngPage = new LessonMngPage();
    Faker faker= new Faker();
    @Given("Vice Deans navigates to LoginLink")
    public void vice_deans_navigates_to_login_link() {

        Driver.getDriver().get(ConfigReader.getProperty("LoginLink"));
    }
        @Then("Vice Deans enter user name")
        public void vice_deans_enter_user_name() {
            loginPage.userName.sendKeys(ConfigReader.getProperty("ViceDeanUsername"));

        }
        @Then("Vice Deans enter password")
        public void vice_deans_enter_password() {
            loginPage.password.sendKeys(ConfigReader.getProperty("ViceDeanPassword"));
        }
    @Then("Vice Deans click on Login button")
    public void vice_deans_click_on_login_button() {
        loginPage.loginButton.click();
    }
    @Then("Vice Deans click on Lesson button")
    public void vice_deans_click_on_lesson_button() {
        lessonMngPage.lessonButton.click();
    }
    @Then("Vice Deans input lesson name")
    public void vice_deans_input_lesson_name() {
        String lesson=faker.programmingLanguage().name();
        lessonMngPage.lessonNameInput.sendKeys(lesson);
    }
    @Then("Vice Deans selected Compulsory")
    public void vice_deans_selected_compulsory() {
        lessonMngPage.compulsoryCheck.click();
    }
    @Then("Vice Deans input credit score")
    public void vice_deans_input_credit_score() {

        lessonMngPage.creditScoreInput.sendKeys("3");
    }
    @Then("Vice Deans click on Submit button")
    public void vice_deans_click_on_submit_button() {
        lessonMngPage.lessonSubmitButton.click();
    }

    }


