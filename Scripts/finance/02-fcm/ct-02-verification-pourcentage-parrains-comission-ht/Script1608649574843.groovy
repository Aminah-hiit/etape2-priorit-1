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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('finance/02-fcm/ct-01-visualiser-fcm'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('finance/03-fcm/div_marge_id_1880'), '19,00 %')

WebUI.verifyElementText(findTestObject('finance/03-fcm/integration/td_6900'), '69,00 %')

WebUI.verifyElementText(findTestObject('finance/03-fcm/integration/td_700'), '7,00 %')

WebUI.verifyElementText(findTestObject('finance/03-fcm/integration/td_300'), '3,00 %')

WebUI.verifyElementText(findTestObject('finance/03-fcm/integration/td_150'), '1,50 %')

WebUI.verifyElementText(findTestObject('finance/03-fcm/integration/td_050'), '0,50 %')

a = WebUI.getText(findTestObject('finance/03-fcm/label_34100'))

b = WebUI.getText(findTestObject('finance/03-fcm/td_34100'))

WebUI.verifyEqual(a, b)

WebUI.delay(5)

WebUI.closeBrowser()

