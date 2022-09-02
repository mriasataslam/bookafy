import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://app.timelyscheduling.com/login')

WebUI.setText(findTestObject('Object Repository/Add_New_User_OR/Page_Timely Scheduling - Online Scheduling _e5746f/input_Welcome back, Log in_useremail'), 
    'mriasat+1310@clustox.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Add_New_User_OR/Page_Timely Scheduling - Online Scheduling _e5746f/input_Welcome back, Log in_userpassword'), 
    'oUW7L5NyS6fSbP6Rr94xnA==')

WebUI.click(findTestObject('Object Repository/Add_New_User_OR/Page_Timely Scheduling - Online Scheduling _e5746f/input_Forgot Your Password_commit'))

WebUI.click(findTestObject('Object Repository/Add_New_User_OR/Page_Timely Scheduling - Online Scheduling _e5746f/a_Marketing_dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/Add_New_User_OR/Page_Timely Scheduling - Online Scheduling _e5746f/a_Settings'))

WebUI.click(findTestObject('Object Repository/Add_New_User_OR/Page_Timely Scheduling - Online Scheduling _e5746f/a_Users'))

WebUI.click(findTestObject('Object Repository/Add_New_User_OR/Page_Timely Scheduling - Online Scheduling _e5746f/a_Add a new user'))

WebUI.setText(findTestObject('Object Repository/Add_New_User_OR/Page_Timely Scheduling - Online Scheduling _e5746f/input_Name_workername'), 
    'Ali')

WebUI.setText(findTestObject('Object Repository/Add_New_User_OR/Page_Timely Scheduling - Online Scheduling _e5746f/input_Email_workeruser_attributesemail'), 
    'mriasat+13122@clustox.com')

WebUI.click(findTestObject('Object Repository/Add_New_User_OR/Page_Timely Scheduling - Online Scheduling _e5746f/input_Notes_commit'))

WebUI.delay(10)

WebUI.closeBrowser()

