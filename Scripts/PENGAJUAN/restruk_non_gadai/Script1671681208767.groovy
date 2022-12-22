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

WebUI.navigateToUrl('http://localhost:8080/dashboard')

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Login/input_NIK_input-nik'), 'PKS30003')

WebUI.setEncryptedText(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Login/input_Password_input-password'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Login/span_Masuk'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Dashboard/button_Ok'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Dashboard/div_Restrukturisasi Non Gadai_v-list-item___faca89'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Dashboard/div_Pengajuan'))

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), 
    '23213213')

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/span_Cari'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/button_OK'))

WebUI.closeBrowser()

