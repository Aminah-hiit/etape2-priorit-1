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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('finance/01-rapprochement_bancaire/ct-01-authentification-gestionnaire'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/02-rapprochement-bancaire/a_factures-paiement'))

WebUI.click(findTestObject('finance/02-rapprochement-bancaire/a_rapprochements-bancaires'))

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/mat-icon_ymanci_mat-icon-notranslate-fal-fa_727574'), 
    0)

WebUI.click(findTestObject('finance/02-rapprochement-bancaire/mat-icon_ymanci_mat-icon-notranslate-fal-fa_727574'))

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/mat-icon_concat-Indication-d-affaire_mat_59da36'), 
    0)

WebUI.click(findTestObject('finance/02-rapprochement-bancaire/mat-icon_concat-Indication-d-affaire_mat_59da36'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('02-rapprochement-bancaire/button_Confirmer'), 0)

WebUI.verifyElementClickable(findTestObject('02-rapprochement-bancaire/button_Confirmer'))

WebUI.click(findTestObject('02-rapprochement-bancaire/button_Confirmer'))

WebUI.delay(5)

WebUI.closeBrowser()

