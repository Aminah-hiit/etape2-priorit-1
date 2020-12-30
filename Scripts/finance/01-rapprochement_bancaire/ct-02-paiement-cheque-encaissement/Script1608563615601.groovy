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

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/a_factures-paiement'))

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/a_rapprochements-bancaires'))

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/span_ajouter'))

WebUI.setText(findTestObject('finance/01-paiement-cheque-encaissement/input_date-rception-chque_transmitter'), 'ymanci')

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/input_metteur_checkdate'))

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/svg_date_du_chque_mat-datepicker_dab978'))

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/div_17'))

WebUI.setText(findTestObject('finance/01-paiement-cheque-encaissement/input_date-chque_bank'), 'cih')

WebUI.setText(findTestObject('finance/01-paiement-cheque-encaissement/input_banque_checknumber'), GlobalVariable.p)

WebUI.setText(findTestObject('finance/01-paiement-cheque-encaissement/input_numro_de_chque_amount'), GlobalVariable.MontantTTCRapp)

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/span_cration'))

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/span_confirmer'))

WebUI.delay(5)

WebUI.closeBrowser()

