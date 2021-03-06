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

WebUI.openBrowser(GlobalVariable.url_catalog)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Catalog/item1'))

WebUI.click(findTestObject('Page_Product_Detail/color_ls_green'))

WebUI.click(findTestObject('Page_Product_Detail/color_green'))

WebUI.doubleClick(findTestObject('Page_Product_Detail/increase_amount'))

WebUI.click(findTestObject('Page_Product_Detail/add_item'))

WebUI.click(findTestObject('Page_Product_Detail/cart'))

WebUI.delay(2)

WebUI.clearText(findTestObject('Page_Cart/amount'))

WebUI.delay(6)

WebUI.setText(findTestObject('Page_Cart/amount'), '119')

WebUI.waitForPageLoad(4)

WebUI.click(findTestObject('Page_Cart/shipping'))

WebUI.delay(2)

WebUI.closeBrowser()

