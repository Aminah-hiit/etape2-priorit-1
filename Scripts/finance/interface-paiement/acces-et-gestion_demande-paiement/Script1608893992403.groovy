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

WebUI.callTestCase(findTestCase('finance/ct01-authentification'), [('username') : GlobalVariable.UserNameConseiller, ('mp') : GlobalVariable.Mdp], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad/a_mon-compte'))

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad/a_suivi-rmunration_iagl'))

WebUI.verifyElementPresent(findTestObject('finance/div_interface-suivi/page_iad/h2_manager-platinium-associ'), 0)

WebUI.verifyElementPresent(findTestObject('finance/div_interface-suivi/page_iad/div_objectif25000ttc'), 0)

WebUI.verifyElementPresent(findTestObject('finance/div_interface-suivi/page_iad/div_delta-25000'), 0)

WebUI.verifyElementPresent(findTestObject('finance/div_interface-suivi/page_iad/div_base-ca_ttc'), 0)

WebUI.verifyElementPresent(findTestObject('finance/div_interface-suivi/page_iad/div_0(ttc)'), 0)

WebUI.verifyElementPresent(findTestObject('finance/div_interface-suivi/page_iad/div_102(ht)'), 0)

WebUI.verifyElementPresent(findTestObject('finance/div_interface-suivi/page_iad/div_838(ht)'), 0)

WebUI.verifyElementPresent(findTestObject('finance/div_interface-suivi/page_iad/mat-card_commissions-facturables102(ht)'), 
    0)

WebUI.verifyElementPresent(findTestObject('finance/div_interface-suivi/page_iad/mat-card_dashboard-rmunration 838(ht)'), 
    0)

WebUI.verifyElementPresent(findTestObject('finance/div_interface-suivi/page_iad/mat-card_manager-platinium_associobjectif25000ttcbasevact_cours'), 
    0)

WebUI.verifyElementPresent(findTestObject('finance/div_interface-suivi/page_iad/mat-card_suivi_paiements(ttc)'), 0)

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad/mat-card-title_commissions_facturables'))

WebUI.verifyElementPresent(findTestObject('finance/acces_interface-paiment/page_iad-intranet/span_tout-facturer'), 0)

WebUI.verifyElementPresent(findTestObject('finance/acces_interface-paiment/page_iad-intranet/span_tout-facturer'), 0)

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad-intranet/span_choisir-montants'))

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad-intranet/span_Tout slectionner'))

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad-intranet/span_Tout slectionner'))

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad-intranet/button_choisir-montants'))

WebUI.click(findTestObject('finance/interface_suivi-rem/page_iad-intranet/div_ tout-slectionner'))

WebUI.verifyElementPresent(findTestObject('finance/interface_suivi-rem/page_iad-intranet/div_0'), 0)

WebUI.verifyElementClickable(findTestObject('interface_suivi-rem/page_iad-intranet/div_Payable_mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'))

WebUI.verifyElementClickable(findTestObject('finance/interface_suivi-rem/page_iad-intranet/mat-chip_valider-slection'))

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad-intranet/mat-icon_valider_mat-icon notranslate_fa-times'))

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad-intranet/button_choisir-montants'))

WebUI.click(findTestObject('finance/interface_suivi-rem/page_iad-intranet/div_ tout-slectionner'))

WebUI.verifyElementPresent(findTestObject('finance/interface_suivi-rem/page_iad-intranet/div_0'), 0)

WebUI.verifyElementClickable(findTestObject('interface_suivi-rem/page_iad-intranet/div_Payable_mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'))

WebUI.verifyElementClickable(findTestObject('finance/interface_suivi-rem/page_iad-intranet/mat-chip_valider-slection'))

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad-intranet/mat-icon_Valider_mat-icon notranslate fas fa-times_1'))

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad-intranet/button_choisir-montants'))

WebUI.click(findTestObject('finance/interface_suivi-rem/page_iad-intranet/div_ tout-slectionner'))

WebUI.verifyElementPresent(findTestObject('finance/interface_suivi-rem/page_iad-intranet/div_0'), 0)

WebUI.verifyElementClickable(findTestObject('interface_suivi-rem/page_iad-intranet/div_Payable_mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'))

WebUI.verifyElementClickable(findTestObject('finance/interface_suivi-rem/page_iad-intranet/mat-chip_valider-slection'))

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad-intranet/mat-icon_Valider_mat-icon notranslate fas fa-times_1_2'))

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad-intranet/a_Valider'))

WebUI.click(findTestObject('finance/acces_interface-paiment/page_iad-intranet/mat-chip_Valider'))

