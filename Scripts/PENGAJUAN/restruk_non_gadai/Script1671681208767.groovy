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

WebUI.navigateToUrl('http://localhost:8080/login')

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Login/input_NIK_input-nik'), 
    'PKS30003')

WebUI.setEncryptedText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Login/input_Password_input-password'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Login/span_Masuk'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Dashboard/span_Ok'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Dashboard/div_Restrukturisasi Non Gadai'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Dashboard/div_Pengajuan'))

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), 
    '6002522760000024')

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/button_Cari'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/span_SELANJUTNYA'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Apakah Profesi Anda Saat Ini_v-select___00209d'))

WebUI.setText(findTestObject('pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Karyawan_profesi'), 
    'nelayan')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Karyawan_profesi'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Apakah Profesi Anda Saat Ini_v-select___00209d'))

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), 
    'hasil usaha')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Pendapatan Gaji SendiriPasangan_sumbe_b60610'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Apakah Profesi Anda Saat Ini_v-select___00209d'))

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), 
    'sudah tidak ada lagi')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Ada, berfungsi baik_kondisiBarangJaminan'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Apakah Profesi Anda Saat Ini_v-select___00209d'))

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), 
    'jasa')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Jasa_jenisUsaha'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Apakah Profesi Anda Saat Ini_v-select___00209d'))

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), 
    'rumah makan')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Kesehatan_rincianJenisUsaha'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Apakah Profesi Anda Saat Ini_v-select___00209d'))

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), 
    'pendidikan')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Lainnya_penggunaanDana'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Apakah Profesi Anda Saat Ini_v-select___00209d'))

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), 
    'proses produksi terganggu')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Proses produksi terganggu_dampakPandemi'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Apakah Profesi Anda Saat Ini_v-select___00209d'))

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), 
    'masih berlangsung')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Usaha sudah tutup sejak bulan Desembe_97469a'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input__input-421'), 
    '15.0000')

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Berapakah jumlah pendapatan anda per _2df2ad'), 
    '300.000')

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Berapakah rata - rata jumlah pengelua_59ab20'), 
    '200.000')

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Pengajuan non Gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Detail PengajuanDetail WawancaraINQUIRY_52785f'))

WebUI.closeBrowser()

