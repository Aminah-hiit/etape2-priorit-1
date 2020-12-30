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

WebUI.callTestCase(findTestCase('finance/04-interface-paiement/authentification'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/04-suivi-de-rem/reccurence/a_mon-compte'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/comissions-facturables/a_suivi-rmunration-iagl'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/bloc-commissions-facturables'))

WebUI.verifyElementPresent(findTestObject('finance/04-suivi-de-rem/reccurence/mat-card-title_rcurrences'), 0)

WebUI.click(findTestObject('finance/04-suivi-de-rem/reccurence/mat-card-title_rcurrences'))

WebUI.verifyElementClickable(findTestObject('finance/04-suivi-de-rem/reccurence/span_choisir les montants'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/reccurence/span_choisir les montants'))

WebUI.click(findTestObject('finance/05-interface-paiement/mat-icon_valider_iad-cursor-pointer'))

WebUI.click(findTestObject('finance/05-interface-paiement/div_automatiques-'))

not_run: WebUI.verifyElementChecked(findTestObject('finance/05-interface-paiement/div_automatiques-'), 0)

not_run: WebUI.verifyElementNotChecked(findTestObject('finance/05-interface-paiement/div_manuelles-'), 0)

WebUI.verifyElementPresent(findTestObject('finance/05-interface-paiement/button_valider'), 0)

WebUI.verifyElementClickable(findTestObject('finance/05-interface-paiement/button_valider'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/05-interface-paiement/button_valider'), FailureHandling.STOP_ON_FAILURE)

