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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

WebUI.callTestCase(findTestCase('finance/01-rapprochement_bancaire/ct-01-authentification-gestionnaire'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/03-fcm/a_factures-paiement'))

WebUI.click(findTestObject('finance/03-fcm/a_facturation-indication-daffaire'))

WebUI.click(findTestObject('finance/03-fcm/span_slectionner-statut'))

WebUI.click(findTestObject('finance/03-fcm/span_paye'))

WebUI.click(findTestObject('finance/03-fcm/span_rechercher'))

WebUI.scrollToElement(findTestObject('finance/03-fcm/integration/burger-facture-ia'), 2)

WebUI.click(findTestObject('finance/03-fcm/integration/burger-facture-ia'))

WebUI.click(findTestObject('finance/03-fcm/a_facturer'))

WebUI.verifyElementText(findTestObject('finance/03-fcm/td_rgle'), 'Réglée')

WebUI.refresh()

WebUI.click(findTestObject('finance/03-fcm/button_rgle_mat-menu-trigger-mat-icon-butto_2062be'))

WebUI.verifyElementPresent(findTestObject('finance/03-fcm/button_visualiser-fcm'), 0)

WebUI.click(findTestObject('finance/03-fcm/button_visualiser-fcm'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('finance/03-fcm/mat-card_informations-transaction-typ_7216cd'), 0)

WebUI.verifyElementPresent(findTestObject('finance/03-fcm/mat-card_synthsecommission-ht-34100-commis_4019eb'), 0)

WebUI.verifyElementPresent(findTestObject('finance/03-fcm/mat-card_entresortie-daffaire-immobilirecoe_df1a51'), 0)

WebUI.verifyElementPresent(findTestObject('finance/03-fcm/mat-card_apporteur_daffaireintervenantbase_431099'), 0)

WebUI.delay(5)

not_run: WebUI.closeBrowser()

