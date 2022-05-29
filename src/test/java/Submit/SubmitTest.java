package Submit;

import base.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SubmissionPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
public class SubmitTest extends BaseTest {


    @Test
    public void testSubmission0 (){

        setup();
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }

    @Test
    public void testSubmission1 (){
        setup();
        webForm.setFirstName("Sara");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }

    @Test
    public void testSubmission2 (){
        setup();
        webForm.setFirstName("Sara");
        webForm.setLastName("Hussein");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }


    @Test
    public void testSubmission3 (){
        setup();
        webForm.setFirstName("Sara");
        webForm.setLastName("Hussein");
        webForm.setJobTitle("Student");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }


    @Test
    public void testSubmission4 (){
        setup();
        webForm.setFirstName("Sara");
        webForm.setLastName("Hussein");
        webForm.setJobTitle("Student");
        webForm.setHighestLevelOfEduction("High School");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }

    @Test
    public void testSubmission5 (){
        setup();
        webForm.setFirstName("Sara");
        webForm.setLastName("Hussein");
        webForm.setJobTitle("Student");
        webForm.setHighestLevelOfEduction("College");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
        }


    @Test
    public void testSubmission6 (){
        setup();
        webForm.setFirstName("Sara");
        webForm.setLastName("Hussein");
        webForm.setJobTitle("Student");
        webForm.setHighestLevelOfEduction("Grad School");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }

    @Test
    public void testSubmission8 (){
        setup();
        webForm.setFirstName("Sara");
        webForm.setLastName("Hussein");
        webForm.setJobTitle("Student");
        webForm.setHighestLevelOfEduction("College");
        webForm.setHighestLevelOfEduction("Grad School");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }
    @Test
    public void testSubmission9 (){
        setup();
        webForm.setFirstName("Sara");
        webForm.setLastName("Hussein");
        webForm.setJobTitle("Student");
        webForm.setHighestLevelOfEduction("High School");
        webForm.setHighestLevelOfEduction("College");
        webForm.setHighestLevelOfEduction("Grad School");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }

    @Test
    public void testSubmission10 (){
        setup();
        webForm.setFirstName("Hussein");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }
    @Test
    public void testSubmission11 (){
        setup();
        webForm.setJobTitle("Student");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }
    @Test
    public void testSubmission12 (){
        setup();
        webForm.setFirstName("Sara");
        webForm.setJobTitle("Student");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }
    @Test
    public void testSubmission13 (){
        setup();
        webForm.setFirstName("Sara");
        webForm.setHighestLevelOfEduction("High School");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }

    @Test
    public void testSubmission14 (){
        setup();
        webForm.setHighestLevelOfEduction("High School");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }
    @Test
    public void testSubmission15 (){
        setup();
        webForm.setHighestLevelOfEduction("High School");
        webForm.setHighestLevelOfEduction("College");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }

    @Test
    public void testSubmission16 (){
        setup();
        webForm.setHighestLevelOfEduction("High School");
        webForm.setHighestLevelOfEduction("College");
        webForm.setHighestLevelOfEduction("Grad School");
        SubmissionPage submissionPage = webForm.clickOnSubmitButton();
        String status = submissionPage.getStatus();
        assertEquals ( status, "The form was successfully submitted!", "Status is incorrect");
        quitForm();
    }


}
