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

Mobile.startApplication('C:\\Users\\mari02\\Downloads\\Android-MyDemoAppRN.1.3.0.build-244.apk', true)

Mobile.tap(findTestObject('Object Repository/login_page/list_menu'), 0)

Mobile.tap(findTestObject('Object Repository/login_page/select_login'), 0)

Mobile.setText(findTestObject('Object Repository/login_page/txt_username'), 'bob@example.com', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/login_page/txt_pass'), 'dbXIBZ66cuht4KTRMDozZw==', 0)

Mobile.tap(findTestObject('Object Repository/login_page/btn_login'), 0)

Mobile.closeApplication()
