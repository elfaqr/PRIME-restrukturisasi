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

WebUI.setText(findTestObject('Page_PRIME  Login/input_NIK_input-nik'), 'PKS30003')

WebUI.setEncryptedText(findTestObject('Page_PRIME  Login/input_Password_input-password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Page_PRIME  Login/span_Masuk'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Dashboard/span_Ok'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Dashboard/div_Restrukturisasi Non Gadai'))

WebUI.click(findTestObject('Page_PRIME  Dashboard/div_Pengajuan'))

WebUI.setText(findTestObject('Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), '6002522760000024')

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/button_Cari'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/span_SELANJUTNYA'))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Apakah Profesi Anda Saat Ini'))

WebUI.setText(findTestObject('Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), '6002522760000024')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Pengusaha Mikrowiraswasta_profesi'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Darimana Sumber Pembayaran Kredit Anda _3cf37a'))

WebUI.setText(findTestObject('Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), '6002522760000024')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Keduanya_sumberPembayaranKredit'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/i_Bagaimana Kondisi Barang Jaminan Kredit A_936278'))

WebUI.setText(findTestObject('Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), '6002522760000024')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/input_sudah Tidak Ada lagi (dijualhilang)_k_705d5c'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/i_Bagaimana Kondisi Barang Jaminan Kredit A_936278'))

WebUI.setText(findTestObject('Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), '6002522760000024')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Perdagangan_jenisUsaha'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Pilih rincian jenis usaha yang anda jal_8d36fd'))

WebUI.setText(findTestObject('Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), '6002522760000024')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Supplier Pakaian_rincianJenisUsaha'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Pilih rincian jenis usaha yang anda jal_8d36fd'))

WebUI.setText(findTestObject('Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), '6002522760000024')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Pendidikan_penggunaanDana'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Pilih rincian jenis usaha yang anda jal_8d36fd'))

WebUI.setText(findTestObject('Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), '6002522760000024')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Distribusi penjualan terganggu_dampakPandemi'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Pilih rincian jenis usaha yang anda jal_8d36fd'))

WebUI.setText(findTestObject('Page_PRIME  Pengajuan Restrukturisasi/input_Nomor Kredit_nomorKredit'), '6002522760000024')

WebUI.sendKeys(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Masih berlangsung, namun menurun Ditu_8141f2'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/input__input-421'), 
    '2.000.0000')

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Berapakah jumlah pendapatan anda per _2df2ad'), 
    '35.000.000')

WebUI.setText(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/input_Berapakah rata - rata jumlah pengelua_59ab20'), 
    '25.000.000')

WebUI.click(findTestObject('Object Repository/pengajuan_non gadai/Page_PRIME  Pengajuan Restrukturisasi/div_Detail PengajuanDetail WawancaraINQUIRY_52785f'))

WebUI.closeBrowser()

